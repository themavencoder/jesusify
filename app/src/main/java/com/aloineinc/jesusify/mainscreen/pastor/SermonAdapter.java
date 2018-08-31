package com.aloineinc.jesusify.mainscreen.pastor;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class SermonAdapter extends RecyclerView.Adapter<SermonAdapter.MyViewHolder> {
    private Context mContext;
    private List<SermonModel> sermonList;

    public SermonAdapter(Context mContext, List<SermonModel> sermonList) {
        this.mContext = mContext;
        this.sermonList = sermonList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext().
        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
