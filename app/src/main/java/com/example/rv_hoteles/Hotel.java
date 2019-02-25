package com.example.rv_hoteles;

import java.util.UUID;

public class Hotel {
    private String mId;
    private String mName;
    private String mAddress;
    private String mCalification;
    private int mImage;

    public Hotel(String name,String address,String calification,int image){
        mId = UUID.randomUUID().toString();
        mName = name;
        mAddress = address;
        mCalification = calification;
        mImage = image;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmCalification() {
        return mCalification;
    }

    public void setmCalification(String mCalification) {
        this.mCalification = mCalification;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "mId='" + mId + '\'' +
                ", mName='" + mName + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mCalification='" + mCalification + '\'' +
                ", mImage=" + mImage +
                '}';
    }
}
