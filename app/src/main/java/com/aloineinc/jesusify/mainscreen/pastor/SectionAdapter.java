package com.aloineinc.jesusify.mainscreen.pastor;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aloineinc.jesusify.R;

import java.util.List;

public class SectionAdapter extends RecyclerView.Adapter<SectionAdapter.MyViewHolder> {
        private List<SectionModel> modelList;
        private Context mContext;

    public SectionAdapter(List<SectionModel> modelList, Context mContext) {
        this.modelList = modelList;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mainscreen_pastor_section,parent,false);

       return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.name.setText(modelList.get(position).getSermonName());
        SermonAdapter sermonAdapter = new SermonAdapter(mContext,modelList.get(position).getSermonList());
        holder.recycler_view_list.setHasFixedSize(true);
        holder.recycler_view_list.setLayoutManager(new LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false));
        holder.recycler_view_list.setAdapter(sermonAdapter);
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private RecyclerView recycler_view_list;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.sermonName);
            recycler_view_list = itemView.findViewById(R.id.recycler_view_list);
        }
    }
}
