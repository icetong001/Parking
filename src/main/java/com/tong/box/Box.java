package com.tong.box;

public abstract class  Box {
    int length;
    int width;
    int height;


    public boolean validate(int w ,int h,int d) {
        return (w<=width&&h<height&&d<=length);


        }
    public abstract String getName();
    public abstract int getPrice();

    }



