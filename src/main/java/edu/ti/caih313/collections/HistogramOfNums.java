package edu.ti.caih313.collections;

import java.util.*;

public class HistogramOfNums {
    Scanner keyboard = new Scanner(System.in);
    Map<Integer, Integer> newArray = new HashMap<Integer, Integer>();
    Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        public static void main(String[] args) {
            System.out.println("Entering the method that will add to the histogram");
            add2Histogram();




        System.out.println("Please type a number for the hash map");
        int input = keyboard.nextInt();
        if(input>0) {
            histogram.put(input, 0);
            if (newArray.containsKey(input)) {
                newArray.put(input, newArray.getValue() + 1);
            } else {
                newArray.put(input, 0);
            }

            add2Histogram();
        }else{
            System.out.println("All done!");
        }
            System.out.println("Here is the result of how many times each number" +
                    "appears in the hash map");
    }

}
