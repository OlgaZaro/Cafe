package com.solvd.cafe.employee;

import java.util.Objects;

public class Administrator extends Employee implements Info, Functionality {
    private String post = "Administrator";
    private float salary = 35.000f;

    public Administrator() {}

    public Administrator(String name, int age, String post, float salary) {
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
        Administrator that = (Administrator) o;
        return Float.compare(that.salary, salary) == 0 && Objects.equals(post, that.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(post, salary);
    }

    @Override
    public String toString() {
        return "Administrator: " + "ege=" + getAge() + ", "
                + "name=" + getName() + ", "
                + "post=" + post + ", "
                + "salary=" + salary;
    }
    @Override
    public void showInfo() {
        System.out.println("Name is: " + getName());
    }

    @Override
    public void function() {
        System.out.println("Administer the cafe");
    }
}
