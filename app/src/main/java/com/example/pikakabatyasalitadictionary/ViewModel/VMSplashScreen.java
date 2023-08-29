package com.example.pikakabatyasalitadictionary.ViewModel;

import android.app.Application;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import org.sticollegeandroidprojects.applicationdriver.AppDriver;
import org.sticollegeandroidprojects.applicationdriver.Etc.InitializeData;
import org.sticollegeandroidprojects.applicationdriver.Repository.FactoryPYSD;
import org.sticollegeandroidprojects.applicationdriver.Repository.Trivia;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.ETrivia;

import java.util.List;

public class VMSplashScreen extends AndroidViewModel {
    private static final String TAG = VMSplashScreen.class.getSimpleName();

    //Declaration
    private final FactoryPYSD poSys;
    private final Trivia poTrivia;

    public VMSplashScreen(@NonNull Application application) {
        super(application);
        //Initialization
        this.poSys = new AppDriver(application).InitializeObject(AppDriver.Instance.DICTIONARY);
        this.poTrivia = new Trivia(application);
        new SaveDataTask().execute();
    }

    private class SaveDataTask extends AsyncTask<String, Void, Boolean>{

        @Override
        protected Boolean doInBackground(String... strings) {
            InitializeData loData = new InitializeData();
            loData.InitializeWords();
            List<EDictionaryWords> loList = loData.GetWordsList();

            for(int x = 0; x < loList.size(); x++){
                EDictionaryWords loDetail = loList.get(x);
                poSys.Save(loDetail);
            }

            List<ETrivia> loTrivia = loData.GetTriviaList();
            for(int x = 0; x < loTrivia.size(); x++){
                ETrivia loDetail = loTrivia.get(x);
                poTrivia.Save(loDetail);
            }
            return null;
        }
    }
}
