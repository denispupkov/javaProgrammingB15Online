package day62;


import day61.Job;

import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {

    public static void main(String[] args) {

        SortedSet<Job> sortJobs = new TreeSet<>();


        sortJobs.add(new Job("New York", 120000, "AT&T"));
        sortJobs.add(new Job("California", 115000, "Google"));
        sortJobs.add(new Job("Seattle", 99000, "Amazon"));
        sortJobs.add(new Job("Ohio", 95000, "DSW"));
        sortJobs.add(new Job("California", 125000, "Apple"));

        for (Job each : sortJobs) {
            System.out.println("each = " + each);
        }


    }
}
