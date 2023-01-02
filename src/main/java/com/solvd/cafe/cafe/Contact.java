package com.solvd.cafe.cafe;

import com.solvd.cafe.employee.Employee;
import com.solvd.cafe.employee.Waiter;
import com.solvd.cafe.exceptions.EmailException;
import com.solvd.cafe.exceptions.PhoneException;
import com.solvd.cafe.service.BankService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Contact extends Check {
    public static Client client = new Client();
    private static final Logger logger = LogManager.getLogger(Contact.class);
    private int clientPhone;
    private String clientEmail;

    public Contact() {}

    public Contact(int clientPhone, String clientEmail) {
        this.clientPhone = clientPhone;
        this.clientEmail = clientEmail;
    }

    public int getClientPhone() {
        return this.clientPhone;
    }

    public void setClientPhone(int clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientEmail() {
        return this.clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public static void contact() throws PhoneException {
        logger.info("Enter phone number: ");
        Scanner scanner = new Scanner(System.in);
        try {
            if (scanner.hasNextInt()) {
                client.setClientPhone(scanner.nextInt());
                logger.info("You entered the number: " + client.getClientPhone());
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
            client.setClientEmail(scanner.nextLine());
            logger.info("You entered the email: " + client.getClientEmail());
        } else {
            throw new EmailException();
        }
    }

    public static void check() {
        Check check = new Check();
        check.setNumberCheck(1);
        logger.info("Check number: " + check.getNumberCheck());
        logger.info("Waiter name: " + Employee.waiter.getName());
    }
}

