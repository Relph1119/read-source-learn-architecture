package com.teapot.basic;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }


    public void perform() {
        System.out.println(this.name + "在表演！");
    }
}
