package day15;

public class reversingAString {

    public static void main(String[] args) {

        String name ="Denis";

        System.out.println(name.charAt(0)+" "+name.charAt(1)+" "+name.charAt(2)+
                " "+name.charAt(3)+" "+name.charAt(4));

        int characterCount= name.length(); //WILL BE USED EVERYWHERE!!!
        int lastCharIndex=characterCount-1;//WILL BE USED EVERYWHERE!!!
        char lastChar=name.charAt(lastCharIndex);//WILL BE USED EVERYWHERE!!!

        System.out.println(lastChar);

        //--------------------------------- Shorter way to resolve


        //System.out.println(name.charAt(name.length()-1);
        System.out.println("last char in on shot " + name.charAt(name.length() - 1));



    }
}
