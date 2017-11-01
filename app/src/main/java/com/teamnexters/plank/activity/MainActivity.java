package com.teamnexters.plank.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;
import com.teamnexters.plank.R;
import com.teamnexters.plank.databinding.ActivityMainBinding;
import com.teamnexters.plank.databinding.BarMainBinding;

public class MainActivity extends Activity {

    ActivityMainBinding activityMainBinding;
    BarMainBinding barMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        barMainBinding = DataBindingUtil.setContentView(this, R.layout.bar_main);

        Glide.with(this).load(R.drawable.logotype).into(barMainBinding.mainbarLogo);
        Glide.with(this).load(R.drawable.more).into(barMainBinding.mainbarMenuMore);

    }
}
