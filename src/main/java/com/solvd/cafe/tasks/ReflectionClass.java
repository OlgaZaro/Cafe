package com.solvd.cafe.tasks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionClass {
    private static final Logger logger = LogManager.getLogger(ReflectionClass.class);
    private static String name = "default";
    private static int number = 5;


    //public MyClass(int number, String name) { this.number = number; this.name = name; }

    //private String getName() { return name; }
    //private int getNumber() { return number; }
    //private void setName(String name) { this.name = name; }
    //private void setNumber(int number) { this.number = number; }

    private void printData(){
        System.out.println(number +" "+ name);
    }

    public static void reflection() { //get access to private fields: name and number
        ReflectionClass myClass = new ReflectionClass();
        try {
            Field field = myClass.getClass().getDeclaredField("name");
            Field field1 = myClass.getClass().getDeclaredField("number");
            field.setAccessible(true);
            name = (String) field.get(myClass);
            number = (int) field1.get(myClass);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        printData(myClass);
    }
    public static void printData(Object myClass){ //get access to a private method
        try {
            Method method = myClass.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(myClass);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
