package com.example.dagger2spike.dagger;

import com.example.dagger2spike.adapter.AnalyticsAdapter;
import com.example.dagger2spike.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ServiceModule.class)
public interface ApplicationComponent {

    AnalyticsAdapter useAnalyticsAdapter();

    void inject(MainActivity mainActivity);
}
