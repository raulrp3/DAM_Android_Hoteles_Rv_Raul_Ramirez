package com.example.rv_hoteles;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
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
    Context context;
    private CustomItemClick listener;

    RVAdapter(List<Hotel> hotels,Context context,CustomItemClick listener){
        this.hotels = hotels;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,final int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);
        final HotelViewHolder hvh = new HotelViewHolder(v);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(v,hvh.getAdapterPosition());
            }
        });

        return hvh;
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder hotelViewHolder, int i) {
        hotelViewHolder.hotelName.setText(hotels.get(i).getmName());
        hotelViewHolder.hotelAddress.setText(hotels.get(i).getmAddress());
        hotelViewHolder.hotelCalification.setText(hotels.get(i).getmCalification());
        hotelViewHolder.hotelImage.setImageResource(hotels.get(i).getmImage());
    }

    @Override
    public int getItemCount() {
        return hotels.size();
    }

    public void deleteItem(int i){
        hotels.remove(i);
    }

    public Context getContext(){
        return context;
    }
}
