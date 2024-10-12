package hallowapp.serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serialization {
    public static void main(String[] args){
        Employee emp= new Employee();
        emp.name="Wafa bahha";
        emp.age=33;
        emp.dep="Software engneer";
        try {
            FileOutputStream fileOut= new FileOutputStream("employee.txt");
            ObjectOutputStream Out = new ObjectOutputStream(fileOut);
            Out.writeObject(emp);
            Out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in./employee.txt");

        }catch (IOException i){
            i.printStackTrace();
        }
    }
}
