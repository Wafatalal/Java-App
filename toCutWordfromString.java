package hallowapp;

import java.util.Scanner;

public class toCutWordfromString {
    public static int CountOccurrences(String s1, String s2) {

        int counter = 0;

        for (int i = 0; i < s1.length() - s2.length() + 1; i++) {
            if (s1.substring(i, i + s2.length()).equals(s2)) {
                counter++;
            }
        }

        return counter;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any text: ");
        String text = input.nextLine();

        System.out.print("Enter word to search occurrences: ");
        String keyword = input.next();
        int result = CountOccurrences(text, keyword);

        System.out.println("Total occurrences of '" + keyword + "' is: " + result);

    }
}
