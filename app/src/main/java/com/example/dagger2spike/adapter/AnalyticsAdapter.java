package com.example.dagger2spike.adapter;

import com.example.dagger2spike.service.AnalyticsService;

import javax.inject.Inject;


public class AnalyticsAdapter {

    private final AnalyticsService analyticsService;

    @Inject
    public AnalyticsAdapter(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }

    public String getStatus() {
        return analyticsService.getStatus();
    }
}
