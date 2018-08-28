package com.aloineinc.jesusify;

import android.app.Application;
import android.graphics.Typeface;
import android.support.v4.graphics.TypefaceCompatUtil;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "assets/fonts/bryant_regular.ttf");
    }
}
