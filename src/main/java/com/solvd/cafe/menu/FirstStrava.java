package com.solvd.cafe.menu;

import java.util.TreeMap;

public class FirstStrava extends Menu implements GetPrice {
    private String firstStravaTitle;

    public FirstStrava() {}

    public FirstStrava(int price, int portion, String firstStravaTitle, int number) {
        super(price, portion, number);
        this.firstStravaTitle = firstStravaTitle;
    }

    public String getFirstStravaTitle() {
        return firstStravaTitle;
    }

    public void setFirstStravaTitle(String firstStravaTitle) {
        this.firstStravaTitle = firstStravaTitle;
    }

    @Override
    public String toString() {
        return "FirstStrava: " + getFirstStravaTitle() + ", "
                + "price = " + getPrice() + ", "
                + "portion = " + getPortion() + ", "
                + "number = " + getNumber();
    }

    public void stravaMap() {

        TreeMap<String, Integer> stravaMap = new TreeMap<>();

        stravaMap.put(hodgepodge.getFirstStravaTitle(), 1);
        stravaMap.put(soup.getFirstStravaTitle(), 2);
        stravaMap.put(pickleSoup.getFirstStravaTitle(), 3);
    }

    public float showPrice() {
        return getPrice();
    }
}
