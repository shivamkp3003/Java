package com.cloudthat.charfreqcounterapp;


import java.util.Scanner;

class CharFreqPair{
    char ch;
    int freq;

    public CharFreqPair(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
}

public class Main {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input String: ");
        String inputString = sc.next();

        // Making all characters upper case
        String upperCasedInput = inputString.toUpperCase();
        CharFreqPair[] charFreqPairs = new CharFreqPair[256];

        for (char c: upperCasedInput.toCharArray()){
            if(charFreqPairs[c] == null){
                charFreqPairs[c] = new CharFreqPair(c,1);
            }else{
                charFreqPairs[c].freq++;
            }
        }

        for (CharFreqPair pair: charFreqPairs){
            if (pair!=null){
                System.out.println(pair.ch+": "+ pair.freq);
            }
        }
    }
}