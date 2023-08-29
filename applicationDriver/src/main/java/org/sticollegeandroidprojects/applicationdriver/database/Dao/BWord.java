package org.sticollegeandroidprojects.applicationdriver.database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import org.sticollegeandroidprojects.applicationdriver.database.Entity.EBookmarkWord;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.ERecentWord;

import java.util.List;

@Dao
public interface BWord {

    @Insert
    void Save(EBookmarkWord args);

    @Update
    void Update(EBookmarkWord args);

    @Insert
    void Save(ERecentWord args);

    @Update
    void Update(ERecentWord args);

    @Query("DELETE FROM Bookmarked_Words WHERE sWordIDxx=:args")
    void Delete(String args);

    @Query("SELECT * FROM Recent_Words WHERE sWordIDxx=:args")
    ERecentWord GetRecent(String args);

    @Query("SELECT * FROM Bookmarked_Words WHERE sWordIDxx=:args ORDER BY dTimeStmp")
    EBookmarkWord GetBookmark(String args);

    @Query("SELECT " +
            "a.sWordIDxx, " +
            "b.sWordName " +
            "FROM Bookmarked_Words a " +
            "LEFT JOIN Dictionary_Words b " +
            "ON a.sWordIDxx = b.sWordIDxx " +
            "WHERE b.nDctnryTp =:args " +
            "ORDER BY a.dTimeStmp DESC")
    LiveData<List<Bookmark>> GetRecentlyBookmarked(int args);

    @Query("SELECT " +
            "a.sWordIDxx, " +
            "b.sWordName " +
            "FROM Bookmarked_Words a " +
            "LEFT JOIN Dictionary_Words b " +
            "ON a.sWordIDxx = b.sWordIDxx " +
            "WHERE b.nDctnryTp =:args " +
            "ORDER BY b.sWordName ASC")
    LiveData<List<Bookmark>> GetBookmarkedAlphabetical(int args);

    class Bookmark{
        public String sWordIDxx;
        public String sWordName;
    }
}
