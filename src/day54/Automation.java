package day54;

public class Automation {

    public static void main(String[] args) {

        WebDriver c1 = new ChromeDriver();
        c1.navigateTo("www.cybertekschool.com");
        c1.maximize();
        c1.closeBrowser();
        System.out.println("c1.toString() = " + c1.toString());


    }
}
