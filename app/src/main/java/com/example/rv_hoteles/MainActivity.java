package com.example.rv_hoteles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Hotel> hotels;
    private RecyclerView rv;
    private RVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_activity);

        initUI();

        initData();
        initAdapter();
    }

    private void initUI(){
        rv = findViewById(R.id.rv);
        LinearLayoutManager llm  = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);
        hotels = new ArrayList<>();
    }

    private void initData(){
        hotels = HotelRepository.getInstance().getHotels();
    }

    private void initAdapter(){
       adapter = new RVAdapter(hotels, MainActivity.this, new CustomItemClick() {
            @Override
            public void onClick(View view, int index) {
                Intent intent = new Intent(MainActivity.this,CardViewActivity.class);
                String name = hotels.get(index).getmName();
                String address = hotels.get(index).getmAddress();
                String calification = hotels.get(index).getmCalification();
                int image = hotels.get(index).getmImage();
                intent.putExtra("IMAGE",image);
                intent.putExtra("NAME",name);
                intent.putExtra("ADDRESS",address);
                intent.putExtra("CALIFICATION",calification);
                startActivity(intent);
            }
        });
        rv.setAdapter(adapter);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new Swipe(adapter));
        itemTouchHelper.attachToRecyclerView(rv);
    }
}
