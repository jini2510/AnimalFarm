package com.Farm.animals;

import com.Farm.enums.Gender;
import com.Farm.enums.Size;

public class Cow extends Animal {

    private int milkStored;
    private int milkCapacity;

    private static String phrase = "Moo!";

    public Cow() {
        super();
    }


    public boolean produce() {
        return true;
    }

    public int collect () {
        int amount = milkStored;
        milkStored = 0;
        return amount;
    }
}

