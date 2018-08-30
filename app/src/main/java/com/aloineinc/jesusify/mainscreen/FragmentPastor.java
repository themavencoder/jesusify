package com.aloineinc.jesusify.mainscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aloineinc.jesusify.R;
import com.aloineinc.jesusify.mainscreen.pastor.SectionAdapter;
import com.aloineinc.jesusify.mainscreen.pastor.SectionModel;

import java.util.List;

public class FragmentPastor extends android.support.v4.app.Fragment {
    View v;
    private List<SectionModel> sectionList;
    private RecyclerView recyclerView;
    private SectionAdapter sectionAdapter;

    public FragmentPastor() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.pastor_fragment, container, false);



        return v;


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}