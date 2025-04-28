import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection(
                    "PLACEHOLDER",
                    "PLACEHOLDER",
                    "PLACEHOLDER!"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS");

            while(resultSet.next()){
                System.out.println(resultSet.getString("username"));
                System.out.println(resultSet.getString("password"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}