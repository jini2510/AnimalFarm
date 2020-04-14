package com.Farm.animals;

public class NameGenerator {

    private static String[] names = new String[] {"Harry", "Shaun", "Clara", "Thomas", "Sybil", "Matthew", "Pod"};

    public static String generateName() {
        int index = (int)(Math.random()*names.length);
        return names[index];
    }
}
