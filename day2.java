import java.nio.file.Files;
import java.nio.file.Path;

public class day2 {
    public static void main(String[] args) throws Exception {

        //String inputT = Files.readString(Path.of("C:\\Users\\brunc\\OneDrive - ZHAW\\1.Semester\\AdventOfCode\\adventOfCode\\input\\day2Test.txt"));
        String input = Files.readString(Path.of("C:\\Users\\brunc\\OneDrive - ZHAW\\1.Semester\\AdventOfCode\\adventOfCode\\input\\day2.txt"));


        String[] lines = input.split("\r\n");

        int score = 0;
        int score2 = 0;
        for (String round : lines) {
            String[] picks = round.split(" ");
            if (picks[0].equals("A")) {
                switch (picks[1]) {
                    case "X":
                        score += 4;
                        score2 += 3;
                        break;
                    case "Y":
                        score += 8;
                        score2 += 4;
                        break;
                    case "Z":
                        score += 3;
                        score2 += 8;
                        break;
                }

            } else if (picks[0].equals("B")) {
                switch (picks[1]) {
                    case "X":
                        score += 1;
                        score2 += 1;
                        break;
                    case "Y":
                        score += 5;
                        score2 += 5;
                        break;
                    case "Z":
                        score += 9;
                        score2 += 9;
                        break;
                }
            } else if (picks[0].equals("C")) {
                switch (picks[1]) {
                    case "X":
                        score += 7;
                        score2 += 2;
                        break;
                    case "Y":
                        score += 2;
                        score2 += 6;
                        break;
                    case "Z":
                        score += 6;
                        score2 += 7;
                        break;
                }
            }


        }
        System.out.println(score);
        System.out.println(score2);
    }
}