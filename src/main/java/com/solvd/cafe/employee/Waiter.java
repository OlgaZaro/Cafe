package com.solvd.cafe.employee;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Waiter extends Employee implements Info, Functionality {
    private static final Logger logger = LogManager.getLogger(Waiter.class);
    private String post = "Waiter";
    private float salary = 25.000f;

    public Waiter() {}

    public Waiter(String name, int age, String post, float salary) {
        super(name, age);
        this.post = post;
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public float getSalary() {
        return salary;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Waiter waiter = (Waiter) o;
        return Float.compare(waiter.salary, salary) == 0 && Objects.equals(post, waiter.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(post, salary);
    }

    @Override
    public String toString() {
        return "Waiter: " + "ege=" + getAge() + ", "
                + "name=" + getName() + ", "
                + "post=" + post + ", "
                + "salary=" + salary;
    }
    @Override
    public void showInfo(){
        logger.info("Name is: " + getName());
    }

    @Override
    public void function(){
        logger.info("Serve customers");
    }
}
