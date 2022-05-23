package com.adam.kovacs.billiardSaloon;

public class App {
    public static void main(String[] args) {
        Table table = new Table(TableType.SNOOKER);
        table.setHoursUsed(1);
        table.setAvailable(false);
        table.addConsumable(new Consumable(FoodType.FOOD, 2.3, "Sandwich"));
        Table table2 = new Table(TableType.POOL);
        table2.setHoursUsed(3);
        table2.setAvailable(false);
        table2.addConsumable(new Consumable(FoodType.DRINK, 3.5, "Beer"));
        Table table3 = new Table(TableType.POOL);
        table3.setAvailable(true);
        BilliardSaloon billiardSaloon = new BilliardSaloon();
        billiardSaloon.addTable(table);
        billiardSaloon.addTable(table2);
        billiardSaloon.addTable(table3);
        System.out.println(billiardSaloon.getFreeTablesByType(TableType.POOL));
        System.out.println(billiardSaloon.getHighestBilledTable());
    }
}
