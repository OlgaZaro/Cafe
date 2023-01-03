package com.solvd.cafe.cafe;

import com.solvd.cafe.equipment.Equipment;
import com.solvd.cafe.exceptions.EmailException;
import com.solvd.cafe.exceptions.NumberException;
import com.solvd.cafe.exceptions.PhoneException;
import com.solvd.cafe.service.BankService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Initialization {
    private static final Logger logger = LogManager.getLogger(Initialization.class);

    public static void greetings() {
        logger.info("Good afternoon!");
    }

    public static void initialization() throws PhoneException, EmailException, NumberException {
        logger.info("If you want to make a order, enter - 1");
        logger.info("If you want to reserve a table, enter - 2");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 0 && number < 3) {
                if (number == 1) {
                    Client.registration();
                }
                if (number == 2) {
                    Client.clientName();
                    Contact.contact();
                    logger.info("To reserve a table, select a table number from the list : ");
                    Equipment.tableList();
                    if (scanner.hasNextInt()) {
                        int tableNumber = scanner.nextInt();
                        if (tableNumber > 0 && tableNumber < 6) {
                            switch (tableNumber) {
                                case 1:
                                    logger.info(Equipment.table1.getTitle() + " reserved");
                                    break;
                            }
                            switch (tableNumber) {
                                case 2:
                                    logger.info(Equipment.table2.getTitle() + " reserved");
                                    break;
                            }
                            switch (tableNumber) {
                                case 3:
                                    logger.info(Equipment.table3.getTitle() + " reserved");
                                    break;
                            }
                            switch (tableNumber) {
                                case 4:
                                    logger.info(Equipment.table4.getTitle() + " reserved");
                                    break;
                            }
                            switch (tableNumber) {
                                case 5:
                                    logger.info(Equipment.table5.getTitle() + " reserved");
                                    break;
                            }
                            logger.info("We expect you soon!");
                        } else {
                            logger.error("You entered the wrong number");
                            initialization();
                        }
                    } else {
                        logger.error("You entered the wrong number");
                        initialization();
                    }
                }
            } else {
                logger.error("You entered the wrong number");
                initialization();
            }
        }  else {
            logger.error("You entered the wrong number");
            initialization();
        }
    }
}