package edu.ti.caih313.collections;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {
//read file into one long string \\. and then split by punctuation
    public static void main(String []args) throws Exception{
        Scanner keyboard = new Scanner(System.in);
        Scanner file = new Scanner(new File("C:/Users/Chumi Goldwag/IdeaProjects/collections/src/main/java/edu/ti/caih313/collections/ReadFromMe.text"));
        ArrayList<String> sentenceList = new ArrayList<String>();
        //this turns the file into one long string
        String text = file.useDelimiter("\\A").next();
        file.close();
        //this will be the array of sentences
        String str[] = text.split("(?<=[.!?])\\s*");
        List<String> arrayAsList = new ArrayList<String>();
        String arrayOfWords[];
        arrayAsList = Arrays.asList(str);
        for(String s: arrayAsList){
            System.out.println(s);
        }
        //this loops thru each index and creates
        //and array of words for each sentence
        for(int i=0;i<str.length;i++) {

            for (int j = 0; j < str[i].length(); j++) {
                arrayOfWords = str[i].split(" ");
                System.out.println("index " + j + "is " + arrayOfWords[j]);
            }
            System.out.println(str[i]);
        }
}}
