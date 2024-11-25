package com.cloudthat.serializationdemo;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("Hello world!");

        Person person = new Person();
        person.setAge(20);
        person.setName("Vishwas");

        FileOutputStream fileOutputStream = new FileOutputStream("person.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("person.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person p2 = (Person) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(p2);

    }
}