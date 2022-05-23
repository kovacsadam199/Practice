package com.adam.kovacs.billiardSaloon;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private  TableType tableType;
    private boolean isAvailable;
    private List<Consumable> orders;
    private  int hoursUsed;

    public boolean isAvailable() {
        return isAvailable;
    }

    public Table(TableType tableType) {
        this.tableType = tableType;
        this.isAvailable = true;
        this.orders = new ArrayList<>();
    }

    public TableType getTableType() {
        return tableType;
    }

    public double getBill(){
        double basicPrice = (double) tableType.getPrice()*hoursUsed;
        return basicPrice + calculateConsumption() ;

    }

    public void setHoursUsed(int hoursUsed) {
        this.hoursUsed = hoursUsed;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double calculateConsumption(){
        return orders.stream().map(Consumable::getPrice).reduce(0.0, Double::sum);
    }

    public void addConsumable(Consumable consumable){
        orders.add(consumable);
    }

    @Override
    public String toString() {
        return "Table{" +
                "Type=" + tableType +
                ", orders=" + orders +
                ", hoursUsed=" + hoursUsed +
                ", bill=" + getBill()+
                '}';
    }
}
