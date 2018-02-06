package com.teamnexters.plank.activity;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.teamnexters.plank.R;
import com.teamnexters.plank.databinding.ActivitySplashBinding;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.teamnexters.plank.util.CommonConstants.ONE_SECOND;

/**
 * Created by Hwasoo.Sung on 2017-10-30.
 */

public class SplashActivity extends Activity{
    @BindView(R.id.splash_icon)
    ImageView splashIcon;

    Handler handler;
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setView();

        createHandler();
        handler.postDelayed(runnable, ONE_SECOND);
    }

    public void setView() {
        ButterKnife.bind(this);
        Glide.with(this).load(R.drawable.mainicon).into(splashIcon);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void createHandler() {
        handler = new Handler();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        handler.removeCallbacks(runnable);
    }
}
