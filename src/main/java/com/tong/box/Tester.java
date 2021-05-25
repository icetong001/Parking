package com.tong.box;

import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {

        Box boxes[] = {new Box2(), new Box3()};

            Scanner scanner = new Scanner(System.in);
        System.out.println("enter width");
        int width = Integer.parseInt(scanner.next());
        System.out.println("enter height");
        int height = Integer.parseInt(scanner.next());
        System.out.println("enter depth");
        int depth = Integer.parseInt(scanner.next());

        for (Box box : boxes) {
            if(box.validate(width,height,depth)){
                System.out.println(box.getName()+"/"+box.getPrice());
                break;
        }


    }
}}