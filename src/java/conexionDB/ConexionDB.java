package conexionDB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author DeveloperSr
 */
public class ConexionDB {

    private final String url;
    private final String hostname;
    private final String baseDatos;
    private final String usuario;
    private final String password;
    private Connection conexion = null;
    private Statement statement = null;
    private ResultSet datos = null;

    public ConexionDB(String hostname, String baseDatos, String usuario, String password) {

        this.hostname = hostname;
        this.baseDatos = baseDatos;
        this.usuario = usuario;
        this.password = password;
        url =  "jdbc:mysql://localhost:3306/cascaronbd,root,root";
    }

    public ConexionDB() {
        Properties propiedades = new Properties();
        try {
            propiedades.load(getClass().getResourceAsStream("/properties/Bd.properties"));
        } catch (IOException ex) {
            System.out.println("ConexionDB :: ConexionDB :: " + ex.getMessage());
            System.out.println(" FALLA CONEXION ");
        }

        hostname = propiedades.getProperty("HOSTNAME");
        baseDatos = propiedades.getProperty("BD");
        usuario = propiedades.getProperty("USUARIO");
        password = propiedades.getProperty("PASSWORD");
        url = "jdbc:mysql://localhost:3306/cascaronbd,root,root";

        //"jdbc:mysql://" + servidor +
        //";databaseName=" +
        //baseDatos + ";user=" + usuario + ";password=" + password;
    }

    public void conecta() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cascaronbd","root","root");
            System.out.println("CONEXION EXITOS");

        } catch (ClassNotFoundException e) {
            System.out.println("[ConexionDB.java] :: [conecta] :: " + e.getMessage());
            System.out.println(" FALLA CONEXION ");
        } catch (SQLException e) {
            System.out.println("[ConexionDB.java] :: [conecta] :: " + e.getMessage());
            System.out.println(" FALLA CONEXION ");
        }
    }

    public ResultSet selectQuery(String query) {
        try {
            statement = conexion.createStatement();
            datos = statement.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return datos;
    }

    public void insertQuery(String query) throws SQLException {
        statement = conexion.createStatement();
        statement.executeUpdate(query);
    }

    public void desconecta() {
        if (datos != null) {
            try {
                datos.close();
            } catch (SQLException e) {
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
            }
        }
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
            }
        }
    }

}
