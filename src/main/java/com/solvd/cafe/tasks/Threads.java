package com.solvd.cafe.tasks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads {
    private static final Logger logger = LogManager.getLogger(Threads.class);

    static class Tasks implements Runnable {
        private String taskName;

        public Tasks(String taskName) {
            this.taskName = taskName;
        }

        // Printing the task name and then sleeps for 1 sec
        public void run() {
            try {
                for (int j = 0; j <= 3; j++) {
                    if (j == 0) {
                        Date dt = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");

                        //prints the initialization time for every task
                        logger.info("Initialization time for the task name: "
                                + taskName + " = " + sdf.format(dt));
                    } else {
                        Date dt = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");
                        // prints the execution time for every task
                        logger.info("Time of execution for the task name: "
                                + taskName + " = " + sdf.format(dt));
                    }
                    // 1000ms = 1 sec
                    Thread.sleep(1000);
                }
                logger.info(taskName + " is complete.");
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public static class ThreadPoolExample {
        static Runnable rb1 = new Tasks("task 1");
        static Runnable rb2 = new Tasks("task 2");
        static Runnable rb3 = new Tasks("task 3");
        // Maximum number of threads in the thread pool
        static final int MAX_TH = 3;

        public static void start() {
            ExecutorService pl = Executors.newFixedThreadPool(MAX_TH);
            pl.execute(rb1);
            pl.execute(rb2);
            pl.execute(rb3);
            // pool is shutdown
            pl.shutdown();
        }
    }
}
