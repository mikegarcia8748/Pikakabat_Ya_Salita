package org.sticollegeandroidprojects.dictionary.ViewModel;

import android.app.Application;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import org.sticollegeandroidprojects.applicationdriver.AppDriver;
import org.sticollegeandroidprojects.applicationdriver.Repository.FactoryPYSD;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.BWord;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.RWord;

import java.util.List;

public class VMWordList extends AndroidViewModel {

    private final FactoryPYSD poSys;

    public interface OnSaveWordListener{
        void OnSave(String args);
        void OnFailed(String message);
    }

    public VMWordList(@NonNull Application application) {
        super(application);
        this.poSys = new AppDriver(application).InitializeObject(AppDriver.Instance.DICTIONARY);
    }

    public LiveData<List<EDictionaryWords>> GetWordsList(int type){
        return poSys.GetWordsList(type);
    }

    public LiveData<List<RWord.RecentWord>> GetRecentList(int args){
        return poSys.GetRecents(args);
    }

    public LiveData<EDictionaryWords> GetWordDetail(String args){
        return poSys.GetWordDetail(args);
    }

    public LiveData<BWord.Bookmark> GetBookmarkWord(String args){
        return poSys.GetBookmark(args);
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

    public void SaveWord(String args, OnSaveWordListener listener){
        new SaveWordTask(listener).execute(args);
    }

    private class SaveWordTask extends AsyncTask<String, Void, Boolean>{

        private final OnSaveWordListener listener;

        private String message;

        public SaveWordTask(OnSaveWordListener listener) {
            this.listener = listener;
        }

        @Override
        protected Boolean doInBackground(String... strings) {
            //Background task
            if(!poSys.SaveWord(strings[0])){
                message = poSys.getMessage();
                return false;
            }

            return true;
        }

        @Override
        protected void onPostExecute(Boolean isSuccess) {
            //Foreground task or process to notify UI that a certain
            // background task has finished and has result
            super.onPostExecute(isSuccess);
            if(isSuccess){
                listener.OnSave("args");
            } else {
                listener.OnFailed(message);
            }
        }
    }
}
