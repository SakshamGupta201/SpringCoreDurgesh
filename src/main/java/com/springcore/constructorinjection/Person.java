package com.springcore.constructorinjection;

import java.util.List;

public class Person {
    private String name;
    private int id;

    private Certificate certificate;

    private List<String> ls;

    public Person(String name, int id, Certificate certificate, List<String> ls) {
        this.name = name;
        this.id = id;
        this.certificate = certificate;
        this.ls = ls;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", certificate=" + certificate +
                ", ls=" + ls +
                '}';
    }
}
