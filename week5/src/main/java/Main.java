import java.sql.*;

public class Main {
    private static PreparedStatement statement = null;
    private static Connection connection = null;
    private static final String url = "jdbc:mysql://localhost:3306/sewing_business";
    private static final String user = "root";
    private static final String password = "57206700";


    public static void main(String[] args) {
//        addData("Paiym", "Matraimov", "+996 771 540 124",
//                "MatraimovRich@gmail.com", "Bishkek", "Kyrgyzstan");
//        addData("Baiel", "Saparaliev", "+996 771 703 419",
//                "b410asakura@gmail.com", "Bishkek", "Kyrgyzstan");
//        addData("Samat", "Baigeldiev", "+996 222 512 419",
//                "samat@gmail.com", "Bishkek", "Kyrgyzstan");
//        addData("Aibek", "Karshiboev", "+996 555 694 135",
//                "aibek@gmail.com", "Bishkek", "Kyrgyzstan");
//
//        selectData();

        updateData("Samatik", 7);

        selectData();
//        deleteData("DELETE FROM customers");
    }


    public static void getConnection() {
        final String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }


    private static void addData(String firstName, String lastName, String phoneNumber,
                                String email, String city, String country) {
        getConnection();
        String sql = "INSERT INTO customers (first_name, last_name, phone_number, email, city, country)\n" +
                "VALUES (?, ?, ?, ?, ?, ?);";
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, phoneNumber);
            statement.setString(4, email);
            statement.setString(5, city);
            statement.setString(6, country);

            System.out.println(statement.executeUpdate() + " row added");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    private static void selectData() {
        getConnection();
        String sql = "SELECT * FROM customers;";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                String phoneNumber = resultSet.getString(4);
                String email = resultSet.getString(5);
                String city = resultSet.getString(6);
                String country = resultSet.getString(7);
                System.out.printf("%d %s %s %s %s %s %s \n", id, firstName, lastName, phoneNumber, email, city, country);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    private static void updateData(String firstName, int id) {
        getConnection();
        String sql = "UPDATE customers SET first_name = ? WHERE customer_id = ? ";
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, firstName);
            statement.setInt(2, id);
            System.out.println(statement.executeUpdate() + "row updated");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    private static void deleteData(String sql) {
        getConnection();
        try {
            statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("some data was deleted");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
