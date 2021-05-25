package com.tong;

public class Racing {
    public static void main(String[] args) {
        Horse horse1= new Horse();
        Horse hores2=new Horse();
        horse1.start();
        hores2.start();
        HorseRunable h3=new HorseRunable();
        Thread td=new Thread(h3);
        td.start();

    }
}
