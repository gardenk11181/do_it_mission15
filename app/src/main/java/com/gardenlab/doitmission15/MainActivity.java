package com.gardenlab.doitmission15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout userInfo;
    Animation leftAnimation;
    Animation rightAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInfo = findViewById(R.id.userInfo);

        leftAnimation = AnimationUtils.loadAnimation(this,R.anim.to_left);
        rightAnimation = AnimationUtils.loadAnimation(this,R.anim.to_right);



        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInfo.setVisibility(View.VISIBLE);
                userInfo.startAnimation(leftAnimation);
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInfo.startAnimation(rightAnimation);
            }
        });

    }
}
