package com.aloineinc.jesusify;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aloineinc.jesusify.mainscreen.FragmentCategories;
import com.aloineinc.jesusify.mainscreen.FragmentMostrecent;
import com.aloineinc.jesusify.mainscreen.FragmentPastor;
import com.aloineinc.jesusify.mainscreen.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        tabLayout = findViewById(R.id.tablayout_id);
        viewPager = findViewById(R.id.viewpager_id);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());


        viewPagerAdapter.addFragment(new FragmentMostrecent(), "Most Recent");
        viewPagerAdapter.addFragment(new FragmentPastor(),"Pastor");
        viewPagerAdapter.addFragment(new FragmentCategories(),"Categories");


        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
