package day48;

public class HourlyEmployee extends Employee {

    double hourlyWage;
    double numsOfHours;
    //String name;
    //double id;

    public HourlyEmployee(double hourlyWage, double numsOfHours, String name, double id) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.numsOfHours = numsOfHours;
        // this.name = name;
        //this.id = id;
    }

    public void calculateAnualSalary() {
        System.out.println("hourly employee yearly " + (hourlyWage * numsOfHours));
        //double annual = numsOfHours*hourlyWage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numsOfHours=" + numsOfHours +
                ", name='" + name + '\'' +
                ", id=" + id +
                "yearly salary = " + (hourlyWage * numsOfHours) +
                '}';
    }
}
