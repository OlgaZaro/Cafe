package com.solvd.cafe.enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public enum TableNumber {
    TABLE_1, TABLE_2, TABLE_3, TABLE_4, TABLE_5;

    public static void tableNumber() {

        final Logger logger = LogManager.getLogger(TableNumber.class);

        Scanner scanner = new Scanner(System.in);
        TableNumber tableNumber = TableNumber.valueOf(scanner.nextLine());

        switch (tableNumber) {
            case TABLE_1:
                logger.info("It is table number - 1");
            case TABLE_2:
                logger.info("It is table number - 2");
            case TABLE_3:
                logger.info("It is table number - 3");
            case TABLE_4:
                logger.info("It is table number - 4");
            case TABLE_5:
                logger.info("It is table number - 5");
        }
    }
}
