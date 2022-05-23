package com.adam.kovacs.billiardSaloon;

public  class Consumable {
    private FoodType foodType;
    private double price;
    private String name;

    public Consumable(FoodType foodType, double price, String name) {
        this.foodType = foodType;
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Consumable{" +
                "Type=" + foodType +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
