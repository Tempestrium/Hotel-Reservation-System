import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

public class DBUtil {

    private static final Logger LOGGER = Logger.getLogger(DBUtil.class.getName());

    DBUtil() {
        throw new AssertionError("Utility class should not be instantiated");
    }

    public static Connection mycon() throws SQLException {
        Properties properties = new Properties();

        // Load properties from a file
        try (InputStream input = DBUtil.class.getClassLoader().getResourceAsStream("db.properties")) {
            if (input == null) {
                LOGGER.log(Level.SEVERE, "File not found!");
            }
            properties.load(input);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error loading database properties", e);
            throw new SQLException("Error loading database properties", e);
        }

        String url = properties.getProperty("db.url");
        String username = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            LOGGER.log(Level.SEVERE, "Error establishing database connection", ex);
            throw new SQLException("Error establishing database connection", ex);
        }
    }

    TableModel resultSetToTable(ResultSet Rs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        }
