package Modelo;

import java.sql.*;

public class CondenaDAO {
    private Connection connection;

    public CondenaDAO(Connection connection) {
        this.connection = connection;
    }

    public CondenaDAO() {
     
    }

    public void insertarCondena(Condena condena) throws SQLException {
        String sql = "INSERT INTO condenas (recluso_id, fecha_ingreso, delitos, cargos, condena_dias, fecha_inicio_condena, fecha_estimacion_liberacion) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, condena.getReclusoId());
            stmt.setString(2, condena.getFechaIngreso());
            stmt.setString(3, condena.getDelitos());
            stmt.setString(4, condena.getCargos());
            stmt.setInt(5, condena.getCondenaDias());
            stmt.setString(6, condena.getFechaInicioCondena());
            stmt.setString(7, condena.getFechaEstimacionLiberacion());
            stmt.executeUpdate();
        }
    }
    
    public Condena buscarPorReclusoId(int reclusoId) throws SQLException {
        String sql = "SELECT * FROM condenas WHERE recluso_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, reclusoId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Condena condena = new Condena();
                    condena.setCondenaId(rs.getInt("condena_id"));
                    condena.setReclusoId(rs.getInt("recluso_id"));
                    condena.setCargos(rs.getString("cargos"));
                    condena.setCondenaDias(rs.getInt("condena_dias"));
                    condena.setDelitos(rs.getString("delitos"));
                    condena.setFechaIngreso(rs.getString("fecha_ingreso"));
                    condena.setFechaInicioCondena(rs.getString("fecha_inicio_condena"));
                    condena.setFechaEstimacionLiberacion(rs.getString("fecha_estimacion_liberacion"));
                    return condena;
                }
            }
        }
        return null;
    }

    public void eliminarPorReclusoId(int reclusoId) throws SQLException {
        String sql = "DELETE FROM condenas WHERE recluso_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, reclusoId);
            stmt.executeUpdate();
        }
    }

    public void actualizarCondena(Condena condena) throws SQLException {
        String sql = "UPDATE condenas SET cargos = ?, condena_dias = ?, delitos = ?, fecha_ingreso = ?, fecha_inicio_condena = ?, fecha_estimacion_liberacion = ? WHERE recluso_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, condena.getCargos());
            stmt.setInt(2, condena.getCondenaDias());
            stmt.setString(3, condena.getDelitos());
            stmt.setString(4, condena.getFechaIngreso());
            stmt.setString(5, condena.getFechaInicioCondena());
            stmt.setString(6, condena.getFechaEstimacionLiberacion());
            stmt.setInt(7, condena.getReclusoId());
            stmt.executeUpdate();
        }
    }
}

