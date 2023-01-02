package com.solvd.cafe.menuBar;

import com.solvd.cafe.menu.Menu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AlcoholicDrinks extends Menu implements Fortress {

    private static final Logger logger = LogManager.getLogger(AlcoholicDrinks.class);
    private String beverage;

    public AlcoholicDrinks() {}

    public AlcoholicDrinks(int price, int portion, String beverage, int number) {
        super(price, portion, number);
        this.beverage = beverage;
    }

    public String getBeverage() { return beverage; }

    public void setBeverage(String beverage) { this.beverage = beverage; }

    @Override
    public String toString() {
        return "AlcoholicDrinks: " + getBeverage() + ", "
                + "price = " + getPrice() + ", "
                + "portion = " + getPortion() + ", "
                + "number = " + getNumber();
    }

    @Override
    public void fortress(){
        logger.info("Alcoholic drinks");
    }
}
