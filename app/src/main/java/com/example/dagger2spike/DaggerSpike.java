package com.example.dagger2spike;

import android.app.Application;

import com.example.dagger2spike.dagger.ApplicationComponent;
import com.example.dagger2spike.dagger.DaggerApplicationComponent;

public class DaggerSpike extends Application {

    private static ApplicationComponent applicationComponent = DaggerApplicationComponent.create();

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.create();
    }


    public static ApplicationComponent getAppComponent() {
        return applicationComponent;
    }
}
