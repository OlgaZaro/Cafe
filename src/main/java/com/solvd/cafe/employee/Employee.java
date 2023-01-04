package com.solvd.cafe.employee;

import com.solvd.cafe.menuBar.AlcoholicDrinks;
import com.solvd.cafe.service.GenerateInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;
import java.util.stream.Stream;

public abstract class Employee {
    private static final Logger logger = LogManager.getLogger(Employee.class);
    private String name;
    private int age;
    private static int countPeople;

    public Employee() {}

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public static void employee() {
        LinkedList<String> employee = new LinkedList<>();

        employee.add(0, GenerateInfo.administrator.getName());
        employee.add(1, GenerateInfo.barmen.getName());
        employee.add(2, GenerateInfo.cook.getName());
        employee.add(3, GenerateInfo.waiter.getName());

        Stream<String> stream = employee.stream();
        stream.forEach(x -> logger.info(x));
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printNumberEmployee() {
        System.out.println("Number of employee" + countPeople);
    }

    public static void info() {
        Info info = new Administrator("Alen", 32, "Administrator", 35.000f);
        Info info1 = new Barmen("Jon", 28, "Barmen", 32.000f);
        Info info2 = new Cook("Den", 33, "Cook", 47.000f);
        Info info3 = new Waiter("Paolo", 22, "Waiter", 25.000f);
        info.showInfo();
        info1.showInfo();
        info2.showInfo();
        info3.showInfo();
    }
}
