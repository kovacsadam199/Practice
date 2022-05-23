package com.adam.kovacs.billiardSaloon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BilliardSaloon {
    private List<Table> tables;

    public BilliardSaloon() {
        this.tables = new ArrayList<>();
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public List<Table> getFreeTablesByType(TableType tableType) {
        return tables.stream().filter(table -> table.getTableType().equals(tableType)).filter(Table::isAvailable).collect(Collectors.toList());
    }

    public Table getHighestBilledTable() {
        return tables.stream().sorted(Comparator.comparing(Table::getBill, Comparator.reverseOrder())).toList().get(0);
    }
}
