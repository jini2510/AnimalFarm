package com.Farm;

public class Animal {

    private String name;
    private int price;

    public Animal(String name, int price) {
        this.price = price;
        this.name = name;
    }

    public Animal() {

    }

    public int GetPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return name + "   " + price;
    }
}

