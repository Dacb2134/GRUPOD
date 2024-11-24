package Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    // Credenciales y URL de la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/proyecto"; // Cambia "nombre_base_datos" al nombre de tu base de datos
    private static final String USUARIO = "root"; // Cambia "tu_usuario" al usuario de tu BD
    private static final String CONTRASENA = "29060404"; // Cambia "tu_contrasena" a la contraseña de tu BD

    // Método para establecer conexión
    public static Connection conectar() {
        Connection conexion = null;
        try {
            // Registrar el controlador de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establecer conexión
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.err.println("Error: No se encontró el controlador JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos.");
            e.printStackTrace();
        }
        return conexion;
    }

    // Método principal para probar la conexión
    public static void main(String[] args) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión cerrada correctamente.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión.");
                e.printStackTrace();
            }
        }
    }
}
