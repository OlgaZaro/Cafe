package com.solvd.cafe.tasks;

import com.solvd.cafe.tasks.Deadlock;
import com.solvd.cafe.tasks.Threads;

public class Main1 {
    public static void main(String[] args) {

        Deadlock.startDeadlock();
        Threads.ThreadPoolExample.start();
    }
}
