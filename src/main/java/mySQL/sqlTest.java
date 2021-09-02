package mySQL;

import java.sql.*;

public class sqlTest {
    public static void main(String[] args) {
        String address = "localhost";
        Integer port = 3306;
        String scheme = "test_scheme";

        String url = "jdbc:mysql://" + address + ":" + port + "/" + scheme;
        String user = "root";
        String password = "Iddqdidkfa1979";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            // forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection is Successful to the database" + url);
            Statement statement = connection.createStatement();
            String newTable = "CREATE TABLE IF NOT EXISTS users (id Int KEY AUTO_INCREMENT," +
                    " name VARCHAR(20)," +
                    " password VARCHAR(20)," +
                    " username VARCHAR(20))";
            //String tableNew = "CREATE TABLE vc (v VARCHAR(4), c CHAR(4))";
            String deleteTable = "DROP TABLE users";
            statement.executeUpdate(deleteTable);
            statement.executeUpdate(newTable);

            //TODO: Заполняю таблицу users

            //String setFirstVal = "Update users Set name = 'Jora' Where id = 1";
            String fillTablePapa = "Insert Into users (name, password, username) Values ('Papa', 123, 'father') ";
            String fillTableMama = "Insert Into users (name, password, username) Values ('Mama', 321, 'mother')";
            String fillTableYa = "Insert Into users (name, password, username) Values ('Ya', 213, 'son')";

            //statement.execute(setFirstVal);
            //statement.addBatch(setFirstVal);
            statement.addBatch(fillTablePapa);
            statement.addBatch(fillTableMama);
            statement.addBatch(fillTableYa);

            statement.executeBatch();

//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
