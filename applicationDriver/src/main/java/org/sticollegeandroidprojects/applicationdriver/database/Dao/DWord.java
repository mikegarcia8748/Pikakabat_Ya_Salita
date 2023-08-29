package org.sticollegeandroidprojects.applicationdriver.database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import org.sticollegeandroidprojects.applicationdriver.database.Entity.EBookmarkWord;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.ERecentWord;

import java.util.List;

@Dao
public interface DWord {

    @Insert
    void Save(EDictionaryWords args);

    @Insert
    void Save(EBookmarkWord args);

    @Insert
    void Save(ERecentWord args);

    @Query("SELECT * FROM Bookmarked_Words WHERE sWordIDxx=:args")
    EBookmarkWord GetBookmark(String args);

    @Query("SELECT * FROM Recent_Words WHERE sWordIDxx=:args")
    ERecentWord GetRecent(String args);

    @Query("SELECT * FROM Dictionary_Words WHERE sWordName=:args")
    EDictionaryWords GetDictionaryWord(String args);

    @Update
    void Update(EDictionaryWords args);

    @Update
    void Update(ERecentWord args);

    @Query("SELECT COUNT(*) FROM Dictionary_Words")
    int GetRowsCountForID();

    @Query("SELECT * FROM Dictionary_Words WHERE sWordIDxx=:args")
    LiveData<EDictionaryWords> GetWordDetail(String args);

    @Query("SELECT * FROM Dictionary_Words WHERE nDctnryTp =:args ORDER BY sWordName ASC")
    LiveData<List<EDictionaryWords>> GetWordList(int args);

    @Query("SELECT * FROM Bookmarked_Words WHERE sWordIDxx =:args ORDER BY dTimeStmp")
    LiveData<BWord.Bookmark> GetBookmarkWord(String args);

    @Query("SELECT " +
            "a.sWordIDxx, " +
            "b.sWordName " +
            "FROM Recent_Words a " +
            "LEFT JOIN Dictionary_Words b " +
            "ON a.sWordIDxx = b.sWordIDxx " +
            "WHERE b.nDctnryTp =:args " +
            "ORDER BY a.dTimeStmp DESC")
    LiveData<List<RWord.RecentWord>> GetRecentList(int args);
}
