package org.sticollegeandroidprojects.dictionary.ViewModel;

import android.app.Application;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import org.sticollegeandroidprojects.applicationdriver.AppDriver;
import org.sticollegeandroidprojects.applicationdriver.Repository.FactoryPYSD;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.BWord;

import java.util.List;

public class VMBookmarks extends AndroidViewModel {
    private static final String TAG = VMBookmarks.class.getSimpleName();

    private final FactoryPYSD poSys;

    public interface OnSaveWordListener{
        void OnSave(String args);
        void OnFailed(String message);
    }

    public interface OnRemoveBookmarkListener{
        void OnRemove(String args);
        void OnFailed(String message);
    }

    public VMBookmarks(@NonNull Application application) {
        super(application);
        this.poSys = new AppDriver(application).InitializeObject(AppDriver.Instance.BOOKMARK);
    }

    public LiveData<List<BWord.Bookmark>> GetBookmarkList(int params){
        return poSys.GetBookmarkList(params, "ALPHA");
    }

    public void RemoveBookmark(String args, OnRemoveBookmarkListener listener){
        new RemoveBookmarkTask(listener).execute(args);
    }

    private class RemoveBookmarkTask extends AsyncTask<String, Void, Boolean>{

        private final OnRemoveBookmarkListener listener;

        private String message;

        public RemoveBookmarkTask(OnRemoveBookmarkListener listener) {
            this.listener = listener;
        }

        @Override
        protected Boolean doInBackground(String... strings) {
            if(!poSys.Delete(strings[0])){
                message = poSys.getMessage();
                return false;
            }
            return true;
        }

        @Override
        protected void onPostExecute(Boolean isSuccess) {
            super.onPostExecute(isSuccess);
            if(!isSuccess){
                listener.OnFailed(message);
            } else {
                listener.OnRemove("A favorite has been removed");
            }
        }
    }

    public void SaveRecent(String args, OnSaveWordListener listener){
        new SaveRecentTask(listener).execute(args);
    }

    private class SaveRecentTask extends AsyncTask<String, Void, Boolean>{

        private final OnSaveWordListener listener;

        private String message;

        public SaveRecentTask(OnSaveWordListener listener) {
            this.listener = listener;
        }

        @Override
        protected Boolean doInBackground(String... strings) {
            if(!poSys.SaveRecent(strings[0])){
                message = poSys.getMessage();
                return false;
            }
            return true;
        }

        @Override
        protected void onPostExecute(Boolean isSuccess) {
            super.onPostExecute(isSuccess);
            if(!isSuccess){
                listener.OnSave("");
            } else {
                listener.OnFailed(message);
            }
        }
    }
}