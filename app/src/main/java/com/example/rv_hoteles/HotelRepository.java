package com.example.rv_hoteles;

import java.util.HashMap;

public class HotelRepository {
    private static HotelRepository repository = new HotelRepository();
    private HashMap<String, Hotel> hotels = new HashMap<>();

    public static HotelRepository getInstance(){return repository;}

    private void saveHotel(Hotel lead){hotels.put(lead.getmId(),lead);}

    private HotelRepository(){

    }
}
