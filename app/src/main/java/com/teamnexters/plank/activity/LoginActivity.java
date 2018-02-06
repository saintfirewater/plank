package com.teamnexters.plank.activity;

import android.app.Activity;
import android.os.Bundle;
import android.databinding.DataBindingUtil;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.teamnexters.plank.R;
import com.teamnexters.plank.databinding.ActivityLoginBinding;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends Activity {
    @BindView(R.id.login_logo)
    ImageView loginLogo;
    @BindView(R.id.login_withfacebook)
    TextView loginWithFacebook;
    @BindView(R.id.login_signupplank)
    TextView signUp;
    @BindView(R.id.login_signin)
    TextView signIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setView();
    }

    public void setView() {
        ButterKnife.bind(this);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Glide.with(this).load(R.drawable.logotype).into(loginLogo);
    }

    @OnClick(R.id.login_logo)
    void onLoginLogoClicked() {
        // designer, developers
    }

    @OnClick(R.id.login_withfacebook)
    void onLoginWithFacebookClicked() {

    }
    @OnClick(R.id.login_signupplank)
    void onSignUpClicked() {

    }
    @OnClick(R.id.login_signin)
    void onSignInClicked() {

    }
}
