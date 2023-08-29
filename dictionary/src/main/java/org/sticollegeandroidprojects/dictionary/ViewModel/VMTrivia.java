package org.sticollegeandroidprojects.dictionary.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import org.sticollegeandroidprojects.applicationdriver.Repository.Trivia;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.ETrivia;

import java.util.List;

public class VMTrivia extends AndroidViewModel {
    private static final String TAG = VMTrivia.class.getSimpleName();

    private final Trivia poSys;

    public VMTrivia(@NonNull Application application) {
        super(application);
        this.poSys = new Trivia(application);
    }

    public LiveData<ETrivia> GetRandomTrivia(){
        return poSys.GetRandomTrivia();
    }

    public LiveData<ETrivia> GetTriviaDetail(String args){
        return poSys.GetTriviaDetail(args);
    }

    public LiveData<List<ETrivia>> GetTriviaList(){
        return poSys.GetAllTrivias();
    }
}