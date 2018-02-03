package com.pluralsight;

import java.util.ArrayList;
import java.util.Random;

public class Main {

     /*
    https://programmingbydoing.com/
    Basic arraylists 2 - Assignment #179
     */

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        int index;
        Random r = new Random();

        for (index = 0; index < 10; index++) {
            int number = r.nextInt(100);
            integers.add(number);
        }

        for (index = 0; index < integers.size(); index++) {
            System.out.println("Slot " + (index + 1) + " contains a " + integers.get(index));
        }

        System.out.println("ArrayList: " + integers);

    }
}
