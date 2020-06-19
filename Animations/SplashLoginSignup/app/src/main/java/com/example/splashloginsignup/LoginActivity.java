package com.example.splashloginsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    Button callSignUp, login,forgotPass;
    ImageView logoImg;
    TextView logoText, logoSlogan;
    TextInputLayout username,password;

    Animation leftAnim;
    Animation rightAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        callSignUp = findViewById(R.id.register_btn);
        login = findViewById(R.id.login_btn);
        logoImg = findViewById(R.id.app_logo);
        logoText = findViewById(R.id.tv1);
        logoSlogan = findViewById(R.id.tv2);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        forgotPass = findViewById(R.id.forgot_password_btn);

        leftAnim = AnimationUtils.loadAnimation(this,R.anim.left_animation_fade);
        rightAnim = AnimationUtils.loadAnimation(this,R.anim.right_animation_visible_300);





        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                showViews();
            }
        },500);



        // Hide status bar
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private void showViews() {

        username.startAnimation(rightAnim);
        username.setVisibility(View.VISIBLE);

        password.startAnimation(rightAnim);
        password.setVisibility(View.VISIBLE);

        forgotPass.startAnimation(rightAnim);
        forgotPass.setVisibility(View.VISIBLE);

        login.startAnimation(rightAnim);
        login.setVisibility(View.VISIBLE);

        callSignUp.startAnimation(rightAnim);
        callSignUp.setVisibility(View.VISIBLE);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void signup(View view) {
        Intent intent = new Intent(LoginActivity.this,SignupActivity.class);
        supportStartPostponedEnterTransition();
        Pair[] pairs = new Pair[5];
        //pairs[0] = new Pair<View,String>(callSignUp,"signup_txn");
        pairs[0] = new Pair<View,String>(login,"login_txn");
        pairs[1] = new Pair<View,String>(logoImg,"logo_image");
        pairs[2] = new Pair<View,String>(logoText,"logo_text");
        pairs[3] = new Pair<View,String>(username,"username_txn");
        pairs[4] = new Pair<View,String>(password,"password_txn");

        callSignUp.startAnimation(leftAnim);
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(LoginActivity.this,pairs);
        startActivity(intent,options.toBundle());

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}