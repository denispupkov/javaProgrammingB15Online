package day35;

public class BoxingUnboxingIntro {

    public static void main(String[] args) {

      //  String caseNumber = "IPR2012-00001";
       // int year;

        //String strYear = caseNumber.substring(3,7);
        //year=Integer.parseInt(strYear);

        //System.out.println("strYear = " + strYear);

        System.out.println(getYearOutOfCaseNumber("DER2019-000034"));
        System.out.println(getYearOutOfCaseNumber("IPR2009-019034"));
        System.out.println(getYearOutOfCaseNumber("CBM2001-10034"));
    }

public static int getYearOutOfCaseNumber (String caseNumber) {

    int year;

    String strYear = caseNumber.substring(3,7);
    year=Integer.parseInt(strYear);
        return Integer.parseInt(caseNumber.substring(3,7));




    }


}
