package com.solvd.cafe.cafe;

import com.solvd.cafe.employee.Employee;
import com.solvd.cafe.equipment.Tables;
import com.solvd.cafe.exceptions.EmailException;
import com.solvd.cafe.exceptions.PhoneException;
import com.solvd.cafe.service.GenerateInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact extends Check {
    private static final Logger logger = LogManager.getLogger(Contact.class);
    private static String clientPhone;
    private String clientEmail;

    public Contact() {}

    public Contact(String clientPhone, String clientEmail) {
        this.clientPhone = clientPhone;
        this.clientEmail = clientEmail;
    }

    public String getClientPhone() {
        return this.clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientEmail() {
        return this.clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public static void contact() {
        logger.info("Enter phone number: ");
        Scanner scanner = new Scanner(System.in);
        try {
            if (scanner.hasNextLine()) {
                Client.client.setClientPhone(String.valueOf(scanner.nextInt()));
                logger.info("You entered the number: " + Client.client.getClientPhone());
            } else {
                throw new PhoneException();
            }
        } catch (Exception e) {
            e.printStackTrace();
            contact();
        }
    }

    public static void clientEmail() throws EmailException {
        logger.info("Enter email: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            Client.client.setClientEmail(scanner.nextLine());
            logger.info("You entered the email: " + Client.client.getClientEmail());
        } else {
            throw new EmailException();
        }
    }

    public static void data() {
        logger.info("Table number: " + Tables.getNumber());
        logger.info("Waiter name: " + GenerateInfo.waiter.getName());
    }
}

