package day58;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("before try catch");

        Files.readAllLines(Paths.get("file.txt"));
        //   try {
        //  Files.readAllLines(Paths.get("file.txt"));
//        } catch (IOException e) {
//            System.out.println("exception caught");
//        }
        System.out.println("After try catch");
    }
}
