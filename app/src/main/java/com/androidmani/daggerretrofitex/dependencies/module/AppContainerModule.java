package com.androidmani.daggerretrofitex.dependencies.module;

import android.app.Application;

import com.androidmani.daggerretrofitex.utils.Utilities;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppContainerModule {

    @Provides
    @Singleton
    Utilities providesUtilites(Application application) {
        return new Utilities(application);
    }

}
