package com.androidmani.daggerretrofitex.dependencies.component;

import com.androidmani.daggerretrofitex.dependencies.module.AppContainerModule;
import com.androidmani.daggerretrofitex.dependencies.module.AppModule;
import com.androidmani.daggerretrofitex.utils.Utilities;
import com.androidmani.daggerretrofitex.view.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton  //Singleton annotation
@Component(modules = {AppModule.class, AppContainerModule.class})    //Dagger component annotation
public interface AppComponent {
    //Activity
    void inject(MainActivity mainActivity);     //injected mainactivity class

}
