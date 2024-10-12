package hallowapp;
import javax.annotation.processing.Filer;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch_and_files {
    static Scanner  reader = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int n= reader.nextInt();
            System.out.println(n);
        }catch (InputMismatchException ex){
            System.out.println("input should be integer");
        }

        try {
            FileWriter fout = new FileWriter("fofo.txt");
            fout.write("hellow my first file my name is fofo");
            fout.close();
        }catch (Exception ex){
            System.out.println("there is error!!!");
        }
        try {
            FileReader fin = new FileReader("fofo.txt");
            int c;
            while ((c= fin.read())!=-1){
                System.out.print((char)c);
            }
        }catch (Exception ex){
            System.out.println("there is error!!!");
        }
        System.out.println("\n app is Done");
    }
}
