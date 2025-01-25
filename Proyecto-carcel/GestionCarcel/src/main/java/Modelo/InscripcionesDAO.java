
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Recluso;


public class InscripcionesDAO {
    
    private Connection connection;
    
    public InscripcionesDAO(Connection connection){
        this.connection = connection;
    }
    
    public InscripcionesDAO(){
        
    }
    
        public int insertarInscripcion(Inscripciones inscripciones) throws SQLException {
        String sql = "INSERT INTO inscripciones (recluso_id, actividad_id, fecha_finalziacion, estado) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, inscripciones.getReclusoId());
            stmt.setInt(2, inscripciones.getActividadId());
            stmt.setString(3, inscripciones.getFechaFinalizacion());
            stmt.setBoolean(4, inscripciones.getIsestado());
            stmt.executeUpdate();

            // Obtener el ID generado
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                inscripciones.setInscripcionId(rs.getInt(1));
                return rs.getInt(1);
            }
        }
        return -1; // Si no se genera un ID
    }
}
