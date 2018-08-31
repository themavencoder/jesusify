package com.aloineinc.jesusify.mainscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aloineinc.jesusify.R;
import com.aloineinc.jesusify.mainscreen.pastor.SectionAdapter;
import com.aloineinc.jesusify.mainscreen.pastor.SectionModel;
import com.aloineinc.jesusify.mainscreen.pastor.SermonAdapter;
import com.aloineinc.jesusify.mainscreen.pastor.SermonModel;

import java.util.ArrayList;
import java.util.List;

public class FragmentPastor extends android.support.v4.app.Fragment {
    View v;
    private List<SermonModel> sermonList = new ArrayList<>();
    private RecyclerView recyclerView;
    private SermonAdapter sermonAdapter;

    public FragmentPastor() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.pastor_fragment, container, false);
        recyclerView = v.findViewById(R.id.recycler_pastor_fragment);
        sermonAdapter = new SermonAdapter(getContext(),sermonList);
        //RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(sermonAdapter);


        return v;


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));
        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));

        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));

        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));

        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));
        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));
        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));
        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));
        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));
        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));
        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));
        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));
        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));
        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));

        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));
        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));

        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));
        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));

        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));
        sermonList.add(new SermonModel(R.drawable.thinkbig,"Think Big","21-01-2016","Downloads 244"));














//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//        sectionList.add(new SectionModel("Pastor EA Adeboye"));
//

    }
}