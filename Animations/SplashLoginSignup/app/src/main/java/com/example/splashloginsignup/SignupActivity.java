package com.example.splashloginsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class SignupActivity extends AppCompatActivity {

    TextInputLayout username,number,email,fullname;
    Button callLogin;

    Animation left_anim_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        username = findViewById(R.id.username);
        number = findViewById(R.id.number);
        fullname = findViewById(R.id.fullname);
        email = findViewById(R.id.email);
        callLogin = findViewById(R.id.register_btn);

        callLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        left_anim_show = AnimationUtils.loadAnimation(this,R.anim.left_animation_visible);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                fullname.setVisibility(View.VISIBLE);
                number.setVisibility(View.VISIBLE);
                email.setVisibility(View.VISIBLE);
                callLogin.setVisibility(View.VISIBLE);
                callLogin.setAnimation(left_anim_show);

            }
        },200);
    }

    @Override
    public void onBackPressed() {
        fullname.setVisibility(View.GONE);
        number.setVisibility(View.GONE);
        email.setVisibility(View.GONE);
        super.onBackPressed();

    }
}