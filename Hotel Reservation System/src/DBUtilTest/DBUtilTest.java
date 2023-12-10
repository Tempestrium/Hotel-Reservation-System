/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DBUtilTest {

    private static final Logger LOGGER = Logger.getLogger(DBUtilTest.class.getName());

    public static void main(String[] args) {
        testMycon();
    }

    private static void testMycon() {
        try {
            LOGGER.info("Testing database connection...");
            Connection connection = DBUtil.mycon();

            // If the connection is successful, log a success message
            if (connection != null && !connection.isClosed()) {
                LOGGER.info("Database connection successful!");
            } else {
                LOGGER.warning("Database connection failed!");
            }
        } catch (SQLException e) {
            LOGGER.severe("Error testing database connection: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


