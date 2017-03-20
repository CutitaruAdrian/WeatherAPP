package com.example.astyletech.weatherapp.Activities;

import android.os.Bundle;

import com.example.astyletech.weatherapp.R;

public class AboutActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected String getToolbarTitle() {
        return getString(R.string.about_toolbar_title);
    }

    @Override
    protected int getLayoutId() { return R.layout.activity_about; }
}
