package hallowapp.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserialization {
    public static void main (String[] args) throws ClassNotFoundException{
        Employee emp=null;
        try {
            FileInputStream fileIn = new FileInputStream("employee.txt");
            ObjectInputStream in =new ObjectInputStream(fileIn);
            emp =(Employee) in.readObject();
            in.close();
            fileIn.close();
        }catch (IOException i){
            System.out.println("Error connot find file");
            return;
        }
        System.out.println("Deserialization Employee ");
        System.out.println("name "+ emp.name);
        System.out.println("age "+ emp.age);
        System.out.println("Dep "+ emp.dep);

    }
}
