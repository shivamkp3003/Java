package com.cloudthat.streamexamples;

import java.util.Arrays;
import java.util.List;

public class StreamUppercase {
    public static void main(String[] args){
        /*
        Given an array of strings, generate a statement of the uppercased words
         */
        String[] arr = {"Hello", "World", "I", "am","learning","Java"};

        String sentence = Arrays.stream(arr)
                .map(String::toUpperCase)
                .reduce("", (s1,s2)-> s1+" "+s2);

        System.out.println(sentence);
    }
}
