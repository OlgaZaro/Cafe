package com.solvd.cafe.menu;

public abstract class Menu {
    private int price;
    private int portion;
    private int number;

    public Menu() {}

    public Menu(int price, int portion, int number) {
        this.price = price;
        this.portion = portion;
        this.number = number;
    }
    public int getPrice() {
        return price;
    }

    public int getPortion() {
        return portion;
    }

    public int getNumber() {
        return number;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPortion(int portion) {
        this.portion = portion;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}