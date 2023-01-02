package com.solvd.cafe.equipment;

import com.solvd.cafe.menuBar.AlcoholicDrinks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public abstract class Equipment {
    private static final Logger logger = LogManager.getLogger(Equipment.class);
    private String title;
    private int count;

    public Equipment() {
    }

    public Equipment(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void tableList() {
        List<String> equipmentList = new ArrayList<>();

        equipmentList.add(table1.getTitle());
        equipmentList.add(table2.getTitle());
        equipmentList.add(table3.getTitle());
        equipmentList.add(table4.getTitle());
        equipmentList.add(table5.getTitle());

        for (String equipmentLists : equipmentList) {
            logger.info(equipmentLists);
        }
    }


    public static BarCounter barCounter = new BarCounter("BarCounter", 1, "equipment");
    public static Chairs chairs = new Chairs("Chairs", 15, "equipment");
    public static Tables table1 = new Tables("Table №1", 5, "equipment", 1);
    public static Tables table2 = new Tables("Table №2", 5, "equipment", 2);
    public static Tables table3 = new Tables("Table №3", 5, "equipment", 3);
    public static Tables table4 = new Tables("Table №4", 5, "equipment", 4);
    public static Tables table5 = new Tables("Table №5", 5, "equipment", 5);
}
