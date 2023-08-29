package org.sticollegeandroidprojects.applicationdriver.database;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import org.sticollegeandroidprojects.applicationdriver.database.Dao.BWord;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.DWord;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.RWord;
import org.sticollegeandroidprojects.applicationdriver.database.Dao.TWord;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.EBookmarkWord;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.EDictionaryWords;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.ERecentWord;
import org.sticollegeandroidprojects.applicationdriver.database.Entity.ETrivia;

@Database(entities = {
        EDictionaryWords.class,
        ERecentWord.class,
        EBookmarkWord.class,
        ETrivia.class}, version = 1, exportSchema = false)
public abstract class AppData extends RoomDatabase{
    private static final String TAG = AppData.class.getSimpleName();
    private static AppData instance;

    public abstract DWord dictionary();
    public abstract RWord recent();
    public abstract BWord bookmark();
    public abstract TWord trivia();

    public static synchronized AppData getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    AppData.class, "PYSD_SysDbf.db")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .addCallback(new RoomDatabase.Callback() {
                        @Override
                        public void onCreate(@NonNull SupportSQLiteDatabase db) {
                            super.onCreate(db);
                            Log.d(TAG, "SQLite Room database has been initialized.");
                        }
                    })
                    .build();
        }
        return instance;
    }
}
