package org.sticollegeandroidprojects.applicationdriver.Repository;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LiveData;

import org.sticollegeandroidprojects.applicationdriver.Etc.Constants;
import org.sticollegeandroidprojects.applicationdriver.database.AppData;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.BWord;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.RWord;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.TWord;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.ETrivia;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Trivia {
    private static final String TAG = Trivia.class.getSimpleName();

    private final Context mContext;
    private final TWord poDao;

    private String message;

    public Trivia(Context context) {
        this.mContext = context;
        this.poDao = AppData.getInstance(mContext).trivia();
    }

    public boolean Save(ETrivia args) {
        try{
            ETrivia loDetail = poDao.GetTriviaWord(args.getWordName());

            if(loDetail != null){
                message = "Trivia word already exist.";
                return false;
            }
            String lsWordID = GenerateUniqueID();
            args.setWordIDxx(lsWordID);
            args.setModified(new Constants().DATE_MODIFIED);
            args.setTimeStmp(new Constants().DATE_MODIFIED);
            poDao.Save(args);
            Log.d(TAG, args.getWordName());
            return true;
        } catch (Exception e){
            e.printStackTrace();
            message = e.getMessage();
            return false;
        }
    }

    public LiveData<ETrivia> GetRandomTrivia(){
        return poDao.GetRandomTrivia();
    }

    public LiveData<ETrivia> GetTriviaDetail(String args){
        return poDao.GetTriviaDetail(args);
    }

    public LiveData<List<ETrivia>> GetAllTrivias(){
        return poDao.GetAllTrivias();
    }

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
