package edu.ti.caih313.collections.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class CountFamilies {
    public static void main(String[] args) {
        ArrayList<Double> income = new ArrayList<>();
        int count=0;
        Double maxVal = 0.00;
        System.out.println("Enter the income of the family or enter a negative number to stop");
        Scanner keyboard = new Scanner(System.in);
        Double familyIncome=keyboard.nextDouble();
        while (familyIncome>0){
            income.add(familyIncome);
        if(familyIncome>maxVal){
            maxVal=familyIncome;
        }   System.out.println("Another income?");
            familyIncome=keyboard.nextDouble();
        }
        System.out.println("The highest income is " + maxVal);
        System.out.println("And the income of families making less than 10 percent of the highest income is ");
        for (int i=0;i<income.size();i++) {
            if (income.get(i) < maxVal * 0.10) {
                System.out.println(income.get(i));
                count++;
            }
        }
        System.out.println("Which means " + count + " families are making less than "+maxVal*0.10+"!");



    }}






