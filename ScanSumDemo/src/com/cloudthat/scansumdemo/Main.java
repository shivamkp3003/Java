package com.cloudthat.scansumdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sum = 0;

        try {
            // Replace <Filepath of input.txt>
            Scanner sc = new Scanner(new BufferedReader(new FileReader("<Filepath of input.txt>")));
            sc.useLocale(Locale.US);

            while (sc.hasNext()){
                if(sc.hasNextDouble()){
                    sum += sc.nextDouble();
                } else {
                    sc.next();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(sum);
    }
}