package day36;

import java.util.ArrayList;

public class ArrayListMethod2 {

    public static void main(String[] args) {

        ArrayList<Long> lst =new ArrayList<>();

        //CRUD - create, read, update, delete

        lst.add(12L);
        lst.add(100L);
        lst.add(500L);
        lst.add(200L);
        lst.add(null); //you can add nullnto a list

        System.out.println("lst = " + lst);
lst.add(2,125L); //inserted value inside Arraylist

        System.out.println("lst = " + lst);

  //updating value
        lst.set(3,195L);
        System.out.println("lst = " + lst);

        //removing by object
        lst.remove(100L);
        System.out.println("lst = " + lst);
        //removing by index
        lst.remove(2);
        System.out.println("lst = " + lst);
        
        //location 
        System.out.println("lst.indexOf(200L) = " + lst.indexOf(200L));

        //is empty or not
        System.out.println("lst.isEmpty() = " + lst.isEmpty()); //1st way
        System.out.println("lst = " + (lst.size()>0)); //2nd way

        //delete everything
        lst.clear();
        System.out.println("lst = " + lst);
        lst.isEmpty();                      // check if it is empty
        System.out.println("lst = " + lst);

        //check if we have sertain item or not

        lst.contains(100L);
        System.out.println("lst = " + lst);
                        //check the list if we don't know exact item (using -1 as a result)
        System.out.println("lst.indexOf(10L) = " + (lst.indexOf(10L)!=-1));
        

    }
}
