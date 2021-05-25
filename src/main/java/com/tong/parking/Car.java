package com.tong.parking;

import java.util.Calendar;
import java.util.Date;

public class Car {
    String id;
    Date enter;
    public  Car(String id){
        this.id=id;
        enter=new Date();

    }
public Car(String id,String time){

    this.id=id;
    Calendar now=Calendar.getInstance();
    String tokens[]=time.split(":");
    System.out.println("to: "+tokens[0]);
    System.out.println("t1: "+tokens[1]);
    now.set(Calendar.HOUR_OF_DAY,Integer.parseInt("2"));
    now.set(Calendar.MINUTE,Integer.parseInt("30"));
    enter=now.getTime();








}
}
