package com.example.rv_hoteles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class CardViewActivity extends AppCompatActivity {

    private ImageView hotelImage;
    private TextView hotelName;
    private TextView hotelAddres;
    private TextView hotelCalification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardview_activity);

        initUI();

        initData();
    }

    private void initUI(){
        hotelImage = findViewById(R.id.card_hotel_img);
        hotelName = findViewById(R.id.card_hotel_name);
        hotelAddres = findViewById(R.id.card_hotel_address);
        hotelCalification = findViewById(R.id.card_hotel_calification);
    }

    private void initData(){
        Intent intent = getIntent();
        int image = intent.getIntExtra("IMAGE",0);
        String name = intent.getStringExtra("NAME");
        String address = intent.getStringExtra("ADDRESS");
        String calification = intent.getStringExtra("CALIFICATION");

        hotelImage.setImageResource(image);
        hotelName.setText(name);
        hotelAddres.setText(address);
        hotelCalification.setText(calification);
    }
}
