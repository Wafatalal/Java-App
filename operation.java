package hallowapp;

import java.util.Scanner;

    public class operation {
        static int Sum (int n1, int n2){//to create the function before main function
            int r=n1+n2;
            return (r);
        }
        static Scanner  reader = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Enter number 1:");
            int n1=reader.nextInt();
            System.out.println("Enter number 2:");
            int n2= reader.nextInt();
            int result= Sum(n1,n2); //we call function sum to get the result
            System.out.println("the result is:"+ result);

            //after++
            int num1=5;
            int num2=6;
            int r=num2+num1++;
            System.out.println("the result is:"+ r);
            System.out.println("the num1:"+ num1);

            //before++
            int num3=5;
            int num4=6;
            int r2=num4+ ++num3;
            System.out.println("the result is:"+ r2);
            System.out.println("the num3:"+ num3);


        }
    }
