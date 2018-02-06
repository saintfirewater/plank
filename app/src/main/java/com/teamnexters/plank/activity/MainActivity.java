package com.teamnexters.plank.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.teamnexters.plank.R;
import com.teamnexters.plank.databinding.ActivityMainBinding;
import com.teamnexters.plank.databinding.BottomNavBarBinding;
import com.teamnexters.plank.databinding.TopBarMainBinding;
import com.teamnexters.plank.util.BottomNavigationViewHelper;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    /* Top Bar */
    @BindView(R.id.top_bar_logo)
    ImageView topBarLogo;
    @BindView(R.id.top_bar_menu_more)
    ImageView topBarMenuMore;

    /* */

    /* Navigation Bar */
    @BindView(R.id.bottom_nav_bar)
    BottomNavigationView bottomNavBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setView();
        BottomNavigationViewHelper.disableShiftMode(bottomNavBar);
    }

    public void setView() {
        ButterKnife.bind(this);

        Glide.with(this).load(R.drawable.logotype).into(topBarLogo);
        Glide.with(this).load(R.drawable.more).into(topBarMenuMore);
    }

    @OnClick(R.id.top_bar_logo)
    public void onTopBarLogoClicked() {

    }

    @OnClick(R.id.top_bar_menu_more)
    public void onTopBarMenuMoreClicked() {

    }
}
