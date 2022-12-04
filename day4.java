import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class day4 {
    public static void main(String[] args) throws Exception {

        // read input from file to string from /day4-input.txt
        String inputT = Files.readString(Path.of("C:\\Users\\brunc\\OneDrive - ZHAW\\1.Semester\\AdventOfCode\\adventOfCode\\input\\day4Test.txt"));
        String input = Files.readString(Path.of("C:\\Users\\brunc\\OneDrive - ZHAW\\1.Semester\\AdventOfCode\\adventOfCode\\input\\day4.txt"));


        int sum = 0;
        //split the string into an array of strings
        String[] lines = input.split("\r\n");
        for (String line : lines) {
            ArrayList<Integer> elfe1 = new ArrayList<>();
            ArrayList<Integer> elfe2 = new ArrayList<>();
            String[] elfeSections = line.split(",");
            for (int i = 0; i < elfeSections.length; i++) {

                String[] elfe = elfeSections[i].split("-");

                for (int j = Integer.parseInt(elfe[0]); j <= Integer.parseInt(elfe[1]); j++) {
                    if (i == 0) {
                        elfe1.add(j);
                    } else if (i == 1) {
                        elfe2.add(j);
                    }
                }
            }
            //Task 1
            /*if (elfe1.containsAll(elfe2) || elfe2.containsAll(elfe1)) {
                sum += 1;
            }*/
            //intersect of two lists
            //Task 2
            elfe1.retainAll(elfe2);
            if (elfe1.size() > 0) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}