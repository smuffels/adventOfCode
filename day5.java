import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

import static java.lang.String.valueOf;

public class day5 {
    public static void main(String[] args) throws Exception {
        String inputT = Files.readString(Path.of("C:\\Users\\brunc\\OneDrive - ZHAW\\1.Semester\\AdventOfCode\\adventOfCode\\input\\day5Test.txt"));
        String input = Files.readString(Path.of("C:\\Users\\brunc\\OneDrive - ZHAW\\1.Semester\\AdventOfCode\\adventOfCode\\input\\day5.txt"));

        /*Stack testStack1 = new Stack();
        testStack1.push("Z");
        testStack1.push("N");

        Stack testStack2 = new Stack();
        testStack2.push("M");
        testStack2.push("C");
        testStack2.push("D");

        Stack testStack3 = new Stack();
        testStack3.push("P");

        ArrayList<Stack> stacks = new ArrayList<Stack>();
        stacks.add(testStack1);
        stacks.add(testStack2);
        stacks.add(testStack3);
        */
        ArrayList<Stack> stacks = new ArrayList<Stack>();
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        Stack stack3 = new Stack();
        Stack stack4 = new Stack();
        Stack stack5 = new Stack();
        Stack stack6 = new Stack();
        Stack stack7 = new Stack();
        Stack stack8 = new Stack();
        Stack stack9 = new Stack();

        stack1.push("W");
        stack1.push("D");
        stack1.push("G");
        stack1.push("B");
        stack1.push("H");
        stack1.push("R");
        stack1.push("V");

        stack2.push("J");
        stack2.push("N");
        stack2.push("G");
        stack2.push("C");
        stack2.push("R");
        stack2.push("F");

        stack3.push("L");
        stack3.push("S");
        stack3.push("F");
        stack3.push("H");
        stack3.push("D");
        stack3.push("N");
        stack3.push("J");

        stack4.push("J");
        stack4.push("D");
        stack4.push("S");
        stack4.push("V");

        stack5.push("S");
        stack5.push("H");
        stack5.push("D");
        stack5.push("R");
        stack5.push("Q");
        stack5.push("W");
        stack5.push("N");
        stack5.push("V");

        stack6.push("P");
        stack6.push("G");
        stack6.push("H");
        stack6.push("C");
        stack6.push("M");

        stack7.push("F");
        stack7.push("J");
        stack7.push("B");
        stack7.push("G");
        stack7.push("L");
        stack7.push("Z");
        stack7.push("H");
        stack7.push("C");

        stack8.push("S");
        stack8.push("J");
        stack8.push("R");

        stack9.push("L");
        stack9.push("G");
        stack9.push("S");
        stack9.push("R");
        stack9.push("B");
        stack9.push("N");
        stack9.push("V");
        stack9.push("M");

        stacks.add(stack1);
        stacks.add(stack2);
        stacks.add(stack3);
        stacks.add(stack4);
        stacks.add(stack5);
        stacks.add(stack6);
        stacks.add(stack7);
        stacks.add(stack8);
        stacks.add(stack9);

        //needed for task 2
        Stack helpStack = new Stack();


        String[] lines = input.split("\r\n");
        for (String line:lines) {
            String[] numbers = line.split("\\D+");

            int numberOfItems = Integer.parseInt(numbers[1]);
            int from = Integer.parseInt(numbers[2]);
            int to = Integer.parseInt(numbers[3]);

            for(int i = 0; i<numberOfItems; i++){
                String popedItem ="";
                Stack stackFrom = stacks.get(from-1);
                popedItem = stackFrom.pop().toString();
                helpStack.push(popedItem);
            }
            for(int i = 0; i<numberOfItems; i++){
                String popedItem ="";
                Stack stackTo = stacks.get(to-1);
                popedItem = helpStack.pop().toString();
                stackTo.push(popedItem);
            }
        }
        String output = "";
        for (Stack stack:stacks) {
            output += stack.pop();
        }
        System.out.println(output);

        //int sum = 0;
        //split the string into an array of strings


        //System.out.println(lines);
    }
}
