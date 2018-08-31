package com.aloineinc.jesusify.mainscreen.pastor;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aloineinc.jesusify.R;

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
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mainscreen_sermon_section,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.sermonName.setText(sermonList.get(position).getSermonName());
        holder.sermonDate.setText(sermonList.get(position).getSermonDate());
        holder.sermonDownloads.setText(sermonList.get(position).getSermonDownloads());
        holder.sermonImage.setImageResource(sermonList.get(position).getSermonImage());

    }

    @Override
    public int getItemCount() {
        return sermonList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
     private TextView sermonName, sermonDate,sermonDownloads;
        private ImageView sermonImage;

        public MyViewHolder(View itemView) {
            super(itemView);

            sermonName = itemView.findViewById(R.id.mainscreen_sermon_name);
            sermonDate = itemView.findViewById(R.id.mainscreen_sermon_date);
            sermonDownloads = itemView.findViewById(R.id.mainscreen_sermon_downloads);
            sermonImage = itemView.findViewById(R.id.mainscreen_sermon_picture);
        }
    }
}
