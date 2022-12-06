import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class day6 {
    public static void main(String[] args) throws Exception {
        String inputT = Files.readString(Path.of("C:\\Users\\brunc\\OneDrive - ZHAW\\1.Semester\\AdventOfCode\\adventOfCode\\input\\day6Test.txt"));
        String input = Files.readString(Path.of("C:\\Users\\brunc\\OneDrive - ZHAW\\1.Semester\\AdventOfCode\\adventOfCode\\input\\day6.txt"));


        //split the input into chars
        char[] chars = input.toCharArray();
        //i for task 1 = 3
        for(int i = 13; i<chars.length; i++){
            ArrayList list = new ArrayList();
            list.add(chars[i]);
            list.add(chars[i-1]);
            list.add(chars[i-2]);
            list.add(chars[i-3]);
            list.add(chars[i-4]);
            list.add(chars[i-5]);
            list.add(chars[i-6]);
            list.add(chars[i-7]);
            list.add(chars[i-8]);
            list.add(chars[i-9]);
            list.add(chars[i-10]);
            list.add(chars[i-11]);
            list.add(chars[i-12]);
            list.add(chars[i-13]);

            /* for(int j = 0; j<13 ; j++){
                list.add(chars[i-j]);
            }
            used for task 1
            char pos4 = chars[i];
            char pos3 = chars[i-1];
            char pos2 = chars[i-2];
            char pos1 = chars[i-3];


            if(pos1 != pos2 && pos1 != pos3 && pos1 != pos4 && pos2 !=pos3 && pos2 !=pos4 && pos3 != pos4){
                System.out.println(i);
            }
            */

            Set<Integer> set = new HashSet<Integer>(list);

            if(set.size() == list.size()){
                System.out.println(i);
            }

        }

    }
}
