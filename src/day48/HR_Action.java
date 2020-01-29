package day48;

public class HR_Action {

    public static void main(String[] args) {

        HourlyEmployee e1 = new HourlyEmployee(55, 2000, "Denis", 1234567);
        e1.calculateAnualSalary();

        System.out.println("e1 = " + e1);

        HourlyEmployee e2 = new HourlyEmployee(45, 1500, "Ben", 987654);
        System.out.println("e2 = " + e2);

        FullTimeEmployee e3 = new FullTimeEmployee("Ainura", 666555444, 6000);
        e3.calculateAnualSalary();
        System.out.println("e3 = " + e3);

        FullTimeEmployee e4 = new FullTimeEmployee("Tom", 1009865, 12000);


    }
}
