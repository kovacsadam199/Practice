package com.adam.kovacs.billiardSaloon;

public enum TableType {
    SNOOKER(1600),
    POOL(1200),
    REX(800);

    private int price;

    TableType(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }
}
