package com.solvd.cafe.employee;

import java.util.Objects;

public class Barmen extends Employee implements Info, Functionality {
    private String post = "Barmen";
    private float salary = 32.000f;

    public Barmen() {}

    public Barmen(String name, int age, String post, float salary) {

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
        Barmen barmen = (Barmen) o;
        return Float.compare(barmen.salary, salary) == 0 && Objects.equals(post, barmen.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(post, salary);
    }

    @Override
    public String toString() {
        return "Barmen: " + "ege=" + getAge() + ", "
                + "name=" + getName() + ", "
                + "post=" + post + ", "
                + "salary=" + salary;
    }
    @Override
    public void showInfo(){
        System.out.println("Name is: " + getName());
    }

    @Override
    public void function(){
        System.out.println("Run a bar");
    }
}
