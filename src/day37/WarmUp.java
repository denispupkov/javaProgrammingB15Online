package day37;

import java.util.ArrayList;
import java.util.List;

public class WarmUp {

    public static void main(String[] args) {


        //ArrayList<String> teamMates = new ArrayList<>(); //one way
        List<String> teamMates = new ArrayList<>(); // another way
        teamMates.add("Akbar");
        teamMates.add("Kuzzat");
        teamMates.add("Murodil");
        teamMates.add("Maruf");
        teamMates.add("Vasyl");

        System.out.println("teamMates = " + teamMates);
    
    //first and last item
        System.out.println("First Item = " + teamMates.get(0));
        System.out.println("Last Item = " + teamMates.get(teamMates.size()-1));


        //print one by one

        for (int i = 0; i < teamMates.size(); i++) {

            System.out.println("teamMates = " + teamMates.get(i));
        }
    //reverse print

        for (int i = teamMates.size()-1; i >=0 ; i--) {

            System.out.println("teamMates REVERSE = " + teamMates.get(i));
        }
//print 2 items at a time

        for (int i = 0; i < teamMates.size()-1; i++) {

            System.out.println("first item  " + teamMates.get(i)+" and neighbor item "+teamMates.get(i+1));

        }

    //concat everything
        String result ="";

        for (int i = 0; i <teamMates.size() ; i++) {

          if (i!=teamMates.size()) {
            result=result+teamMates.get(i)+"-";
        }
        }

        System.out.println("result = " + result);

        String lstToString=teamMates.toString(); //turn into String
        System.out.println("lstToString = " + lstToString.replace(", ", "-"));
    }
}
