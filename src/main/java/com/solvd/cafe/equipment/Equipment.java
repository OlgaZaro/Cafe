package com.solvd.cafe.equipment;

import com.solvd.cafe.service.GenerateInfo;
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

        equipmentList.add(GenerateInfo.table1.getTitle());
        equipmentList.add(GenerateInfo.table2.getTitle());
        equipmentList.add(GenerateInfo.table3.getTitle());
        equipmentList.add(GenerateInfo.table4.getTitle());
        equipmentList.add(GenerateInfo.table5.getTitle());

        for (String equipmentLists : equipmentList) {
            logger.info(equipmentLists);
        }
    }
}
