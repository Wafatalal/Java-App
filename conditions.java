package hallowapp;

import java.util.Scanner;

public class conditions {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("inter your age:");
        int age= reader.nextInt();
        if (age>18) {
            System.out.println("welcome to this app");
            // for loop الاعداد الزوجية
            for (int i = 0; i < 100; i=i+2) {
                System.out.println(i);
            }
        } else {
            System.out.println("your age is not in the range!");
        }
    }
}
