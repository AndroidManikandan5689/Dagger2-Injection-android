package com.androidmani.daggerretrofitex.utils;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;

public class Utilities {

    private Application app;

    public Utilities(Application application) {
        this.app = application;
    }

    //Checking for Active Network Connection
    public boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) app.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }
}
