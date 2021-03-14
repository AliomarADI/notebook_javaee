package dao;

import model.User;

import java.sql.*;

public class UserDao {
    public int registerUser(User user) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO users  (id, username, password) VALUES  (?,?,?);";

        int result = 0;

        Class.forName("org.postgresql.Driver");

        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/notebook", "postgres",
                        "postgres");

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 5);
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getPassword());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();
            preparedStatement.executeUpdate();
         }catch (Exception e) {
            // process sql exception
            System.out.println(e);;
        }
        return result;
    }

    public boolean validate(User user) throws ClassNotFoundException {
        boolean status = false;

        Class.forName("org.postgresql.Driver");

        try(Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/notebook", "postgres",
                        "postgres");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection
                    .prepareStatement
                            ("select * from users " +
                                    "where username = ? and password = ?")) {


                preparedStatement.setString(1, user.getName());
                preparedStatement.setString(2, user.getPassword());

                System.out.println(preparedStatement);
                ResultSet rs = preparedStatement.executeQuery();
                status = rs.next();

        }catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return status;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
