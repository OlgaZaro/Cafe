package com.solvd.cafe.service;


import com.solvd.cafe.cafe.Check;
import com.solvd.cafe.cafe.Contact;
import com.solvd.cafe.cafe.Initialization;
import com.solvd.cafe.exceptions.EmailException;
import com.solvd.cafe.exceptions.NumberException;
import com.solvd.cafe.exceptions.PhoneException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

import static com.solvd.cafe.cafe.Check.getStrava;

public class ClientService {
    public static void start() throws PhoneException, NumberException, EmailException {

        Initialization.greetings();
        Initialization.initialization();
    }
    public static void stravaOrder() {
        final Logger logger = LogManager.getLogger(ClientService.class);

        try {
            int sum;
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextInt()) {
                int a = scanner.nextInt();
                if (a >= 1 && a <= 12) {
                    switch (a) {
                        case 1:
                            logger.info("Dessert: Tiramisu - " + GenerateInfo.tiramisu.getPrice() + " $");
                            Check.getSum().add(GenerateInfo.tiramisu.getPrice());
                            getStrava().add(GenerateInfo.tiramisu.getDesertTitle());
                            break;
                        case 2:
                            logger.info("Dessert: Cheesecake - " + GenerateInfo.cheesecake.getPrice() + " $");
                            Check.getSum().add(GenerateInfo.cheesecake.getPrice());
                            getStrava().add(GenerateInfo.cheesecake.getDesertTitle());
                            break;
                        case 3:
                            logger.info("Dessert: Trifle - " + GenerateInfo.trifle.getPrice() + " $");
                            Check.getSum().add(GenerateInfo.trifle.getPrice());
                            getStrava().add(GenerateInfo.trifle.getDesertTitle());
                            break;
                        case 4:
                            logger.info("Dish: Hodgepodge - " + GenerateInfo.hodgepodge.getPrice() + " $");
                            Check.getSum().add(GenerateInfo.hodgepodge.getPrice());
                            getStrava().add(GenerateInfo.hodgepodge.getFirstStravaTitle());
                            break;
                        case 5:
                            logger.info("Dish: Soup - " + GenerateInfo.soup.getPrice() + " $");
                            Check.getSum().add(GenerateInfo.soup.getPrice());
                            getStrava().add(GenerateInfo.soup.getFirstStravaTitle());
                            break;
                        case 6:
                            logger.info("Dish: Pickle soup - " + GenerateInfo.pickleSoup.getPrice() + " $");
                            Check.getSum().add(GenerateInfo.pickleSoup.getPrice());
                            getStrava().add(GenerateInfo.pickleSoup.getFirstStravaTitle());
                            break;
                        case 7:
                            logger.info("Dish: Steak - " + GenerateInfo.steak.getPrice() + " $");
                            Check.getSum().add(GenerateInfo.steak.getPrice());
                            getStrava().add(GenerateInfo.steak.getSecondStravaTitle());
                            break;
                        case 8:
                            logger.info("Dish: Salad - " + GenerateInfo.salad.getPrice() + " $");
                            Check.getSum().add(GenerateInfo.salad.getPrice());
                            getStrava().add(GenerateInfo.salad.getSecondStravaTitle());
                            break;
                        case 9:
                            logger.info("Dish: Spaghetti - " + GenerateInfo.spaghetti.getPrice() + " $");
                            Check.getSum().add(GenerateInfo.spaghetti.getPrice());
                            getStrava().add(GenerateInfo.spaghetti.getSecondStravaTitle());
                            break;
                        case 10:
                            logger.info("Drink:  Wine - " + GenerateInfo.wine.getPrice() + " $");
                            Check.getSum().add(GenerateInfo.wine.getPrice());
                            getStrava().add(GenerateInfo.wine.getBeverage());
                            break;
                        case 11:
                            logger.info("Drink:  Champagne - " + GenerateInfo.champagne.getPrice() + " $");
                            Check.getSum().add(GenerateInfo.champagne.getPrice());
                            getStrava().add(GenerateInfo.champagne.getBeverage());
                            break;
                        case 12:
                            logger.info("Drink:  Coffee - " + GenerateInfo.coffee.getPrice() + " $");
                            Check.getSum().add(GenerateInfo.coffee.getPrice());
                            getStrava().add(GenerateInfo.coffee.getBeverage());
                            break;
                    }
                    logger.info("If do you want to order straws else, enter - dish number");
                    logger.info("If do you want to pay for the order, enter - 0");
                } else if (a == 0) {
                    Contact.check();
                    sum = Check.getSum().stream().mapToInt(Integer::intValue).sum();
                    logger.info("Your order: " + getStrava());
                    logger.info("To pay: " + sum + " $");
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
