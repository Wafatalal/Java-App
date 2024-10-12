package hallowapp;
import java.util.Scanner;
import java.util.ArrayList;


public class array {
    static Scanner  reader = new Scanner(System.in);
    public static void main(String[] args) {
        String [] name=new String[4];
        name[0]="Wafa";
        name[1]="Talal";
        name[2]="Mohammad";
        name[3]="Bahha";
        for(int i=0;i<4;i++)
            System.out.println(name[i]);
        int []num=new int[4];
        for (int j=0;j<4;j++)
            num[j]=reader.nextInt();
        for (int j=0;j<4;j++)
            System.out.println(num[j]);
        //arraylist
        ArrayList<String> names= new ArrayList<String>();//to creat the arraylist
        names.add("Toleen");
        names.add("Lareen");
        names.add("Samer");//to add in the list
        names.remove(2);//to remove by index
        names.remove("Toleen");//to remove by object
        System.out.println(names);
        System.out.println(names.contains("Lareen"));//to search in the list


    }

}
