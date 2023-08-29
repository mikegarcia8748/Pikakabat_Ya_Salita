package org.sticollegeandroidprojects.applicationdriver.Repository;

import androidx.lifecycle.LiveData;

import org.sticollegeandroidprojects.applicationdriver.database.Dao.BWord;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.RWord;

import java.util.List;

public interface FactoryPYSD {


    //Abstraction
    boolean Save(Object args);
    boolean SaveRecent(String args);
    boolean SaveWord(String args);
    boolean Delete(String args);
    LiveData<List<EDictionaryWords>> SearchWordList(int params, String args); //For Dictionary Only
    LiveData<List<EDictionaryWords>> GetWordsList(int params); //For Dictionary Only
    LiveData<BWord.Bookmark> GetBookmark(String args); //For Dictionary Only
    LiveData<List<BWord.Bookmark>> GetBookmarkList(int params, String args); //For Bookmark Only
    LiveData<List<RWord.RecentWord>> GetRecents(int args); //For Dictionary and Recent Only
    LiveData<EDictionaryWords> GetWordDetail(String args); //For Dictionary Only

    String getMessage();
}
