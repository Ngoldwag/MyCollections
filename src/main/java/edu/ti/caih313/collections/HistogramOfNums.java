package edu.ti.caih313.collections;

import java.util.*;

import java.util.HashMap;
import java.util.Map;

public class HistogramOfNums {

        public static<K> void increment(Map<K, Integer> map, K key) {
            map.putIfAbsent(key, 0);
            map.put(key, map.get(key) + 1);
        }

        public static void main(String[] args)
        {
            Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
            Map<Integer, Integer> frequency = new HashMap();

            System.out.println("Please type the first number for the hashmap");
            Scanner keyboard = new Scanner(System.in);
            int input = keyboard.nextInt();
            while(input>0) {
                histogram.put(input, 1);
                if (frequency.containsKey(input)) {
                    increment(frequency, input);
                    increment(histogram, input);
                } else {
                    frequency.put(input, 1);
                }

                System.out.println("Another number for the histogram?");
                input=keyboard.nextInt();
            }
                System.out.println(frequency);

        }
    }
