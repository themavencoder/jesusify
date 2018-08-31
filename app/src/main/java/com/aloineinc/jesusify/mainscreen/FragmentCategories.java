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
import com.aloineinc.jesusify.mainscreen.categories.CategoryAdapter;
import com.aloineinc.jesusify.mainscreen.categories.CategoryModel;

import java.util.ArrayList;
import java.util.List;

public class FragmentCategories extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private CategoryAdapter categoryAdapter;
    private List<CategoryModel> categoryList = new ArrayList<>();

    public FragmentCategories() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.categories_fragment, container, false);
        recyclerView = v.findViewById(R.id.recycler_view_mainscreen_categories);
        categoryAdapter = new CategoryAdapter(getContext(), categoryList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(categoryAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        categoryList.add(new CategoryModel("Faith"));
        categoryList.add(new CategoryModel("Love"));
        categoryList.add(new CategoryModel("Peace"));
        categoryList.add(new CategoryModel("Joy"));
        categoryList.add(new CategoryModel("Patience"));
        categoryList.add(new CategoryModel("Faith"));
        categoryList.add(new CategoryModel("Love"));
        categoryList.add(new CategoryModel("Peace"));
        categoryList.add(new CategoryModel("Joy"));
        categoryList.add(new CategoryModel("Patience"));
        categoryList.add(new CategoryModel("Faith"));
        categoryList.add(new CategoryModel("Love"));
        categoryList.add(new CategoryModel("Peace"));
        categoryList.add(new CategoryModel("Joy"));
        categoryList.add(new CategoryModel("Patience"));
        categoryList.add(new CategoryModel("Faith"));
        categoryList.add(new CategoryModel("Love"));
        categoryList.add(new CategoryModel("Peace"));
        categoryList.add(new CategoryModel("Joy"));
        categoryList.add(new CategoryModel("Patience"));
        categoryList.add(new CategoryModel("Faith"));
        categoryList.add(new CategoryModel("Love"));
        categoryList.add(new CategoryModel("Peace"));
        categoryList.add(new CategoryModel("Joy"));
        categoryList.add(new CategoryModel("Patience"));
        categoryList.add(new CategoryModel("Faith"));
        categoryList.add(new CategoryModel("Love"));
        categoryList.add(new CategoryModel("Peace"));
        categoryList.add(new CategoryModel("Joy"));
        categoryList.add(new CategoryModel("Patience"));
        categoryList.add(new CategoryModel("Faith"));
        categoryList.add(new CategoryModel("Love"));
        categoryList.add(new CategoryModel("Peace"));
        categoryList.add(new CategoryModel("Joy"));
        categoryList.add(new CategoryModel("Patience"));
        categoryList.add(new CategoryModel("Faith"));
        categoryList.add(new CategoryModel("Love"));
        categoryList.add(new CategoryModel("Peace"));
        categoryList.add(new CategoryModel("Joy"));
        categoryList.add(new CategoryModel("Patience"));


    }
}
