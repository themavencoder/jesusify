package com.aloineinc.jesusify.mainscreen.mostrecent;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aloineinc.jesusify.R;

import java.util.List;

public class MostRecentRecyclerViewAdapter extends RecyclerView.Adapter<MostRecentRecyclerViewAdapter.MyViewHolder> {
    Context context;
    List<MostRecentModel> mData;

    public MostRecentRecyclerViewAdapter(Context context, List<MostRecentModel> mData) {
        this.context = context;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.item_mostrecent,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv_sermon.setText(mData.get(position).getSermon());
        holder.tv_preacher.setText(mData.get(position).getPreacher());
        holder.tv_duration.setText(mData.get(position).getDuration());
        holder.tv_releasedDate.setText(mData.get(position).getDateRealeased());
        holder.tv_downloads.setText(mData.get(position).getDownloads());
        holder.img.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_sermon, tv_preacher, tv_duration, tv_releasedDate, tv_downloads;
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv_sermon = itemView.findViewById(R.id.tv_messagetitle);
            tv_preacher = itemView.findViewById(R.id.tv_messagepreacher);
            tv_duration = itemView.findViewById(R.id.tv_messageduration);
            tv_releasedDate = itemView.findViewById(R.id.tv_messagereleasedate);
            tv_downloads = itemView.findViewById(R.id.tv_messagedownloads);

            img = itemView.findViewById(R.id.img_mostrecent);
        }
    }
}
