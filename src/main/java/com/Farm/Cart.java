package com.Farm;

import java.util.List;

public class Cart {

    protected List<Animal> items;

    public void AddItem(Animal newItem) {
    }

    public int CartTotal() {
        int total = 0;
        Animal animal = new Animal();

        for (Animal object :
                items) {
            total += object.GetPrice();
        }
        return total;
    }
}
