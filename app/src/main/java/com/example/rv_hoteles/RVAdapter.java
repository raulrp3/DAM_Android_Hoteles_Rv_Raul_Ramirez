package com.example.rv_hoteles;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.HotelViewHolder> {

    public static class HotelViewHolder extends RecyclerView.ViewHolder{

        CardView cv;
        TextView hotelName;
        TextView hotelAddress;
        TextView hotelCalification;
        ImageView hotelImage;

        HotelViewHolder(View itemView){
            super(itemView);
            cv = itemView.findViewById(R.id.cv);
            hotelName = itemView.findViewById(R.id.hotel_name);
            hotelAddress = itemView.findViewById(R.id.hotel_address);
            hotelCalification = itemView.findViewById(R.id.hotel_calification);
            hotelImage = itemView.findViewById(R.id.hotel_img);
        }
    }

    List<Hotel> hotels;

    RVAdapter(List<Hotel> hotels){this.hotels = hotels;}

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder hotelViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
