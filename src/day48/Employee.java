package day48;

public abstract class Employee {

    String name;
    double id;

    public Employee() {

    }

    public Employee(String name, double id) {
        this.name = name;
        this.id = id;
    }

    public abstract void calculateAnualSalary();


    public abstract String toString();

}
