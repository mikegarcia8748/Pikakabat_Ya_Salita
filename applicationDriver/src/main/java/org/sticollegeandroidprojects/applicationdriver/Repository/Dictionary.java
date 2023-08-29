package org.sticollegeandroidprojects.applicationdriver.Repository;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LiveData;

import org.sticollegeandroidprojects.applicationdriver.Etc.Constants;
import org.sticollegeandroidprojects.applicationdriver.database.AppData;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.BWord;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.DWord;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.EBookmarkWord;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.ERecentWord;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.RWord;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Dictionary implements FactoryPYSD{
    private static final String TAG = Dictionary.class.getSimpleName();

    private final Context mContext;

    private final DWord poDao;

    private String message;

    public Dictionary(Context context) {
        this.mContext = context;
        this.poDao = AppData.getInstance(mContext).dictionary();
    }

    @Override
    public boolean Save(Object args) {
        try{
            EDictionaryWords loDetail = (EDictionaryWords) args;

            EDictionaryWords loExist = poDao.GetDictionaryWord(loDetail.getWordName());

            if(loExist != null){
                message = "This word is already exist in local dictionary.";
                return false;
            }

            String lsTransNox = GenerateUniqueID();
            loDetail.setWordIDxx(lsTransNox);
            loDetail.setModified(new Constants().DATE_MODIFIED);
            poDao.Save(loDetail);
            message = "New record saved!";
            return true;
        } catch (Exception e){
            e.printStackTrace();
            message = e.getMessage();
            return false;
        }
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
            return true;
        } catch (Exception e){
            e.printStackTrace();
            message = e.getMessage();
            return false;
        }
    }

    @Override
    public boolean SaveWord(String args) {
        try{
            String WordID = args;

            EBookmarkWord loDetail = poDao.GetBookmark(WordID);

            if(loDetail == null){
                EBookmarkWord loWord = new EBookmarkWord();
                loWord.setWordIDxx(WordID);
                loWord.setInfoxxxx("");
                loWord.setModified(new Constants().DATE_MODIFIED);
                poDao.Save(loWord);

                Log.d(TAG, "A new bookmark has been saved!");
                return true;
            }

            message = "Word is already saved!";
            return false;
        } catch (Exception e){
            e.printStackTrace();
            message = e.getMessage();
            return false;
        }
    }

    @Override
    public boolean Delete(String args) {
        message = "No corresponding method is associated with in this object";
        return false;
    }

    @Override
    public LiveData<List<EDictionaryWords>> SearchWordList(int params, String args) {
        return poDao.GetWordList(params);
    }

    @Override
    public LiveData<List<EDictionaryWords>> GetWordsList(int params) {
        return poDao.GetWordList(params);
    }

    @Override
    public LiveData<BWord.Bookmark> GetBookmark(String args) {
        return poDao.GetBookmarkWord(args);
    }

    @Override
    public LiveData<List<BWord.Bookmark>> GetBookmarkList(int params, String args) {
        return null;
    }

    @Override
    public LiveData<List<RWord.RecentWord>> GetRecents(int params) {
        return poDao.GetRecentList(params);
    }

    @Override
    public LiveData<EDictionaryWords> GetWordDetail(String args) {
        return poDao.GetWordDetail(args);
    }

    @Override
    public String getMessage() {
        return message;
    }

    private String GenerateUniqueID(){
        try{
            String lsUniqIDx = "";
            try{
                String lsBranchCd = "PSYD";
                String lsCrrYear = new SimpleDateFormat("yy", Locale.getDefault()).format(new Date());
                StringBuilder loBuilder = new StringBuilder(lsBranchCd);
                loBuilder.append(lsCrrYear);

                int lnLocalID = poDao.GetRowsCountForID() + 1;
                String lsPadNumx = String.format("%05d", lnLocalID);
                loBuilder.append(lsPadNumx);
                lsUniqIDx = loBuilder.toString();
            } catch (Exception e){
                e.printStackTrace();
                Log.e(TAG, e.getMessage());
            }
            Log.d(TAG, lsUniqIDx);
            return lsUniqIDx;
        } catch (Exception e){
            e.printStackTrace();
            message = e.getMessage();
            return null;
        }
    }
}
