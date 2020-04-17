package com.Farm.animals;

public class NameGenerator {

    // Names arrays
    private static final String[] maleNames = new String[] {"Bob", "John", "Steve", "Oliver"};
    private static final String[] femaleNames = new String[] {"Mary", "Megan", "Sarah", "Ginny"};

    // Generate a random male name from the names array
    public static String generateMaleName() {
        // Generate a random index and return the name at that index
        int index = (int) (Math.random()*maleNames.length);
        return maleNames[index];
    }

    // Generate a random female name from the names array
    public static String generateFemaleName() {
        // Generate a random index and return the name at that index
        int index = (int) (Math.random()*femaleNames.length);
        return femaleNames[index];
    }

}
