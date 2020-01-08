package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {
public static void main(String[]args){
    


    List<String> superheros = new ArrayList();
    superheros.add("Superman");
    superheros.add("Batman");
    superheros.add("Wonder Woman");
    superheros.add("Cyborg");
    superheros.add("Aquaman");
    superheros.add("Flash");
    System.out.println("superheros = " + superheros);

    System.out.println("superheros.contains(\"man\") = " + superheros.contains("man"));
    System.out.println("superheros.contains(\"Superman\") = " + superheros.contains("Superman"));

    for (int x = 0; x < superheros.size(); x++) {
        String currentHero = superheros.get(x);
        if (!currentHero.contains("man")) {
            superheros.remove(currentHero);
            --x; //shifts index after removing item
        }

    }
    System.out.println("superheros = " + superheros);
List<String> superHeroCopy = new ArrayList<>(superheros); //copy ArrayList to new ArrayList

    System.out.println("superHeroCopy = " + superHeroCopy);

    //This will creat an Unmodifiable list
    List<String> topics = Arrays.asList("Java","Selenium","Database","API" );
    System.out.println("topics = " + topics);
//copy everything inside to topicCopy and we can do anything with it
    List<String> topicsCopy=new ArrayList<>(topics);
    System.out.println("topicsCopy = " + topicsCopy);
}

}