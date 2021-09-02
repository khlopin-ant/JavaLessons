package mySQL;

import java.sql.*;


public class mySQL {
    public static void main(String[] args) {
        String address = "localhost";
        Integer port = 3306;
        String scheme = "test_scheme";

        String url = "jdbc:mysql://"+ address + ":" + port + "/" + scheme;
        String user = "root";
        String password = "Iddqdidkfa1979";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection is Successfu to the database" + url);
            Statement statement = connection.createStatement();
            // TODO: - добавление в БД INSERT
            // добавить запись в таблицу test_table с именем John
            String sqlInsertJohn = "INSERT INTO `test_table` (`name`) VALUES ('John')";
            String sqlInsertVasya = "INSERT INTO `test_table` (`name`) VALUES ('Vasya')";
            String sqlDeleteRec = "DELETE FROM `test_table` WHERE id=20";
            String sqlDeleteVasya = "DELETE FROM `test_table` WHERE name = 'Vasya'";
            String updateRec = "UPDATE test_table SET name = 'Vasya gvjgy' WHERE id = 19";
//            statement.execute(sqlInsertJohn);
//
//            statement.addBatch(sqlInsertJohn);
//            statement.addBatch(sqlInsertVasya);
//
//
//            statement.executeBatch();
//            statement.execute(sqlDeleteRec);
//            statement.execute(updateRec);
            // TODO: - чтение из БД SELECT
            // 1) получить все запись из таблицы
            // 2) получить запись с именем John
            String sqlSelectAll = "SELECT * FROM test_table";
            ResultSet resultSet = statement.executeQuery(sqlSelectAll);

            
//            while (resultSet.next()){
//                String name = resultSet.getString("name");
//                Integer id = resultSet.getInt("id");
//                System.out.printf(id + " ");
//                System.out.printf(name + "\n");
//            }


            // TODO: - изменение записи в БД UPDATE
            // переименовать имя в записи с id 1 на Vasya

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
