package Modelo;

import Controlador.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Recluso;

public class ReclusoDAO {

    private Connection connection;

    public ReclusoDAO(Connection connection) {
        this.connection = connection;
    }

    public ReclusoDAO() {

    }

    public int insertarRecluso(Recluso recluso) throws SQLException {
        String sql = "INSERT INTO reclusos (numero_cedula, nombre, apellido, edad, genero, estado) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, recluso.getNumeroCedula());
            stmt.setString(2, recluso.getNombre());
            stmt.setString(3, recluso.getApellido());
            stmt.setInt(4, recluso.getEdad());
            stmt.setString(5, recluso.getGenero());
            stmt.setBoolean(6, recluso.getIsEstado());
            stmt.executeUpdate();

            // Obtener el ID generado
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                recluso.setReclusoId(rs.getInt(1));
                return rs.getInt(1);
            }
        }
        return -1; // Si no se genera un ID
    }
    
        public Recluso buscarPorCedula(String cedula) throws SQLException {
        String sql = "SELECT * FROM reclusos WHERE numero_cedula = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cedula);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Recluso recluso = new Recluso();
                    recluso.setReclusoId(rs.getInt("recluso_id"));
                    recluso.setNombre(rs.getString("nombre"));
                    recluso.setApellido(rs.getString("apellido"));
                    recluso.setEdad(rs.getInt("edad"));
                    recluso.setGenero(rs.getString("genero"));
                    recluso.setIsEstado(rs.getBoolean("estado"));
                    recluso.setNumeroCedula(rs.getString("numero_cedula"));
                    return recluso;
                }
            }
        }
        return null;
    }

    public void eliminarRecluso(int reclusoId) throws SQLException {
        String sql = "DELETE FROM reclusos WHERE recluso_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, reclusoId);
            stmt.executeUpdate();
        }
    }

    public void actualizarRecluso(Recluso recluso) throws SQLException {
        String sql = "UPDATE reclusos SET nombre = ?, apellido = ?, edad = ?, genero = ?, estado = ?, numero_cedula = ? WHERE recluso_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, recluso.getNombre());
            stmt.setString(2, recluso.getApellido());
            stmt.setInt(3, recluso.getEdad());
            stmt.setString(4, recluso.getGenero());
            stmt.setBoolean(5, recluso.getIsEstado());
            stmt.setString(6, recluso.getNumeroCedula());
            stmt.setInt(7, recluso.getReclusoId());
            stmt.executeUpdate();
        }
    }
}
