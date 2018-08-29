package com.aloineinc.jesusify.mainscreen;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aloineinc.jesusify.R;

public class FragmentCategories extends Fragment {
    View v;

    public FragmentCategories() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.categories_fragment,container,false);
        return v;
    }
}
