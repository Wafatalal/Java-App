package hallowapp;
import java.util.Scanner;
public class hallowclass {
  static   Scanner  reader = new Scanner(System.in);

    public static void main(String[]args)
    {
        //for virables types
        int age= 33;
        String name= "Wafa";
        double pi= 3.4;
        char Type = 'a';
        System.out.println("name:"+ name +"age:"+age);

        // for input
        String yourname;
        int yourage;
        System.out.println("inter your name:");
        yourname= reader.nextLine();
        System.out.println("inter your age:");
        yourage= reader.nextInt();
        System.out.println("your name:"+yourname + "your age:"+yourage);

        // for changing V type
        // from string to integer
        int number;
        String phone ="3445";
        number= Integer.parseInt(phone);
        System.out.println(number);

        // from string to double
        double numberd;
        String phoned ="3445.9";
        numberd= Double.parseDouble(phoned);
        System.out.println(numberd);

        // from integer to string
        int numbers=6660;
        String phones ;
        phones= String.valueOf(numbers);
        System.out.println(numbers);
    }
}
