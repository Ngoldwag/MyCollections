package edu.ti.caih313.collections;

import java.util.*;

public class HistogramOfNums {
    Map<Integer, Integer> newArray = new HashMap<Integer, Integer>();
    Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();

        public static void main(String[] args) {
            System.out.println("Entering the method that will add to the histogram");
            System.out.println(add2Histogram());
            System.out.println("Here is the result of how many times each number" +
                    "appears in the hash map");


        }
    public  Map<Integer, Integer> add2Histogram() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type a number for the hash map");
        int input = keyboard.nextInt();
        if(input>0) {
            histogram.put(input, 0);
            if (newArray.containsKey(input)) {
                newArray.put(input, value+=1);
            } else {
                newArray.put(input, 0);
            }

            add2Histogram();
        }else{
            System.out.println("All done!");
        }
        return histogram;
    }
    public  Map<Integer, Integer>changeHistogram() {
        for (int i = 0; i < newArray.size(); i++) {
            for (int j = 0; j < histogram.size(); j++) {
                int temp = newArray.getValue(i);
                histogram.put(newArray.get(i), temp);
                System.out.println("The number " + newArray.get(i) + " appears " + newArray.getValue(i) + "times.");
            }
        }

        return histogram;
    }
}
