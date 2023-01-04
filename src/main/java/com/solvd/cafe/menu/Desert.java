package com.solvd.cafe.menu;

public class Desert extends Menu implements GetPrice {
    private String desertTitle;

    public Desert() {}

    public Desert(int price, int portion, String desertTitle, int number) {

        super(price, portion, number);
        this.desertTitle = desertTitle;
    }

    public String getDesertTitle() {
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

