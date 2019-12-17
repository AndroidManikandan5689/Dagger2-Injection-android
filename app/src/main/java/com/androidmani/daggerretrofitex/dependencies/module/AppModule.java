package com.androidmani.daggerretrofitex.dependencies.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final Application application;

    public AppModule(Application app) {
        this.application = app;
    }

    @Provides
    @Singleton
    public Application getApplication() {
        return application;
    }
}
