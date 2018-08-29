package com.aloineinc.jesusify.mainscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aloineinc.jesusify.R;

public class FragmentPastor extends android.support.v4.app.Fragment {
    View v;

    public FragmentPastor() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.pastor_fragment, container, false);
        return v;

    }

}