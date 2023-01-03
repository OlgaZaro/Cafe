package com.solvd.cafe;

import com.solvd.cafe.exceptions.EmailException;
import com.solvd.cafe.exceptions.NumberException;
import com.solvd.cafe.exceptions.PhoneException;
import com.solvd.cafe.service.ClientService;


public class Main {

    public static void main(String[] args) throws PhoneException, EmailException, NumberException {

        ClientService.start();
    }
}
