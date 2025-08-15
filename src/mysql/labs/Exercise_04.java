package mysql.labs;
import mysql.examples.MySQLAccess;
import javax.swing.plaf.nimbus.State;
import java.sql.*;


/*
*  MySQL Exercise 4:
*   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
*   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
*   demonstrate how to:
*
*   Note: CRUD means (Create, Read, Update, Delete)
*       1.) CRUD new flights
*       2.) CRUD new passengers
*       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
*
*   Caution: Before you push this code to GitHub, be sure to REMOVE or REPLACE your DATABASE PASSWORD. You do not 
*   want to push your database password to GitHub. If you do push your password to GitHub you'll need to delete
*   the commit from your Git history. See, for instance: https://medium.com/multinetinventiv/removing-commits-from-git-history-4e2340288484
 */

public class Exercise_04 {

    public static void main(String[] args) {

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/airline?user=root&password=<PASSWORD>@&useSSL=false");
            insertFlight(connection, 50, 180, "United", "Boeing 787",
                    "Dallas", "Los Angeles", "2025-09-10 10:00:00");
            queryFlight(connection, "United");
            updateFlightDuration(connection, 5, 240);
            deleteCity(connection, "San Francisco");

            connection.close();

        } catch (Exception exception) {
            System.out.println(exception);
        }

    }
    public static void insertFlight(Connection conn, int id, int duration_minutes, String airline_name, String plane_model,
                                                       String destination, String departure, String date) throws SQLException {
        String sql = "INSERT INTO flights (id, duration_minutes, airline_name, plane_model, destination, departure, date) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.setInt(2, duration_minutes);
        stmt.setString(3, airline_name);
        stmt.setString(4, plane_model);
        stmt.setString(5, destination);
        stmt.setString(6, departure);
        stmt.setString(7, date);
        stmt.executeUpdate();
        stmt.close();
        System.out.println("Flight inserted successfully!");
    }

    public static void queryFlight(Connection conn, String airline_name) throws SQLException {
        String sql = "SELECT * FROM flights WHERE airline_name = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, airline_name);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            int duration = rs.getInt("duration_minutes");
            String departure = rs.getString("departure");
            String destination = rs.getString("destination");
            System.out.println(rs.getString("airline_name") + " - " +
                    departure + " >> " + destination + " - Flight Time [" +
                    (duration / 60) + " hr]");
        }
        rs.close();
        stmt.close();
    }

    public static void updateFlightDuration(Connection conn, int id, int newDurationMinutes) throws SQLException {
        String sql = "UPDATE flights SET duration_minutes = ? WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, 5);
        stmt.setInt(2, 240);
        stmt.executeUpdate();
        stmt.close();
        System.out.println("Flight updated successfully!");
    }

    public static void deleteCity(Connection conn, String city) throws SQLException {
        String sql = "DELETE FROM cities WHERE city = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, city);
        stmt.executeUpdate();
        stmt.close();
        System.out.println("City deleted successfully!");
    }
}
