package com.tong.box;

public class Box2 extends Box{
    public Box2(){
        length=12;
        width=10;
        height=10;


    }

    @Override
    public String getName() {
        return "Box2";
    }

    @Override
    public int getPrice() {
        return 30;
    }
}
