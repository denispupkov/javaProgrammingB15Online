package day61;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class JobHunter {

    public static void main(String[] args) {


        Job j1 = new Job("LA", 120000, "Falcon");
        Job j2 = new Job("NY", 110000, "Balcon");
        System.out.println("j2.compareTo(j1) = " + j2.compareTo(j1));

        Job j3 = new Job("FL", 100000, "Camcon");
        Job j4 = new Job("DC", 95000, "Celcon");
        Job j5 = new Job("CO", 100000, "Dulcon");
        System.out.println("j3.compareTo(j5) = " + j3.compareTo(j5));
        System.out.println("j1.compareTo(j4) = " + j1.compareTo(j4));


        LinkedList<Job> jobList = new LinkedList<>(Arrays.asList(j1, j2, j3, j4, j5));

        Collections.sort(jobList);
        System.out.println("jobList low to high order = " + jobList);
        Collections.sort(jobList, Comparator.reverseOrder()); //ONE WAY TO SORT
        System.out.println("jobList high to low order = " + jobList);
        Collections.sort(jobList, Collections.reverseOrder()); //SECOND WAY TO SORT
        System.out.println("jobList again             = " + jobList);
    }
}
