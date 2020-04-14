package com.Farm.animals;

import com.Farm.enums.Gender;
import com.Farm.enums.Size;

public abstract class Animal {

    private String name;
    private int age;
    private Size size;
    private Gender gender;
    private int price;
    private static final int maxAge = 11;

    public Animal() {
        this.name = NameGenerator.generateName();
        this.age = (int) (Math.random()*maxAge);
        this.size = Size.values()[(int)(Math.random()*Size.values().length)];
        this.gender = Gender.values()[(int) (Math.random()*Gender.values().length)];

    }

    public Animal(int price) {
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Gender getGender() {
        return gender;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int GetPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name = " + this.name +
                ", age = " + this.age +
                ", size = " + this.size +
                ", gender = " + this.gender +
                ", price = " + this.price +
                '}';
    }
}

