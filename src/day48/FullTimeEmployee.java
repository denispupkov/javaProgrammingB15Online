package day48;

public class FullTimeEmployee extends Employee {

    //String name;
    //double id;
    double monthlySalary;

    public FullTimeEmployee(String name, double id, double monthlySalary) {
        super(name, id);
        // this.name = name;
        //this.id = id;
        this.monthlySalary = monthlySalary;
    }

    public void calculateAnualSalary() {
        System.out.println("full time employee yearly " + monthlySalary * 12);
    }

//    @Override
//    public void calculateAnualSalary() {
//
//    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}
