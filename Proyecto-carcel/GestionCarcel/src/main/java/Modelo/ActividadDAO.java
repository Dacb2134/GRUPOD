package Modelo;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ActividadDAO {
    
    private Connection connection;
    
    public ActividadDAO(Connection connection){
        this.connection = connection;
    }
    
    public ActividadDAO(){
        
    }
    
    public int insertarActividad(Actividad actividad) throws SQLException {
        String sql = "INSERT INTO actividad (nombre_actividad, descripcion, valor_reduccion_condena, estado) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, actividad.getNombreActividad());
            stmt.setString(2, actividad.getDescripcion());
            stmt.setInt(3, actividad.getReduccionCondena());
            stmt.setBoolean(4, actividad.getIsestado());
            stmt.executeUpdate();

            // Obtener el ID generado
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                actividad.setActividadId(rs.getInt(1));
                return rs.getInt(1);
            }
        }
        return -1; 
    }
    
    public Actividad buscarPorId(int actividadId) throws SQLException {
        String sql = "SELECT * FROM actividad WHERE actividad_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, actividadId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Actividad actividad = new Actividad();
                    actividad.setNombreActividad(rs.getString("nombre_actividad"));
                    actividad.setReduccionCondena(rs.getInt("valor_reduccion_condena"));
                    actividad.setDescripcion(rs.getString("descripcion"));
                    actividad.setIsestado(rs.getBoolean("estado"));
  
                    return actividad;
                }
            }
        }
        return null;
    }
    
    public void eliminarActividad(int actividadId) throws SQLException {
        String sql = "DELETE FROM actividad WHERE actividad_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, actividadId);
            stmt.executeUpdate();
        }
    }

    public void actualizarActividad(Actividad actividad) throws SQLException {
        String sql = "UPDATE actividad SET nombre_actividad = ?, descripcion = ?, valor_reduccion_condena = ?, estado = ? WHERE actividad_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, actividad.getNombreActividad());
            stmt.setString(2, actividad.getDescripcion());
            stmt.setInt(3, actividad.getReduccionCondena());
            stmt.setBoolean(4, actividad.getIsestado());
            stmt.setInt(5, actividad.getActividadId());

            stmt.executeUpdate();
        }
    }

    public List<Actividad> buscarPorReduccionCondena(int reduccionCondena) throws SQLException {
        List<Actividad> actividades = new ArrayList<>();
        String sql = "SELECT * FROM actividad WHERE valor_reduccion_condena = ?";

        // Realizar la consulta
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, reduccionCondena);
            try (ResultSet rs = stmt.executeQuery()) {
                // Procesar el resultado de la consulta
                while (rs.next()) {
                    Actividad actividad = new Actividad();
                    actividad.setActividadId(rs.getInt("actividad_id"));
                    actividad.setNombreActividad(rs.getString("nombre_actividad"));
                    actividad.setDescripcion(rs.getString("descripcion"));
                    actividad.setReduccionCondena(rs.getInt("valor_reduccion_condena"));
                    actividad.setIsestado(rs.getBoolean("estado"));
                    actividades.add(actividad);  // Añadir la actividad a la lista
                }
            }
        }
        return actividades;  // Devolver la lista de actividades
    }

    

}
