package org.sticollegeandroidprojects.applicationdriver;

import android.content.Context;

import org.sticollegeandroidprojects.applicationdriver.Repository.Bookmark;
import org.sticollegeandroidprojects.applicationdriver.Repository.Dictionary;
import org.sticollegeandroidprojects.applicationdriver.Repository.FactoryPYSD;
import org.sticollegeandroidprojects.applicationdriver.Repository.Recent;

public class AppDriver {
    private static final String TAG = AppDriver.class.getSimpleName();

    private final Context mContext;

    public AppDriver(Context mContext) {
        this.mContext = mContext;
    }

    public enum Instance{
        DICTIONARY,
        RECENT,
        BOOKMARK
    }

    public FactoryPYSD InitializeObject(Instance instance){
        switch (instance){
            case RECENT:
                return new Recent(mContext);
            case BOOKMARK:
                return new Bookmark(mContext);
            default:
                return new Dictionary(mContext);

        }
    }
}
