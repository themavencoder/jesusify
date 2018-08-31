package com.aloineinc.jesusify.mainscreen.categories;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aloineinc.jesusify.R;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {
    private Context mContext;
    private List<CategoryModel> categoryList;

    public CategoryAdapter(Context mContext, List<CategoryModel> categoryList) {
        this.mContext = mContext;
        this.categoryList = categoryList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mainscreen_categories, parent, false);
        return new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.categoryText.setText(categoryList.get(position).getName());

    }

    @Override
    public int getItemCount() {

        return categoryList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView categoryText;


        public MyViewHolder(View itemView) {


            super(itemView);
            categoryText = itemView.findViewById(R.id.tv_categorytext);
        }
    }


}
