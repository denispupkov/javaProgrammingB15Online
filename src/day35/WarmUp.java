package day35;

public class WarmUp {

    public static void main(String[] args) {

String stringNum = "100";
int num = Integer.parseInt(stringNum);
        System.out.println("num = " + num);
String empID = "FB-457";

int id = Integer.parseInt(empID.split("-")[1]); //option 1
        System.out.println("id = " + id); //option 1

        String[] emplIDSplit = empID.split("-");//option 2
        String idStr = emplIDSplit[1];
        int idInt = Integer.parseInt(idStr);

        System.out.println("idInt = " + idInt);

    String twoNumbers="100,600";
    String [] splitted =twoNumbers.split(",");
    String firstNumber = splitted[0];
    String secondNumber = splitted[1];

    int number1Int = Integer.parseInt(firstNumber);
    int number2Int=Integer.parseInt((secondNumber));


    int result = number1Int+number2Int;

        System.out.println("result = " + result);

    }
}
