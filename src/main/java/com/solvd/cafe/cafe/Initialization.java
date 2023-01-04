package com.solvd.cafe.cafe;

import com.solvd.cafe.equipment.Equipment;
import com.solvd.cafe.equipment.Tables;
import com.solvd.cafe.exceptions.EmailException;
import com.solvd.cafe.exceptions.NumberException;
import com.solvd.cafe.exceptions.PhoneException;
import com.solvd.cafe.service.GenerateInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Collections;
import java.util.Scanner;

public class Initialization {
    private static final Logger logger = LogManager.getLogger(Initialization.class);

    public static void greetings() {
        logger.info("Good afternoon!");
        logger.info("If you want to reserve a table, enter - 1");
    }

    public static void greetings1() throws PhoneException, NumberException, EmailException {

        logger.info("If you have booked a table, please enter your first and last name");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals(Client.client.getClientName())) {
            logger.info("You table number: " + Tables.getNumber());
            initialization();
        } else {
            logger.error("Sorry, there is no table reservation for this name, please enter the number again");
            greetings1();
        }
    }

    public static void initialization() throws PhoneException, EmailException, NumberException {

        logger.info("If you want to make a order, enter - 2");

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 0 && number < 3) {
                if (number == 2) {
                    Client.registration();
                }
                if (number == 1) {
                    Client.clientName();
                    Contact.contact();
                    logger.info("To reserve a table, select a table number from the list : ");
                    tableSelect();
                }
            } else {
                logger.error("You entered the wrong number, please enter the number again");
                initialization();
            }
        } else {
            logger.error("You entered the wrong number, please enter the number again");
            initialization();
        }
    }
    public static void tableSelect() throws PhoneException, NumberException, EmailException {
        Scanner scanner = new Scanner(System.in);
        Equipment.tableList();
        if (scanner.hasNextInt()) {
            int tableNumber = scanner.nextInt();
            if (tableNumber > 0 && tableNumber < 6) {
                switch (tableNumber) {
                    case 1:
                        logger.info(GenerateInfo.table1.getTitle() + " reserved for the client " + Client.client.getClientName());
                        Tables.setNumber(Collections.singletonList(1));
                        break;
                    case 2:
                        logger.info(GenerateInfo.table2.getTitle() + " reserved for the client " + Client.client.getClientName());
                        Tables.setNumber(Collections.singletonList(2));
                        break;
                    case 3:
                        logger.info(GenerateInfo.table3.getTitle() + " reserved for the client " + Client.client.getClientName());
                        Tables.setNumber(Collections.singletonList(3));
                        break;
                    case 4:
                        logger.info(GenerateInfo.table4.getTitle() + " reserved for the client " + Client.client.getClientName());
                        Tables.setNumber(Collections.singletonList(4));
                        break;
                    case 5:
                        logger.info(GenerateInfo.table5.getTitle() + " reserved for the client " + Client.client.getClientName());
                        Tables.setNumber(Collections.singletonList(5));
                        break;
                }
                greetings1();
            } else {
                logger.error("You entered the wrong number, please enter the number again");
                tableSelect();
            }
        } else {
            logger.error("You entered the wrong number, please enter the number again");
            tableSelect();
        }
    }
}