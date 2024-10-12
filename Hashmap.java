package hallowapp;
import java.util.ArrayList;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        ArrayList<String> ListJava =new ArrayList<String>();
        ListJava.add("Java and oop");
        ListJava.add("Java and Android");
        ListJava.add("Java is very fast!");

        ArrayList<String> ListIOS =new ArrayList<String>();
        ListIOS.add("Iphone run on IOS");
        ListIOS.add("New version of IOS");
        ListIOS.add("All today news about IOS");

//to create the hash map ,it contains Key & Value
        HashMap<String,ArrayList<String>> S =new HashMap<String,ArrayList<String>>();
        S.put("java",ListJava);// we put jave key for list java which is we wrote it up
        S.put("ios",ListIOS);// we put ios key for list ios which is we wrote it up

        System.out.println(S.get("java"));//to get all the value on list java
        System.out.println(S.get("ios"));//to get all the value on listIOS

    }
}
