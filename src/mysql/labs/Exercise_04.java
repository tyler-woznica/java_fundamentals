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
                    "jdbc:mysql://localhost/airline?user=root&password=099122T$ugu@&useSSL=false");


            insertFlight(connection, 180, "United Airlines", "Boeing 787",
                    "Dallas", "Los Angeles", "2025-09-10 10:00:00");
            queryFlight(connection, "United Airlines");
            updateFlightDuration(connection, "United Airlines", 320);
            //deleteFlight(connection, "United Airlines");

            connection.close();

        } catch (Exception exception) {
            System.out.println(exception);
        }

    }
    public static void insertFlight(Connection conn, int duration_minutes, String airline_name, String plane_model,
                                                       String destination, String departure, String date) throws SQLException {
        String sql = "INSERT INTO flights (duration_minutes, airline_name, plane_model, destination, departure, date) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, duration_minutes);
        stmt.setString(2, airline_name);
        stmt.setString(3, plane_model);
        stmt.setString(4, destination);
        stmt.setString(5, departure);
        stmt.setString(6, date);
        stmt.executeUpdate();
        stmt.close();
        System.out.println("Flight inserted successfully!");
    }

    public static void queryFlight(Connection conn, String airline) throws SQLException {
        String sql = "SELECT * FROM flights WHERE airline_name = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, airline);
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

    public static void updateFlightDuration(Connection conn, String airline, int newDurationMinutes) throws SQLException {
        String sql = "UPDATE flights SET duration_minutes = ? WHERE airline_name = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, newDurationMinutes);
        stmt.setString(2, airline);
        stmt.executeUpdate();
        stmt.close();
        System.out.println("Flight updated successfully!");
    }

    /*public static void deleteFlight(Connection conn, String airline) throws SQLException {
        String sql = "DELETE FROM flights WHERE airline_name = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, airline);
        stmt.executeUpdate();
        stmt.close();
        System.out.println("Flight deleted successfully!");
    }*/

}
