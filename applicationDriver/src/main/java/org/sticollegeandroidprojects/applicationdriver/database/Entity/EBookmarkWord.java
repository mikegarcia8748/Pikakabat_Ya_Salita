package org.sticollegeandroidprojects.applicationdriver.database.Entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.sticollegeandroidprojects.applicationdriver.Etc.Constants;

@Entity(tableName = "Bookmarked_Words")
public class EBookmarkWord {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "sWordIDxx")
    private String WordIDxx;
    @ColumnInfo(name = "sInfoxxxx")
    private String Infoxxxx = "";
    @ColumnInfo(name = "dModified")
    private String Modified = "";
    @ColumnInfo(name = "dTimeStmp")
    private String TimeStmp = new Constants().DATE_MODIFIED;

    public EBookmarkWord() {
    }

    @NonNull
    public String getWordIDxx() {
        return WordIDxx;
    }

    public void setWordIDxx(@NonNull String wordIDxx) {
        WordIDxx = wordIDxx;
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
}
