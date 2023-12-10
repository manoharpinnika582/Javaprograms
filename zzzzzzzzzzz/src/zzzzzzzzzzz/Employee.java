package zzzzzzzzzzz;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private static int idGenerate = 1000;

    public Employee(String name, double salary) {
        this.id = ++idGenerate;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
