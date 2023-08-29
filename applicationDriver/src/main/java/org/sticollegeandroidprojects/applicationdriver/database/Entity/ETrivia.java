package org.sticollegeandroidprojects.applicationdriver.database.Entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Trivia_Words")
public class ETrivia {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "sWordIDxx")
    private String WordIDxx;
    @ColumnInfo(name = "sWordName")
    private String WordName = "";
    @ColumnInfo(name = "sImgLinkx")
    private String ImgLinkx = "";
    @ColumnInfo(name = "sInfoxxxx")
    private String Infoxxxx = "";
    @ColumnInfo(name = "dModified")
    private String Modified = "";
    @ColumnInfo(name = "dTimeStmp")
    private String TimeStmp = "";

    public ETrivia() {
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

    public String getImgLinkx() {
        return ImgLinkx;
    }

    public void setImgLinkx(String imgLinkx) {
        ImgLinkx = imgLinkx;
    }
}
