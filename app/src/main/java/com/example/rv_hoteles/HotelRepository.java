package com.example.rv_hoteles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HotelRepository {
    private static HotelRepository repository = new HotelRepository();
    private HashMap<String, Hotel> hotels = new HashMap<>();

    public static HotelRepository getInstance(){return repository;}

    private void saveHotel(Hotel lead){hotels.put(lead.getmId(),lead);}

    private HotelRepository(){
        saveHotel(new Hotel("Hotel Haníbal","Calle Hanñibal 20","4 estrellas",R.drawable.hotel_01));
        saveHotel(new Hotel("Hotel cervantes","Calle Cervantes 67","4 estrellas",R.drawable.hotel_02));
        saveHotel(new Hotel("Hotel Santiago","Calle Santiago 7","5 estrellas",R.drawable.hotel_03));
    }

    public List<Hotel> getHotels(){return new ArrayList<>(hotels.values());}
}
