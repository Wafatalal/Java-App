package hallowapp.javaMYSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;



public class mydata {
    public static void main(String[] args) {
        Connection connect = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mywork?user=root&password=12345");
            statement = connect.createStatement();
            resultSet = statement.executeQuery("Select* from company");
            while (resultSet.next()) {
                String name = resultSet.getNString("name_of_company");
                String email = resultSet.getNString("staff");
                System.out.println("name:" + name + "email:" + email);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}