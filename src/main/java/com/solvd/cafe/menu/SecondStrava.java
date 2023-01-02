package com.solvd.cafe.menu;

import java.util.HashMap;

public class SecondStrava extends Menu implements GetPrice {
    private String secondStravaTitle;

    public SecondStrava() {}

    public SecondStrava(int price, int portion, String secondStravaTitle, int number) {
        super(price, portion, number);
        this.secondStravaTitle = secondStravaTitle;
    }

    public String getSecondStravaTitle() {
        return secondStravaTitle;
    }

    public void setSecondStravaTitle(String secondStravaTitle) {
        this.secondStravaTitle = secondStravaTitle;
    }

    @Override
    public String toString() {
        return "SecondStrava: " + getSecondStravaTitle() + ", "
                + "price = " + getPrice() + ", "
                + "portion = " + getPortion() + ", "
                + "number = " + getNumber();
    }

    public void stravaHash() {
        HashMap<Integer, String> stravaHash = new HashMap();

        stravaHash.put(1, steak.secondStravaTitle);
        stravaHash.put(2, salad.secondStravaTitle);
        stravaHash.put(3, spaghetti.secondStravaTitle);
    }
    public float showPrice() {
        return getPrice();
    }
}
