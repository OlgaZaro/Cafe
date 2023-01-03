package com.solvd.cafe.cafe;

import com.solvd.cafe.exceptions.EmailException;
import com.solvd.cafe.exceptions.NumberException;
import com.solvd.cafe.exceptions.PhoneException;
import com.solvd.cafe.service.ClientService;
import com.solvd.cafe.service.GenerateInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;

public class Client extends Contact {
    static Client client = new Client();
    private String clientName;

    private static final Logger logger = LogManager.getLogger(Client.class);
    public Client() {}

    public Client(String clientName) {
        this.clientName = clientName;
    }

    public Client(int clientPhone, String clientEmail, String clientName) {
        super(clientPhone, clientEmail);
        this.clientName = clientName;
    }

    public String getClientName() { return clientName; }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "Client: " + "clientName=" + getClientName() + ", "
                + "clientPhone=" + getClientPhone() + ", "
                + "clientEmail=" + getClientEmail() + ", ";
    }

    public void clientSet() {
        TreeSet<Client> client = new TreeSet<>();
        client.add(new Client());
    }

    public static void clientName() {
        logger.info("Enter your name");
        Scanner scanner = new Scanner(System.in);
        client = new Client(scanner.nextLine());
        try {
            logger.info("You entered the name: " + client.getClientName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void registration() throws PhoneException, EmailException, NumberException {
        logger.info("If do you want to register for bonuses enter - 1");
        logger.info("If you just want to order dishes, enter - 2");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number == 1) {
                Client.clientName();
                Contact.contact();
                Contact.clientEmail();
                logger.info("Congratulations, you are registered." +
                        " Now you can receive bonuses for your orders");
                logger.info("If would you like to choose from the menu, enter  - 1, if not - 2");
                select();
            }
            if (number == 2) {
                chooseMenu();
                ClientService.stravaOrder();
            }
        } else {
            new NumberException();
            registration();
        }
    }
    public static void chooseMenu() {
        logger.info("Select the number of the dish you want to order from the menu:");
        GenerateInfo.menuInfo();
    }

    public static void select() throws NumberException {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number == 1) {
                chooseMenu();
                ClientService.stravaOrder();
            }
        } else {
            new NumberException();
            select();
        }
    }
}