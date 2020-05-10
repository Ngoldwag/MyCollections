package edu.ti.caih313.collections;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFile {

    public static void main(String []args) throws Exception{
        String[] SENTENCE;
        String[] sentenceOfSentenceArray;
        Scanner keyboard = new Scanner(System.in);
        Scanner file = new Scanner(new File("C:/Users/Chumi Goldwag/IdeaProjects/collections/src/main/java/edu/ti/caih313/collections/ReadFromMe.text"));
        ArrayList<String> sentenceList = new ArrayList<String>();

        while (file.hasNextLine())
        {
            sentenceList.add(file.nextLine());
        }

        file.close();
    //this is the array of sentences
        String[] sentenceArray = sentenceList.toArray(new String[sentenceList.size()]);

//this loop is looping through the lines and seperating each sentence by a punctuation mark an putting that sentence in
        //its own index
        for (int r=0;r<sentenceArray.length;r++){
            sentenceOfSentenceArray = sentenceList.toArray(new String[r]);
            SENTENCE = sentenceArray[r].split("(?<=[.!?])\\s*");
            for (int i=0;i<SENTENCE.length;i++)
            {
                System.out.println("Sentence " + (r+1) + ": " + SENTENCE[i]);
                sentenceOfSentenceArray[r]=SENTENCE[i];
            }
            System.out.println(sentenceOfSentenceArray);
        }
        //this loop will seperate each word to its own index
        //for(int i=0; i<sentenceOfSentenceArray.size();i++){

        //}
        System.out.println("please enter a number. i will find that sentences");
        int sentenceNum = keyboard.nextInt();
        System.out.println("Now please provide me with another number and i will" +
                "find that number word in the sentence!");
        int wordNum = keyboard.nextInt();
}}
