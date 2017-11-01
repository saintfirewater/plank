package com.teamnexters.plank.activity;

import android.app.Activity;
import android.os.Bundle;
import android.databinding.DataBindingUtil;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.teamnexters.plank.R;
import com.teamnexters.plank.databinding.ActivityLoginBinding;

public class LoginActivity extends Activity {

    ActivityLoginBinding activityLoginBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);



        Glide.with(this).load(R.drawable.logotype).into(activityLoginBinding.loginLogo);
    }
}
