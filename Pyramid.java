package hallowapp;
import java.util.Scanner;

public class Pyramid {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            //Taking noOfRows value from the user

            System.out.println("How Many Rows You Want In Your Pyramid?");

            int noOfRows = sc.nextInt();

            //Initializing rowCount with 1

            int rowCount = 1;

            System.out.println("Here Is Your Pyramid");

            //Implementing the logic

            for (int i = noOfRows; i > 0; i--)
            {
                //Printing i spaces at the beginning of each row

                for (int j = 1; j <= i; j++)
                {
                    System.out.print(" ");
                }

                //Printing 'rowCount' value 'rowCount' times at the end of each row

                for (int j = 1; j <= rowCount; j++)
                {
                    System.out.print(rowCount +" "); //if we want to print 1 12 123 1234 we will print j.
                    // put her will print the pyramid 1 22 333 4444...
                    // also you can print it as * ** *** by it change rowCount
                }

                System.out.println();//for printing a new line

                //Incrementing the rowCount

                rowCount++;
            }

/* if we want pyramid 1 121 12321 1234321*/

            Scanner sc1 = new Scanner(System.in);

            //Taking noOfRows value from the user

            System.out.println("How Many Rows You Want In Your Pyramid?");

            int noOfRows1 = sc1.nextInt();

            //Initializing rowCount with 1

            //int rowCount1 = 1;
            // if we want to reverse it we will put rowcount = numberofrow

            int rowCount1 = noOfRows1;
            System.out.println("Here Is Your Pyramid");

            //Implementing the logic

            //for (int i = noOfRows1; i > 0; i--)
            // and if we want to reverse it we will change the condition نعكسه

            for (int i = 0; i < noOfRows1; i++)
            {
                //Printing i*2 spaces at the beginning of each row

                for (int j = 1; j <= i*2; j++)
                {
                    System.out.print(" ");
                }

                //Printing j value where j value will be from 1 to rowCount

                for (int j = 1; j <= rowCount1; j++)
                {
                    System.out.print(j+" ");
                }

                //Printing j value where j value will be from rowCount-1 to 1

                for (int j = rowCount1-1; j >= 1; j--)
                {
                    System.out.print(j+" ");
                }

                System.out.println();

                //Incrementing the rowCount
               // rowCount1++;

                //and decrementing the rowCount if we want to reverse it
                rowCount1--;
            }
        }
}


