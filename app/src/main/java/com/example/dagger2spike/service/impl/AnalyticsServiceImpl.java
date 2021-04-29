package com.example.dagger2spike.service.impl;

import com.example.dagger2spike.service.AnalyticsService;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AnalyticsServiceImpl implements AnalyticsService {

    @Inject
    public AnalyticsServiceImpl() {
    }

    @Override
    public String getStatus() {
        return "Online";
    }
}
