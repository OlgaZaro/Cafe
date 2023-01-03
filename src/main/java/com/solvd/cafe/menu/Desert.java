package com.solvd.cafe.menu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Desert extends Menu implements GetPrice {
    private static final Logger logger = LogManager.getLogger(Desert.class);
    private static String desertTitle;

    public Desert() {}

    public Desert(int price, int portion, String desertTitle, int number) {

        super(price, portion, number);
        this.desertTitle = desertTitle;
    }

    public static String getDesertTitle() {
        return desertTitle;
    }

    public void setDesertTitle(String desertTitle) {
        this.desertTitle = desertTitle;
    }

    @Override
    public String toString() {
        return "Desert: " + getDesertTitle() + ", "
                + "price = " + getPrice() + ", "
                + "portion = " + getPortion() + ", "
                + "number = " + getNumber();
    }

    public float showPrice() {
        return getPrice();
    }
}

