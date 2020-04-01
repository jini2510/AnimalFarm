package com.Farm;

public class MarketPlace {

    private String name;
    private int price;
    private StringFormatter stringFormatter;

    public MarketPlace(String name, int price){
        this.name = name;
        this.price = price;
        this.stringFormatter = () -> "Animal " + this.name + " has a price of " + this.price;

    }

    public void setStringFormatter(final StringFormatter stringFormatter){
        this.stringFormatter = stringFormatter;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
