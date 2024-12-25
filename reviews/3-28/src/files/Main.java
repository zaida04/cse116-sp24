package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static ArrayList<String> readFile(String filename) {
        Path pathToFile = Paths.get(filename);

        try {
            List<String> lines = Files.readAllLines(pathToFile);
            return new ArrayList<>(lines);
        } catch(IOException e) {
            System.out.println("There was an error reading your file. The path may be incorrect.");
            return null;
        }
    }


    public static void main(String[] args) {
        ArrayList<String> fileLines = Main.readFile("src/files/file.txt");
        for(String line: fileLines) {
            System.out.println(line);
        }
    }
}
