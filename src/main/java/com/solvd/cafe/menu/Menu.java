package com.solvd.cafe.menu;

import com.solvd.cafe.cafe.Check;
import com.solvd.cafe.cafe.Contact;
import com.solvd.cafe.service.GenerateInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

import static com.solvd.cafe.cafe.Check.getStrava;

public abstract class Menu {
    private static final Logger logger = LogManager.getLogger(Menu.class);

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