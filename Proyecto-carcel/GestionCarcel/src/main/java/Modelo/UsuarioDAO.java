package modelo;

import Controlador.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    // Método para autenticar al usuario y verificar la contraseña
    public boolean autenticarUsuario(String username, String password, String role) {
        String sql = "SELECT u.username " +
                     "FROM usuarios u " +
                     "JOIN roles r ON u.role_id = r.role_id " +
                     "WHERE u.username = ? AND u.password = ? AND r.nombre_rol = ? AND u.estado = 1"; // estado = 1 -> activo

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {

            stmt.setString(1, username);
            stmt.setString(2, password);  // Asegúrate de usar hash de contraseñas en producción
            stmt.setString(3, role);

            ResultSet rs = stmt.executeQuery();

            // Si existe un resultado, significa que el usuario y la contraseña son correctos
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;  // Si hay un error o no se encuentra el usuario
    }

    // Método para obtener un usuario por su nombre de usuario
    public Usuario obtenerUsuarioPorUsername(String username) {
        String sql = "SELECT * FROM usuarios WHERE username = ? AND estado = 1"; // Solo usuarios activos

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {

            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Mapeo de los resultados de la consulta a la clase Usuario
                return new Usuario(
                    rs.getInt("usuario_id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getInt("role_id"),
                    rs.getBoolean("estado")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null; // Si no se encuentra el usuario
    }
}

