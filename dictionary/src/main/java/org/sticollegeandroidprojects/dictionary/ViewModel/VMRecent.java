package org.sticollegeandroidprojects.dictionary.ViewModel;

import android.app.Application;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import org.sticollegeandroidprojects.applicationdriver.AppDriver;
import org.sticollegeandroidprojects.applicationdriver.Repository.FactoryPYSD;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.RWord;

import java.util.List;

public class VMRecent extends AndroidViewModel {

    private final FactoryPYSD poSys;

    public interface OnSaveWordListener{
        void OnSave(String args);
        void OnFailed(String message);
    }

    public interface OnRemoveWordListener{
        void OnRemoved(String args);
        void OnFailed(String message);
    }

    public VMRecent(@NonNull Application application) {
        super(application);
        this.poSys = new AppDriver(application).InitializeObject(AppDriver.Instance.RECENT);
    }

    public LiveData<List<RWord.RecentWord>> GetRecents(int args){
        return poSys.GetRecents(args);
    }

    public void RemoveWord(String args, OnRemoveWordListener listener){
        new RemoveWordTask(listener).execute(args);
    }

    private class RemoveWordTask extends AsyncTask<String, Void, Boolean>{

        private final OnRemoveWordListener listener;

        private String message;

        public RemoveWordTask(OnRemoveWordListener listener) {
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
                listener.OnRemoved("");
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