package edu.ti.caih313.collections;

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
        }
        if(familyIncome>maxVal){
            maxVal=familyIncome;
        }
        for (int i=0;i<income.size();i++){
            if (income.get(i)<maxVal*0.10){
                System.out.println(income.get(i));
            }
            count++;
        }
        System.out.println("would you like to know how many family's income is less than ten percent of the maximum value");
        String answer = keyboard.nextLine();
        if (answer.equalsIgnoreCase("yes")){
            System.out.println("The amount of families making less than 1- percent of the highest income is "+ count);
        }

    }}






