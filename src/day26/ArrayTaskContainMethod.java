package day26;

import java.util.Arrays;

public class ArrayTaskContainMethod {

    public static void main(String[] args) {


        String[] marvelHeroes = {"Iron Man", "Captain America", "Spider man",
                "Black Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel",
                "Captain America", "Spider man",
                "Black Widow", "Wanda", "Captain Marvel",
                "Captain America"};

        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeroes));
        int sizeOfArray = marvelHeroes.length;
        System.out.println("Hero count = " + sizeOfArray);

        String itemToSearch = "Black Widow";
        int countOfItem = 0;

        for (String eachHero : marvelHeroes) {

            if (eachHero.toLowerCase().contains("black")) { //IN ORDER NOT CARE ABOUT THE CASE
                countOfItem++;
            }

        }

        // COUNT THE HERO WITH WITH THE NAME CONTAINS BLACK

        System.out.println("Black count Of Item = " + countOfItem);


    }


}


