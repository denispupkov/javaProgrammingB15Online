package day60.Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReading {

    public static void main(String[] args) throws IOException {

        try {
            List<String> allLines = Files.readAllLines(Paths.get
                    ("/Users/denispupkov/IdeaProjects/javaProgrammingB15Online/src/day60/note111.txt"));
//correct file name note.txt
            for (String eachLine : allLines) {
                System.out.println(eachLine);
            }
        } catch (Exception e) {
            System.out.println("BOOM!!!");
            System.out.println("FILE NOT EXIST " + e.getMessage());
        }

    }

}
