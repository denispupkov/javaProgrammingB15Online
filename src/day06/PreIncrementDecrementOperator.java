package day06;

public class PreIncrementDecrementOperator {

    public static void main(String[] args) {

        int offerCount =2;
        offerCount=offerCount+1; //first option to increase value by 1
        offerCount+=1; //second option to increase value by 1 using compound/shorthand operator
        ++offerCount;  //third option to increase value by 1
        System.out.println("Offer now "+offerCount);



    }
}
