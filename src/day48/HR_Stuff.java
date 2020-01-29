package day48;

import java.util.Arrays;
import java.util.List;

public class HR_Stuff {

    public static void main(String[] args) {


        // HourlyEmployee e1=new HourlyEmployee(55,2000,"Denis",1234567);

        Employee e1 = new HourlyEmployee(55, 2000, "Denis", 1234567);
//e1.calculateAnualSalary();
        // e1=new FullTimeEmployee("Ainura",666555444,6000);
        e1.calculateAnualSalary();
        Employee e2 = new FullTimeEmployee("Tom", 1009865, 12000);
        Employee e3 = new HourlyEmployee(45, 1500, "Ben", 987654);

        List<Employee> allEmployee = Arrays.asList(e1, e2, e3);

        for (Employee eachEmployee : allEmployee) {
            // System.out.println("eachEmployee = " + eachEmployee);
            System.out.println("Name is " + eachEmployee.name);
            eachEmployee.calculateAnualSalary();
        }
    }
}
