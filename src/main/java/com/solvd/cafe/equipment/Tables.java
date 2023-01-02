package com.solvd.cafe.equipment;

import com.solvd.cafe.exceptions.NumberException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Tables extends Equipment implements Count {
    private static final Logger logger = LogManager.getLogger(Tables.class);
    private String equipmentType;
    private int tableNumber;

    public Tables() {}

    public Tables(String title, int count, String equipmentType, int tableNumber) {
        super(title, count);
        this.equipmentType = equipmentType;
        this.tableNumber = tableNumber;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String toString() {
        return "Tables: " + "title = " + getTitle() + ", "
                + "count = " + getCount() + ", "
                + "equipmentType = " + getEquipmentType();
    }

    @Override
    public void countAmount() {
        logger.info("Number of total: " + getCount());
    }
}