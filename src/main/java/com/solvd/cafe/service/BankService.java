package com.solvd.cafe.service;


import com.solvd.cafe.cafe.Initialization;
import com.solvd.cafe.exceptions.EmailException;
import com.solvd.cafe.exceptions.NumberException;
import com.solvd.cafe.exceptions.PhoneException;

public class BankService {
    public static void start() throws PhoneException, NumberException, EmailException {

        Initialization.greetings();
        Initialization.initialization();
    }
}
