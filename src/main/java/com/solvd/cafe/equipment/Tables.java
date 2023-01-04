package com.solvd.cafe.equipment;

import java.util.ArrayList;
import java.util.List;

public class Tables extends Equipment {
    private String equipmentType;
    private int tableNumber;
    private static List<Integer> number = new ArrayList<>();

    public Tables() {}

    public Tables(String title, int count, String equipmentType, int tableNumber, List<Integer> number) {
        super(title, count);
        this.equipmentType = equipmentType;
        this.tableNumber = tableNumber;
        this.number = number;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public static List<Integer> getNumber() {
        return number;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public static void setNumber(List<Integer> number) {
        Tables.number = number;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String toString() {
        return "Tables: " + "title = " + getTitle() + ", "
                + "count = " + getCount() + ", "
                + "equipmentType = " + getEquipmentType();
    }
}