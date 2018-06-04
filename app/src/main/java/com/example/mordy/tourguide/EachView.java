package com.example.mordy.tourguide;

public class EachView {
    private int mName;

    private int mAddress;

    private int mImageResourceId;

    public EachView(int name, int address, int imageResourceId) {
        mName = name;
        mAddress = address;
        mImageResourceId = imageResourceId;

    }

    public int getName() {
        return mName;
    }

    public int getAddress(){
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
