import java.nio.file.Files;
import java.nio.file.Path;

public class day5 {
    public static void main(String[] args) throws Exception {
        String inputT = Files.readString(Path.of("C:\\Users\\brunc\\OneDrive - ZHAW\\1.Semester\\AdventOfCode\\adventOfCode\\input\\day5Test.txt"));
        String input = Files.readString(Path.of("C:\\Users\\brunc\\OneDrive - ZHAW\\1.Semester\\AdventOfCode\\adventOfCode\\input\\day5.txt"));


        int sum = 0;
        //split the string into an array of strings
        String[] lines = input.split("\r\n");

        System.out.println(lines);
    }
}
