package com.solvd.cafe.equipment;

public class BarCounter extends Equipment {
    private String equipmentType;

    public BarCounter() {}

    public BarCounter(String title, int count, String equipmentType) {
        super(title, count);
        this.equipmentType = equipmentType;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    @Override
    public String toString() {
        return "BarCounter: " + "title = " + getTitle() + ", "
                + "count = " + getCount() + ", "
                + "equipmentType = " + getEquipmentType();
    }
}
