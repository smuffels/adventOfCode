import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class day3 {
    public static void main(String[] args) throws Exception {

        //String inputT = Files.readString(Path.of("C:\\Users\\brunc\\OneDrive - ZHAW\\1.Semester\\AdventOfCode\\adventOfCode\\input\\day3Test.txt"));
        String input = Files.readString(Path.of("C:\\Users\\brunc\\OneDrive - ZHAW\\1.Semester\\AdventOfCode\\adventOfCode\\input\\day3.txt"));


        ArrayList<String> duplicateLetters = new ArrayList<>();
        String[] lines = input.split("\r\n");
        //aufgabe2
        //get lines in pairs of three

        ArrayList<String> badgeItems = new ArrayList<>();
for (int i = 0; i < lines.length; i += 3) {
    String line1 = lines[i];
    String line2 = lines[i + 1];
    String line3 = lines[i + 2];

    //get name of longest line
    String shortestLine = "";
    String otherLine1 = "";
    String otherLine2 = "";
   /* if (line1.length() < line2.length() && line1.length() < line3.length()) {
        shortestLine = line1;
        otherLine1 = line2;
        otherLine2 = line3;
    } else if (line2.length() < line1.length() && line2.length() < line3.length()) {
        shortestLine = line2;
        otherLine1 = line1;
        otherLine2 = line3;
    } else if (line3.length() < line1.length() && line3.length() < line2.length()) {
        shortestLine = line3;
        otherLine1 = line1;
        otherLine2 = line2;
    }*/
    shortestLine = line1;
    otherLine1 = line2;
    otherLine2 = line3;


    for (int j = 0; j < shortestLine.length(); j++) {
        String firstLetter = shortestLine.substring(j, j + 1);
        if (otherLine1.contains(firstLetter) && otherLine2.contains(firstLetter)) {
            badgeItems.add(firstLetter);
            break;
        }

    }
}

        int sumItems = 0;
        //get alphabetic number of letter
        for (int k = 0; k < badgeItems.size(); k++) {
            String item = badgeItems.get(k);
            //check if duplicate letter is uppercase
            if (item.equals(item.toUpperCase())) {
                int letterNumber = item.charAt(0) - 64;
                letterNumber = letterNumber+26;
                sumItems += letterNumber;
            } else {
                int letterNumber = item.charAt(0) - 96;
                sumItems += letterNumber;
            }
        }

        System.out.println(sumItems);

        //aufgabe1
/*
        //split the lines in the middle
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            int middle = line.length() / 2;
            String firstHalf = line.substring(0, middle);
            String secondHalf = line.substring(middle);

            //get letter that is in both halves
            String letter = "";
            for (int j = 0; j < firstHalf.length(); j++) {
                String firstLetter = firstHalf.substring(j, j + 1);
                if (secondHalf.contains(firstLetter)) {
                    letter = firstLetter;
                    duplicateLetters.add(letter);
                    break;
                }
            }
        }
            int sum = 0;
                //get alphabetic number of letter
            for (int k = 0; k < duplicateLetters.size(); k++) {
                String duplicateLetter = duplicateLetters.get(k);
                //check if duplicate letter is uppercase
                if (duplicateLetter.equals(duplicateLetter.toUpperCase())) {
                    int letterNumber = duplicateLetter.charAt(0) - 64;
                    letterNumber = letterNumber+26;
                    sum += letterNumber;
                } else {
                    int letterNumber = duplicateLetter.charAt(0) - 96;
                    sum += letterNumber;
                }
            }

        System.out.println(sum);
*/
        }



    }