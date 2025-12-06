package com.example.filesexamples.models;

import java.io.Serializable;

public class Person  implements Serializable {
    private int age;
    private String name;
    private String city;



    public Person(int age, String name, String city){
        this.age = age;
        this.name = name;
        this.city = city;

    }

}
