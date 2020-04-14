package com.Farm.animals;

import com.Farm.enums.Colour;

public class Sheep extends Animal {

    private final Colour colour;
    private static String phrase = "Baa!";

    public Sheep() {
        super();
        this.colour = Colour.values()[(int) (Math.random()*Colour.values().length)];
    }

    public Colour getColour() {
        return this.colour;
    }

    public String getPhrase() {
        return phrase;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name = " + this.getName() +
                ", age = " + this.getAge() +
                ", size = " + this.getSize() +
                ", gender = " + this.getGender() +
                ", price = " + this.getPrice() +
                ", wool colour = " + this.colour +
                '}';
    }
}
