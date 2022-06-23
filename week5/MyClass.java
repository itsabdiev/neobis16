package org.example;

import java.sql.*;

public class MyClass {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/neobis16";
        String userName = "root";
        String password = "popzvezda9";
        int maxValue;
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT max(id) from client_roles");
            if (resultSet.next()) maxValue = resultSet.getInt("max(id)") + 1;
            else maxValue = 0;
            for (int r = 0;r < 2;r++) {
                statement.executeUpdate(String.format("INSERT INTO client_roles values (%d,'Admin')",maxValue++));
            }
            statement.executeUpdate("UPDATE client_roles set role_name = 'New_Client' where id = 2");
            statement.executeUpdate("DELETE from client_roles where id = 1");
            statement.executeUpdate("CREATE table flavours(id int  primary key,flavour_name varchar(200) not null unique)");
             ResultSet resultSet1 = statement.executeQuery("SELECT * from client_roles");
            while (resultSet1.next()) {
                String name = resultSet1.getString("role_name");
                Integer id = resultSet1.getInt("id");
                System.out.println(id + ": " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
