package com.example.astyletech.weatherapp.Activities;

import android.os.Bundle;

import com.example.astyletech.weatherapp.R;


public class AboutActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(getToolbarTitle());
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected String getToolbarTitle() {
        return getString(R.string.about_toolbar_title);
    }
}
