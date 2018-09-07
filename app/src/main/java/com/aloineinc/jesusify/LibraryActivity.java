package com.aloineinc.jesusify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

import com.aloineinc.jesusify.library.LibrarySectionAdapter;
import com.aloineinc.jesusify.library.LibrarySectionModel;
import com.aloineinc.jesusify.library.LibrarySermonModel;

import java.util.ArrayList;
import java.util.List;

public class LibraryActivity extends AppCompatActivity {
    private List<LibrarySectionModel> librarySectionModelList;
    private RecyclerView recyclerView;
    private LibrarySectionAdapter librarySectionAdapter;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_exists);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar );
        recyclerView = findViewById(R.id.recycler_libary_exist);
        librarySectionModelList = new ArrayList<>();
        recyclerView.setHasFixedSize(true);
        librarySectionAdapter = new LibrarySectionAdapter(this,librarySectionModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(librarySectionAdapter);
        dummyData();

    }

    private void dummyData() {
        int i = 0;
        LibrarySectionModel firstModel = new LibrarySectionModel();

        while (i < 15) {
            firstModel.setLibraryDate("21st February, 2018");
            List<LibrarySermonModel> sermonModel = new ArrayList<>();
            sermonModel.add(new LibrarySermonModel(R.drawable.thinkbig,"MIracle God","Pastor WF Kumuyi","31 Feb, 2003","2 hrs, 45minutes",R.drawable.promptdownload));
            sermonModel.add(new LibrarySermonModel(R.drawable.thinkbig,"MIracle God","Pastor WF Kumuyi","31 Feb, 2003","2 hrs, 45minutes",R.drawable.promptdownload));
            sermonModel.add(new LibrarySermonModel(R.drawable.thinkbig,"MIracle God","Pastor WF Kumuyi","31 Feb, 2003","2 hrs, 45minutes",R.drawable.promptdownload));
            sermonModel.add(new LibrarySermonModel(R.drawable.thinkbig,"MIracle God","Pastor WF Kumuyi","31 Feb, 2003","2 hrs, 45minutes",R.drawable.promptdownload));
            sermonModel.add(new LibrarySermonModel(R.drawable.thinkbig,"MIracle God","Pastor WF Kumuyi","31 Feb, 2003","2 hrs, 45minutes",R.drawable.promptdownload));
            sermonModel.add(new LibrarySermonModel(R.drawable.thinkbig,"MIracle God","Pastor WF Kumuyi","31 Feb, 2003","2 hrs, 45minutes",R.drawable.promptdownload));
            sermonModel.add(new LibrarySermonModel(R.drawable.thinkbig,"MIracle God","Pastor WF Kumuyi","31 Feb, 2003","2 hrs, 45minutes",R.drawable.promptdownload));
            sermonModel.add(new LibrarySermonModel(R.drawable.thinkbig,"MIracle God","Pastor WF Kumuyi","31 Feb, 2003","2 hrs, 45minutes",R.drawable.promptdownload));
            sermonModel.add(new LibrarySermonModel(R.drawable.thinkbig,"MIracle God","Pastor WF Kumuyi","31 Feb, 2003","2 hrs, 45minutes",R.drawable.promptdownload));
            sermonModel.add(new LibrarySermonModel(R.drawable.thinkbig,"MIracle God","Pastor WF Kumuyi","31 Feb, 2003","2 hrs, 45minutes",R.drawable.promptdownload));
            sermonModel.add(new LibrarySermonModel(R.drawable.thinkbig,"MIracle God","Pastor WF Kumuyi","31 Feb, 2003","2 hrs, 45minutes",R.drawable.promptdownload));

            firstModel.setLibrarySermonList(sermonModel);
            librarySectionModelList.add(firstModel);
            i++;
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.library_menu,menu);
        return true;
    }
}
