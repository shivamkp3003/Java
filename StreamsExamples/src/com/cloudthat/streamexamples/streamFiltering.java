package com.cloudthat.streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamFiltering {
    /*
    Given a array of integers filter and print only the Even numbers
     */
    public  static  void main(String[] args){
        int[] arr = {1,2,4,5,6,8,9,12,78,96,103};
        List<Integer> evenNumbers = Arrays.stream(arr)
                .boxed()
                .filter(n -> n%2 == 0)
                .toList();
        System.out.println(evenNumbers);
    }
}
