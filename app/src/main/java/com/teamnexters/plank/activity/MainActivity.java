package com.teamnexters.plank.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.teamnexters.plank.R;
import com.teamnexters.plank.databinding.ActivityMainBinding;
import com.teamnexters.plank.databinding.BottomNavBarBinding;
import com.teamnexters.plank.databinding.TopBarMainBinding;
import com.teamnexters.plank.util.BottomNavigationViewHelper;

public class MainActivity extends Activity {

    ActivityMainBinding activityMainBinding;
    TopBarMainBinding topBarMainBinding;
    BottomNavBarBinding bottomNavBarBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        topBarMainBinding = DataBindingUtil.setContentView(this, R.layout.top_bar_main);


        bottomNavBarBinding = DataBindingUtil.setContentView(this, R.layout.bottom_nav_bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavBarBinding.bottomNavBar);


        Glide.with(this).load(R.drawable.logotype).into(topBarMainBinding.mainbarLogo);
        Glide.with(this).load(R.drawable.more).into(topBarMainBinding.mainbarMenuMore);



    }
}
