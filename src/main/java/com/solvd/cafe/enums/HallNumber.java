package com.solvd.cafe.enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public enum HallNumber {
    HALL_1, HALL_2;

    public static void hallNumber() {

        final Logger logger = LogManager.getLogger(HallNumber.class);

        Scanner scanner = new Scanner(System.in);
        HallNumber hallNumber = HallNumber.valueOf(scanner.nextLine());

        switch (hallNumber) {
            case HALL_1:
                logger.info("It is hall number one");
            case HALL_2:
                logger.info("It is hall number two");
        }
    }
}
