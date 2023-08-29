package org.sticollegeandroidprojects.applicationdriver.Repository;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LiveData;

import org.sticollegeandroidprojects.applicationdriver.Etc.Constants;
import org.sticollegeandroidprojects.applicationdriver.database.AppData;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.BWord;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.EBookmarkWord;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.ERecentWord;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.RWord;

import java.util.List;

public class Bookmark implements FactoryPYSD{
    private static final String TAG = FactoryPYSD.class.getSimpleName();

    private final Context mContext;

    private final BWord poDao;

    private String message;

    public Bookmark(Context context) {
        this.mContext = context;
        this.poDao = AppData.getInstance(mContext).bookmark();
    }

    @Override
    public boolean Save(Object args) {
        message = "No corresponding method is associated with in this object";
        return false;
    }

    @Override
    public boolean SaveRecent(String args) {
        try{
            String WordID = args;

            ERecentWord loDetail = poDao.GetRecent(WordID);

            if(loDetail == null){
                ERecentWord loWord = new ERecentWord();
                loWord.setWordIDxx(WordID);
                loWord.setInfoxxxx("");
                loWord.setModified(new Constants().DATE_MODIFIED);
                poDao.Save(loWord);

                Log.d(TAG, "A new bookmark has been saved!");
                return true;
            }

            loDetail.setModified(new Constants().DATE_MODIFIED);
            loDetail.setTimeStmp(new Constants().DATE_MODIFIED);
            poDao.Update(loDetail);

            message = "Word is already saved!";
            return false;
        } catch (Exception e){
            e.printStackTrace();
            message = e.getMessage();
            return false;
        }
    }

    @Override
    public boolean SaveWord(String args) {
        message = "No corresponding method is associated with in this object";
        return false;
    }

    @Override
    public boolean Delete(String args) {
        try{
            EBookmarkWord loDetail = poDao.GetBookmark(args);

            if(loDetail == null){
                message = "Word you're trying to remove does not exist.";
                return false;
            }

            poDao.Delete(args);
            Log.d(TAG, "A word from bookmark has been removed!");
            return true;
        } catch (Exception e){
            e.printStackTrace();
            message = e.getMessage();
            return false;
        }
    }

    @Override
    public LiveData<List<EDictionaryWords>> SearchWordList(int params, String args) {
        return null;
    }

    @Override
    public LiveData<List<EDictionaryWords>> GetWordsList(int params) {
        return null;
    }

    @Override
    public LiveData<BWord.Bookmark> GetBookmark(String args) {
        return null;
    }

    @Override
    public LiveData<List<BWord.Bookmark>> GetBookmarkList(int params, String args) {
        if(args.equalsIgnoreCase("DESC")){
            return poDao.GetRecentlyBookmarked(params);
        }
        return poDao.GetBookmarkedAlphabetical(params);
    }

    @Override
    public LiveData<List<RWord.RecentWord>> GetRecents(int args) {
        return null;
    }

    @Override
    public LiveData<EDictionaryWords> GetWordDetail(String args) {
        return null;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
