package com.example.dagger2spike.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.dagger2spike.DaggerSpike;
import com.example.dagger2spike.R;
import com.example.dagger2spike.adapter.AnalyticsAdapter;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    AnalyticsAdapter analyticsAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerSpike.getAppComponent().inject(this);

        TextView textView = findViewById(R.id.greeting);

        textView.setText(analyticsAdapter.getStatus());
    }
}