package org.sticollegeandroidprojects.applicationdriver.database.Entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.sticollegeandroidprojects.applicationdriver.Etc.Constants;

@Entity(tableName = "Dictionary_Words")
public class EDictionaryWords {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "sWordIDxx")
    private String WordIDxx;
    @ColumnInfo(name = "sWordName")
    private String WordName = "";
    @ColumnInfo(name = "sPrnction")
    private String Prnction = "";
    @ColumnInfo(name = "sWordType")
    private String WordType = "";
    @ColumnInfo(name = "sDescript")
    private String Descript = "";
    @ColumnInfo(name = "sTransLte")
    private String TransLte = "";
    @ColumnInfo(name = "sTriviaID")
    private String TriviaID = "";
    @ColumnInfo(name = "sTriviaxx")
    private String Triviaxx = "";
    @ColumnInfo(name = "sInfoxxxx")
    private String Infoxxxx = "";
    @ColumnInfo(name = "nDctnryTp")
    private Integer DctnryTp = 0;
    @ColumnInfo(name = "dModified")
    private String Modified = "";
    @ColumnInfo(name = "dTimeStmp")
    private String TimeStmp = new Constants().DATE_MODIFIED;

    public EDictionaryWords() {
    }

    @NonNull
    public String getWordIDxx() {
        return WordIDxx;
    }

    public void setWordIDxx(@NonNull String wordIDxx) {
        WordIDxx = wordIDxx;
    }

    public String getWordName() {
        return WordName;
    }

    public void setWordName(String wordName) {
        WordName = wordName;
    }

    public String getDescript() {
        return Descript;
    }

    public void setDescript(String descript) {
        Descript = descript;
    }

    public String getTransLte() {
        return TransLte;
    }

    public void setTransLte(String transLte) {
        TransLte = transLte;
    }

    public String getTriviaID() {
        return TriviaID;
    }

    public void setTriviaID(String triviaID) {
        TriviaID = triviaID;
    }

    public String getTriviaxx() {
        return Triviaxx;
    }

    public void setTriviaxx(String triviaxx) {
        Triviaxx = triviaxx;
    }

    public String getInfoxxxx() {
        return Infoxxxx;
    }

    public void setInfoxxxx(String infoxxxx) {
        Infoxxxx = infoxxxx;
    }

    public String getModified() {
        return Modified;
    }

    public void setModified(String modified) {
        Modified = modified;
    }

    public String getTimeStmp() {
        return TimeStmp;
    }

    public void setTimeStmp(String timeStmp) {
        TimeStmp = timeStmp;
    }

    public String getPrnction() {
        return Prnction;
    }

    public void setPrnction(String prnction) {
        Prnction = prnction;
    }

    public String getWordType() {
        return WordType;
    }

    public void setWordType(String wordType) {
        WordType = wordType;
    }

    public Integer getDctnryTp() {
        return DctnryTp;
    }

    public void setDctnryTp(Integer dctnryTp) {
        DctnryTp = dctnryTp;
    }

}
