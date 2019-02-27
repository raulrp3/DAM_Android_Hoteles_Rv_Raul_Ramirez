package com.example.rv_hoteles;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

public class Swipe extends ItemTouchHelper.SimpleCallback {

    private RVAdapter mAdapter;

    public Swipe(RVAdapter adapter){
        super(0,ItemTouchHelper.LEFT);
        mAdapter = adapter;
    }

    @Override
    public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder1) {
        return false;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder,int direction){
        int position = viewHolder.getAdapterPosition();
        mAdapter.deleteItem(position);
        mAdapter.notifyDataSetChanged();
    }
}
