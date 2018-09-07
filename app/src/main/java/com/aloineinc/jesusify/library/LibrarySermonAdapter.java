package com.aloineinc.jesusify.library;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aloineinc.jesusify.R;

import java.util.List;

public class LibrarySermonAdapter extends RecyclerView.Adapter<LibrarySermonAdapter.MyViewHolder> {
    private Context context;
    private List<LibrarySermonModel> librarySermonList;

    public LibrarySermonAdapter(Context context, List<LibrarySermonModel> librarySermonList) {
        this.context = context;
        this.librarySermonList = librarySermonList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_library_sermon, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.libraryImage.setImageResource(librarySermonList.get(position).getLibraryImage());
        holder.libraryImageStatus.setImageResource(librarySermonList.get(position).getLibraryImagestatus());
        holder.librarySermonTitle.setText(librarySermonList.get(position).getLibrarySermonTitle());
        holder.librarySermonPreacher.setText(librarySermonList.get(position).getLibrarySermonPreacher());
        holder.librarySermonYear.setText(librarySermonList.get(position).getLibrarySermonDate());
        holder.librarySermonDuration.setText(librarySermonList.get(position).getLibrarySermonDuration());
    }

    @Override
    public int getItemCount() {
        return librarySermonList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView libraryImage, libraryImageStatus;
        TextView librarySermonTitle, librarySermonPreacher, librarySermonYear, librarySermonDuration;

        public MyViewHolder(View itemView) {
            super(itemView);
            libraryImage = itemView.findViewById(R.id.library_sermonimage);
            libraryImageStatus = itemView.findViewById(R.id.library_downloadposition);
            librarySermonTitle = itemView.findViewById(R.id.library_sermontitle);
            librarySermonPreacher = itemView.findViewById(R.id.library_sermonpreacher);
            librarySermonYear = itemView.findViewById(R.id.library_date);
            librarySermonDuration = itemView.findViewById(R.id.library_time);
        }

    }


}
