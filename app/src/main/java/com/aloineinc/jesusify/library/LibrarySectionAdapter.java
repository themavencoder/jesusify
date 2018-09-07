package com.aloineinc.jesusify.library;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aloineinc.jesusify.R;

import java.util.List;

public class LibrarySectionAdapter extends RecyclerView.Adapter<LibrarySectionAdapter.MyViewHolder> {
    private Context context;
    private List<LibrarySectionModel> libraryModelList;

    public LibrarySectionAdapter(Context context, List<LibrarySectionModel> libraryModelList) {
        this.context = context;
        this.libraryModelList = libraryModelList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_library_time,parent,false);
            return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.libraryTime.setText(libraryModelList.get(position).getLibraryDate());
        LibrarySermonAdapter librarySermonAdapter = new LibrarySermonAdapter(context,libraryModelList.get(position).getLibrarySermonList());
        holder.recycler_list_time.setHasFixedSize(true);
        holder.recycler_list_time.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));
        holder.recycler_list_time.setAdapter(librarySermonAdapter);

    }

    @Override
    public int getItemCount() {
        return libraryModelList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView libraryTime;
        private RecyclerView recycler_list_time;


    public MyViewHolder(View itemView) {
        super(itemView);

        libraryTime = itemView.findViewById(R.id.tv_librarytime);
        recycler_list_time = itemView.findViewById(R.id.recycler_list_time);
    }
}

}
