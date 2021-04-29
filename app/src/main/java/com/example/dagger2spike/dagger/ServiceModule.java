package com.example.dagger2spike.dagger;

import com.example.dagger2spike.service.AnalyticsService;
import com.example.dagger2spike.service.impl.AnalyticsServiceImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ServiceModule {

    @Provides
    @Singleton
    public AnalyticsService analyticsService() {
        return new AnalyticsServiceImpl();
    }
}
