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

    static List<Employee> employeeService = List.of(
            new Administrator("Alen", 32, "Administrator", 35.000f),
            new Barmen("Jon", 28, "Barmen", 32.000f),
            new Cook("Den", 33, "Cook", 47.000f),
            new Waiter("Paolo", 22, "Waiter", 25.000f));

    static List<Client> regularClientList = List.of(
            new Client(77789070, "Calvin", "hhh@gmail.com"),
            new Client(878970563, "Frank", "jjj@gmail.com"),
            new Client(79837569, "Den", "uuu@gmail.com"));

    static List<Equipment> equipmentList = List.of(
            new BarCounter("BarCounter", 1, "equipment"),
            new Chairs("Chairs", 15, "equipment"),
            new Tables("Table №1", 5, "equipment", 1),
            new Tables("Table №2", 5, "equipment", 2),
            new Tables("Table №3", 5, "equipment", 3),
            new Tables("Table №4", 5, "equipment", 4),
            new Tables("Table №5", 5, "equipment", 5));

    static List<Menu> menuInfo = List.of(
            new Desert(15, 100, "Tiramisu", 1),
            new Desert(12, 150, "Cheesecake", 2),
            new Desert(17, 120, "Trifle", 3),
            new FirstStrava(15, 100, "Hodgepodge", 4),
            new FirstStrava(17, 100, "Soup", 5),
            new FirstStrava(18, 100, "Pickle soup", 6),
            new SecondStrava(35, 200, "Steak", 7),
            new SecondStrava(25, 150, "Salad", 8),
            new SecondStrava(17, 300, "Spaghetti", 9),
            new AlcoholicDrinks(20, 100, "Wine", 10),
            new AlcoholicDrinks(15, 150, "Champagne", 11),
            new SoftDrinks(10, 250, "Coffee", 12));

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
        employee.add(Administrator.administrator.getName());
        employee.add(Barmen.barmen.getName());
        employee.add(Cook.cook.getName());
        employee.add(Waiter.waiter.getName());
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
