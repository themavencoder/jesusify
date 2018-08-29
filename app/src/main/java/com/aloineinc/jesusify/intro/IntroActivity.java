package com.aloineinc.jesusify.intro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
;

import com.aloineinc.jesusify.R;
import com.aloineinc.jesusify.authentication.SigninActivity;
import com.aloineinc.jesusify.authentication.SignupActivity;
import com.github.paolorotolo.appintro.AppIntro;

public class IntroActivity extends AppCompatActivity  {
    private ViewPager mPager;
    private int[] layouts = {R.layout.firstslide,R.layout.secondslide,R.layout.thirdslide};
    private MpagerAdapter mpagerAdapter;
    private LinearLayout Dots_Layout;
    private ImageView[] dots;
    private Button mSigninbtn, mSignoutbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        init();
        createDots(0);
        pageListener();

    }

    private void init() {
        mPager = findViewById(R.id.viewPager);
        mSigninbtn = findViewById(R.id.btn_signin);
        mSignoutbtn =findViewById(R.id.btn_sign_up);
        mpagerAdapter = new MpagerAdapter(layouts,this);
        mPager.setAdapter(mpagerAdapter);
        Dots_Layout = findViewById(R.id.dotsLayout);

    }

    private void createDots(int current_position) {
        if (Dots_Layout != null) {
            Dots_Layout.removeAllViews();
        }
        dots = new ImageView[layouts.length];
        for (int i = 0; i < layouts.length; i++) {
            dots[i] = new ImageView(this);
            if (i == current_position) {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.active_dots));

            } else {
                dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.inactive_dots));
            }

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(8, 0, 8, 0);

            Dots_Layout.addView(dots[i], params);
        }
    }
    private void pageListener() {
        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                createDots(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

public void login(View v) {
        Intent intent = new Intent(this, SigninActivity.class);
        startActivity(intent);
}

public void logout(View v) {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
}

    }

