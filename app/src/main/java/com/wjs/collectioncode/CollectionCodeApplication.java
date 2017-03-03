package com.wjs.collectioncode;

import android.app.Application;
import android.content.Context;

/**
 * Created by ${wangjishan} on 2017/3/2.
 *
 * @version V1.0
 * @Description:
 */

public class CollectionCodeApplication extends Application {

    public static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this.getApplicationContext();
    }

    public static Context getAppContext() {
        return sContext;
    }
}

