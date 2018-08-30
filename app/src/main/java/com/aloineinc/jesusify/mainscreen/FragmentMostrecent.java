package com.aloineinc.jesusify.mainscreen;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aloineinc.jesusify.R;
import com.aloineinc.jesusify.mainscreen.mostrecent.Datas;
import com.aloineinc.jesusify.mainscreen.mostrecent.MostRecentModel;
import com.aloineinc.jesusify.mainscreen.mostrecent.MostRecentRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentMostrecent extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<MostRecentModel> listModel;


    public FragmentMostrecent() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.mostrecent_fragment,container,false);
        recyclerView = v.findViewById(R.id.mostrecent_recyclerview);
        MostRecentRecyclerViewAdapter madapter = new MostRecentRecyclerViewAdapter(getContext(),listModel);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(madapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listModel = new ArrayList<>();
        Datas.getModel(listModel);
        getModel(listModel);





    }

    private void getModel(List<MostRecentModel> listModel) {

    }
}
