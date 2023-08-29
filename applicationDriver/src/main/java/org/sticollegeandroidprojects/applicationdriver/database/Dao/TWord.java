package org.sticollegeandroidprojects.applicationdriver.database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import org.sticollegeandroidprojects.applicationdriver.database.Entity.ETrivia;

import java.util.List;

@Dao
public interface TWord {

    @Insert
    void Save(ETrivia args);

    @Query("SELECT * FROM Trivia_Words WHERE sWordName=:args")
    ETrivia GetTriviaWord(String args);

    //Nested SQl Select Statement
    @Query("SELECT * FROM Trivia_Words " +
            "WHERE sWordIDxx =(SELECT sWordIDxx FROM Trivia_Words ORDER BY RANDOM() LIMIT 1)")
    LiveData<ETrivia> GetRandomTrivia();

    @Query("SELECT * FROM Trivia_Words WHERE sWordIDxx=:args")
    LiveData<ETrivia> GetTriviaDetail(String args);

    @Query("SELECT * FROM Trivia_Words ORDER BY sWordName ASC")
    LiveData<List<ETrivia>> GetAllTrivias();

    @Query("SELECT COUNT(*) FROM Trivia_Words")
    int GetRowsCountForID();
}
