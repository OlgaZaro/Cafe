package com.solvd.cafe.equipment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BarCounter extends Equipment implements Count {
    private static final Logger logger = LogManager.getLogger(BarCounter.class);
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

    @Override
    public void countAmount(){
        logger.info("Number of total: " + getCount());
    }
}
