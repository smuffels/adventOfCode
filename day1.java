import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;

public class day1 {
    public static void main(String[] args) throws Exception {
        //String inputT = Files.readString(Path.of("C:\\Users\\brunc\\OneDrive - ZHAW\\1.Semester\\AdventOfCode\\adventOfCode\\input\\day1Test.txt"));
        String input = Files.readString(Path.of("C:\\Users\\brunc\\OneDrive - ZHAW\\1.Semester\\AdventOfCode\\adventOfCode\\input\\day1.txt"));


        String[] split = input.split("\r\n\r\n");

        ArrayList<Integer> caloriesList = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split("\r\n");
            int sum = 0;
            for (int j = 0; j < split2.length; j++) {
                sum += Integer.parseInt(split2[j]);
            }
            caloriesList.add(sum);
            System.out.println(sum);
        }
        //get max value of caloriesList
        int max = Collections.max(caloriesList);
        System.out.println("Max value: " + max);

        //get top 3 of arraylist
        Collections.sort(caloriesList);
        Collections.reverse(caloriesList);
        //get sum of top 3
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += caloriesList.get(i);
        }
        System.out.println("Sum of top 3: " + sum);
    }
}