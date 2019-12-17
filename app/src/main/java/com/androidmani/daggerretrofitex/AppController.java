package com.androidmani.daggerretrofitex;

import android.app.Application;

import com.androidmani.daggerretrofitex.dependencies.component.AppComponent;
import com.androidmani.daggerretrofitex.dependencies.component.DaggerAppComponent;
import com.androidmani.daggerretrofitex.dependencies.module.AppModule;

public class AppController extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this)) //Set application module
                .build();
    }

    public static AppComponent getAppComponent()
    {
        return appComponent;
    }
}
