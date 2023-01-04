package com.solvd.cafe.service;

import com.solvd.cafe.cafe.Client;
import com.solvd.cafe.employee.*;
import com.solvd.cafe.equipment.BarCounter;
import com.solvd.cafe.equipment.Chairs;
import com.solvd.cafe.equipment.Equipment;
import com.solvd.cafe.equipment.Tables;
import com.solvd.cafe.menu.Desert;
import com.solvd.cafe.menu.FirstStrava;
import com.solvd.cafe.menu.Menu;
import com.solvd.cafe.menu.SecondStrava;
import com.solvd.cafe.menuBar.AlcoholicDrinks;
import com.solvd.cafe.menuBar.SoftDrinks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateInfo {
    private static final Logger logger = LogManager.getLogger(GenerateInfo.class);

    public static Administrator administrator;
    public static  Barmen barmen;
    public static Cook cook;
    public static Waiter waiter;
    static List<Employee> employeeService = List.of(
            administrator = new Administrator("Alen", 32, "Administrator", 35.000f),
            barmen = new Barmen("Jon", 28, "Barmen", 32.000f),
            cook = new Cook("Den", 33, "Cook", 47.000f),
            waiter = new Waiter("Paolo", 22, "Waiter", 25.000f));

    static List<Client> regularClientList = List.of(
            new Client("380508887755", "Calvin", "hhh@gmail.com"),
            new Client("380503345577", "Frank", "jjj@gmail.com"),
            new Client("380505558899", "Den", "uuu@gmail.com"));

    public static BarCounter barCounter;
    public static Chairs chairs;
    public static Tables table1;
    public static Tables table2;
    public static Tables table3;
    public static Tables table4;
    public static Tables table5;
    static List<Equipment> equipmentList = List.of(
            barCounter = new BarCounter("BarCounter", 1, "equipment"),
            chairs = new Chairs("Chairs", 15, "equipment"),
            table1 = new Tables("Table №1", 5, "equipment", 1, Collections.singletonList(1)),
            table2 = new Tables("Table №2", 5, "equipment", 2, Collections.singletonList(1)),
            table3 = new Tables("Table №3", 5, "equipment", 3, Collections.singletonList(3)),
            table4 = new Tables("Table №4", 5, "equipment", 4, Collections.singletonList(4)),
            table5 = new Tables("Table №5", 5, "equipment", 5, Collections.singletonList(5)));

    public static Desert tiramisu;
    public static Desert cheesecake;
    public static Desert trifle;
    public static FirstStrava hodgepodge;
    public static FirstStrava soup;
    public static FirstStrava pickleSoup;
    public static SecondStrava steak;
    public static SecondStrava salad;
    public static SecondStrava spaghetti;
    public static AlcoholicDrinks wine;
    public static AlcoholicDrinks champagne;
    public static SoftDrinks coffee;
    public static List<Menu> menuInfo = List.of(
            tiramisu = new Desert(15, 100, "Tiramisu", 1),
            cheesecake = new Desert(12, 150, "Cheesecake", 2),
            trifle = new Desert(17, 120, "Trifle", 3),
            hodgepodge = new FirstStrava(15, 100, "Hodgepodge", 4),
            soup = new FirstStrava(17, 100, "Soup", 5),
            pickleSoup = new FirstStrava(18, 100, "Pickle soup", 6),
            steak = new SecondStrava(35, 200, "Steak", 7),
            salad = new SecondStrava(25, 150, "Salad", 8),
            spaghetti = new SecondStrava(17, 300, "Spaghetti", 9),
            wine = new AlcoholicDrinks(20, 100, "Wine", 10),
            champagne = new AlcoholicDrinks(15, 150, "Champagne", 11),
            coffee = new SoftDrinks(10, 250, "Coffee", 12));

    public static void streamForEach() {
        Stream<Employee> stream = employeeService.stream();
        stream.forEach(x -> logger.info(x));

        Stream<Client> stream1 = regularClientList.stream();
        stream1.forEach(x -> logger.info(x));

        Stream<Equipment> stream2 = equipmentList.stream();
        stream2.forEach(x -> logger.info(x));
    }

    public static void menuInfo() {
        Stream<Menu> stream3 = menuInfo.stream();
        stream3.forEach(x -> logger.info(x));
    }

    public static void streamFilter() {
        Stream<Equipment> stream = equipmentList.stream();
        // create a predicate for a method filter();
        Predicate<Equipment> predicate;
        predicate = n -> (n.getTitle() != "BarCounter") && (n.getTitle() != "Chairs");
        Stream<Equipment> streamFiltered = stream.filter(predicate);
        //  outputting a new stream using an iterator
        Iterator<Equipment> iterator = streamFiltered.iterator();
        logger.info("Filtered stream: ");
        while (iterator.hasNext())
            System.out.print(iterator.next() + "\n");

    }

    public static void streamAllMatch() {
        LinkedList<String> employee = new LinkedList<>();
        employee.add(GenerateInfo.administrator.getName());
        employee.add(GenerateInfo.barmen.getName());
        employee.add(GenerateInfo.cook.getName());
        employee.add(GenerateInfo.waiter.getName());
        Stream<String> stream = employee.stream();

        boolean allMatch = stream.allMatch((value) -> {
            return value.startsWith("Jon");
        });
        System.out.println(allMatch);
    }

    public static void streamNoneMatch() {
        List<String> stringList = new ArrayList<String>();
        stringList.add("abc");
        stringList.add("bef");
        Stream<String> stream = stringList.stream();
        boolean noneMatch = stream.noneMatch((element) -> {
            return "gij".equals(element);
        });
        System.out.println("noneMatch = " + noneMatch);
    }

    public static void streamCollect() {
        List<String> stringList = new ArrayList<String>();
        stringList.add("The cafe is a new form of relaxation for those who appreciate peace");
        stringList.add("comfort and European level of service.");
        Stream<String> stream = stringList.stream();
        List<String> stringsAsUppercaseList = stream
                .map(value -> value.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(stringsAsUppercaseList);
    }

    public static void streamCount() {
        Stream<Menu> stream = menuInfo.stream();
        long count = stream.flatMap((value) -> {
                    int split = value.getNumber();
                    return Arrays.asList(split).stream();
                })
                .count();
        System.out.println("count = " + count);
    }

    public static void streamToArray() {
        Stream<Client> stream = regularClientList.stream();
        Object[] objects = stream.toArray();
        System.out.println(Arrays.toString(objects));
    }

    public static void streamMap() {
        List<String> stringList = new ArrayList<>();
        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");
        Stream<String> stream = stringList.stream();
        long count = stream
                .map((value) -> {
                    return value.toLowerCase();
                })
                .count();
        System.out.println("count = " + count);
    }
}
