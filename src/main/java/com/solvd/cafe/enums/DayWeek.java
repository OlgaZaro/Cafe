package com.solvd.cafe.enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum DayWeek {

    SUNDAY("Day of the week - Sunday"),
    MONDAY("Day of the week - Monday"),
    TUESDAY("Day of the week - Tuesday"),
    WEDNESDAY("Day of the week - Wednesday"),
    THURSDAY("Day of the week - Thursday"),
    FRIDAY("Day of the week - Friday"),
    SATURDAY("Day of the week - Saturday");

    private String dayOfWeek;
    DayWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public static void dayWeek() {
        final Logger logger = LogManager.getLogger(DayWeek.class);

        DayWeek sunday = DayWeek.SUNDAY;
        logger.info(sunday.getDayOfWeek());
        DayWeek monday = DayWeek.MONDAY;
        logger.info(monday.getDayOfWeek());
        DayWeek tuesday = DayWeek.TUESDAY;
        logger.info(tuesday.getDayOfWeek());
        DayWeek wednesday = DayWeek.WEDNESDAY;
        logger.info(wednesday.getDayOfWeek());
        DayWeek thursday = DayWeek.THURSDAY;
        logger.info(thursday.getDayOfWeek());
        DayWeek friday = DayWeek.FRIDAY;
        logger.info(friday.getDayOfWeek());
        DayWeek saturday = DayWeek.SATURDAY;
        logger.info(saturday.getDayOfWeek());
    }
}
