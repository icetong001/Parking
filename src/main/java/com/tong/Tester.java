package com.tong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        int fee=30;
        Map<String,Car> cars =new HashMap<>();
        Car C1=new Car("wtf-8787","07:30");
        Car C2=new Car("wow-7878","09:45");
        Car C3=new Car("TAT-6969","10:30");
        cars.put(C1.id,C1);
        cars.put(C2.id,C2);
        cars.put(C3.id,C3);

        String id="wtf-8787";
        Car car=cars.get(id);
        if( car==null){
            System.out.println("Car not found");

        }else {
            Date now=new Date();
            long ms=now.getTime()-car.enter.getTime();
            long mins=ms/(1000*60);
            System.out.println(mins);

            long newfees=(fee+mins*10);
            System.out.println(newfees);


        }

































//        SimpleDateFormat sdf=new SimpleDateFormat("HH:MM");
//
//        try{
//            Date d =sdf.parse("08:58");
//            System.out.println(d);
//        }catch(ParseException e){
//            e.printStackTrace();
//        }//
//        Calendar cal=Calendar.getInstance();
//        System.out.println(cal.getTime());
//
//    Car c1=new Car("abc-123");
//    Car c2=new Car("xyz-000","07:30");
//        System.out.println(c1.enter);
//        Date now=new Date();
//        System.out.println(now.getTime());
//        long dis =now.getTime()-c1.enter.getTime();
//        System.out.println(dis);


    }

}
