package com.example.pikakabatyasalitadictionary.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import org.sticollegeandroidprojects.applicationdriver.Repository.Trivia;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.ETrivia;

public class VMDashboard extends AndroidViewModel {
    private static final String TAG = VMDashboard.class.getSimpleName();

    private final Trivia poSys;

    public VMDashboard(@NonNull Application application) {
        super(application);
        this.poSys = new Trivia(application);
    }

    public LiveData<ETrivia> GetTrivia(){
        return poSys.GetRandomTrivia();
    }
}