package org.sticollegeandroidprojects.applicationdriver.database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import org.sticollegeandroidprojects.applicationdriver.database.Entity.ERecentWord;

import java.util.List;

@Dao
public interface RWord {

    @Insert
    void Save(ERecentWord args);

    @Update
    void Update(ERecentWord args);

    @Query("DELETE FROM Recent_Words WHERE sWordIDxx=:args")
    void Delete(String args);

    @Query("SELECT * FROM Recent_Words WHERE sWordIDxx=:args")
    ERecentWord GetRecent(String args);

    @Query("SELECT " +
            "a.sWordIDxx, " +
            "b.sWordName " +
            "FROM Recent_Words a " +
            "LEFT JOIN Dictionary_Words b " +
            "ON a.sWordIDxx = b.sWordIDxx " +
            "WHERE b.nDctnryTp =:args " +
            "ORDER BY a.dTimeStmp DESC")
    LiveData<List<RecentWord>> GetWordList(int args);

    class RecentWord{
        public String sWordIDxx;
        public String sWordName;
    }
}
