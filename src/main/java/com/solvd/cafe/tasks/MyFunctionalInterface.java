package com.solvd.cafe.tasks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
public interface MyFunctionalInterface<T> {
    void test(T t);

    static void predicate() {

        final Logger logger = LogManager.getLogger(MyFunctionalInterface.class);

        MyFunctionalInterface<Integer> myPredicate = x -> logger.info(x);
        myPredicate.test(5);

        Predicate<Integer> predicate = x -> x > 5;
        logger.info(predicate.test(10));
        Consumer<String> consumer = x -> logger.info(x);
        consumer.accept("Java");
        String product = "Programing";
        Supplier<String> supplier = () -> product.toUpperCase();
        logger.info((supplier.get()));
    }
}
