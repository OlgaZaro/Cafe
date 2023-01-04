package com.solvd.cafe.equipment;

public class Chairs extends Equipment {
    private String equipmentType;

    public Chairs() {}

    public Chairs(String title, int count, String equipmentType) {
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
        return "Chairs: " + "title = " + getTitle() + ", "
                + "count = " + getCount() + ", "
                + "equipmentType = " + getEquipmentType();
    }
}
