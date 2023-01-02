package com.solvd.cafe.menu;

import com.solvd.cafe.cafe.Check;
import com.solvd.cafe.cafe.Contact;
import com.solvd.cafe.menuBar.AlcoholicDrinks;
import com.solvd.cafe.menuBar.SoftDrinks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

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
    public float getPrice() {
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

    public static Desert tiramisu = new Desert(15, 100, "Tiramisu", 1);
    public static Desert cheesecake = new Desert(12, 150, "Cheesecake", 2);
    public static Desert trifle = new Desert(17, 120, "Trifle", 3);
    public static FirstStrava hodgepodge = new FirstStrava(15, 100, "Hodgepodge", 4);
    public static FirstStrava soup = new FirstStrava(17, 100, "Soup", 5);
    public static FirstStrava pickleSoup = new FirstStrava(18, 100, "Pickle soup", 6);
    public static SecondStrava steak = new SecondStrava(35, 200, "Steak", 7);
    public static SecondStrava salad = new SecondStrava(25, 150, "Salad", 8);
    public static SecondStrava spaghetti = new SecondStrava(17, 300, "Spaghetti", 9);
    public static AlcoholicDrinks wine = new AlcoholicDrinks(20, 100, "Wine", 10);
    public static AlcoholicDrinks champagne = new AlcoholicDrinks(15, 150, "Champagne", 11);
    public static SoftDrinks coffee = new SoftDrinks(10, 250, "Coffee", 12);

    public static void stravaOrder() {
        try {
            int sum;
            Check.getStrava();
            Check.getSum();
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextInt()) {
                int a = scanner.nextInt();
                if (a >= 1 && a <= 12) {
                    switch (a) {
                        case 1:
                            logger.info("Dessert: Tiramisu - " + Menu.tiramisu.getPrice() + " $");
                            Check.getSum().add((int) Menu.tiramisu.getPrice());
                            Check.getStrava().add(Menu.tiramisu.getDesertTitle());
                            break;
                        case 2:
                            logger.info("Dessert: Cheesecake - " + Menu.cheesecake.getPrice() + " $");
                            Check.check.getSum().add((int) Menu.cheesecake.getPrice());
                            Check.check.getStrava().add(Menu.cheesecake.getDesertTitle());
                            break;
                        case 3:
                            logger.info("Dessert: Trifle - " + Menu.trifle.getPrice() + " $");
                            Check.check.getSum().add((int) Menu.trifle.getPrice());
                            Check.check.getStrava().add(Menu.trifle.getDesertTitle());
                            break;
                        case 4:
                            logger.info("Dish: Hodgepodge - " + Menu.hodgepodge.getPrice() + " $");
                            Check.check.getSum().add((int) Menu.hodgepodge.getPrice());
                            Check.check.getStrava().add(Menu.hodgepodge.getFirstStravaTitle());
                            break;
                        case 5:
                            logger.info("Dish: Soup - " + Menu.soup.getPrice() + " $");
                            Check.check.getSum().add((int) Menu.soup.getPrice());
                            Check.check.getStrava().add(Menu.soup.getFirstStravaTitle());
                            break;
                        case 6:
                            logger.info("Dish: Pickle soup - " + Menu.pickleSoup.getPrice() + " $");
                            Check.check.getSum().add((int) Menu.pickleSoup.getPrice());
                            Check.check.getStrava().add(Menu.pickleSoup.getFirstStravaTitle());
                            break;
                        case 7:
                            logger.info("Dish: Steak - " + Menu.steak.getPrice() + " $");
                            Check.check.getSum().add((int) Menu.steak.getPrice());
                            Check.check.getStrava().add(Menu.steak.getSecondStravaTitle());
                            break;
                        case 8:
                            logger.info("Dish: Salad - " + Menu.salad.getPrice() + " $");
                            Check.check.getSum().add((int) Menu.salad.getPrice());
                            Check.check.getStrava().add(Menu.salad.getSecondStravaTitle());
                            break;
                        case 9:
                            logger.info("Dish: Spaghetti - " + Menu.spaghetti.getPrice() + " $");
                            Check.check.getSum().add((int) Menu.spaghetti.getPrice());
                            Check.check.getStrava().add(Menu.spaghetti.getSecondStravaTitle());
                            break;
                        case 10:
                            logger.info("Drink:  Wine - " + Menu.wine.getPrice() + " $");
                            Check.check.getSum().add((int) Menu.wine.getPrice());
                            Check.check.getStrava().add(Menu.wine.getBeverage());
                            break;
                        case 11:
                            logger.info("Drink:  Champagne - " + Menu.champagne.getPrice() + " $");
                            Check.check.getSum().add((int) Menu.champagne.getPrice());
                            Check.check.getStrava().add(Menu.champagne.getBeverage());
                            break;
                        case 12:
                            logger.info("Drink:  Champagne - " + Menu.coffee.getPrice() + " $");
                            Check.check.getSum().add((int) Menu.coffee.getPrice());
                            Check.check.getStrava().add(Menu.coffee.getBeverage());
                            break;
                    }
                    logger.info("If do you want to order straws else, enter - dish number");
                    logger.info("If do you want to pay for the order, enter - 0");
                } else if (a == 0) {
                    Contact.check();
                    sum = Check.getSum().stream().mapToInt(Integer::intValue).sum();
                    logger.info("Your order: " + Check.check.getStrava());
                    logger.info("To pay: " + sum + " $");

                    sum = Check.getSum().stream().mapToInt(Integer::intValue).sum();
                    logger.info("Thank you for your order!");
                    return;
                }
            }
            stravaOrder();
        } catch (Exception e) {
            e.printStackTrace();
            stravaOrder();
        }
    }
}