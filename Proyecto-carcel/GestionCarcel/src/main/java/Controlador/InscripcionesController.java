package Controlador;
import Modelo.Inscripciones;
import Modelo.InscripcionesDAO;
import java.sql.Connection;
import java.sql.SQLException;

public class InscripcionesController {
    
    private InscripcionesDAO  inscripcionesDao;
    
    public InscripcionesController(Connection connection) {
        this.inscripcionesDao = new InscripcionesDAO(connection);
    }

    public void registrarInscripcion(Inscripciones incripciones) {
        try {
            // Insertar recluso y obtener su ID
            int inscripcionId = inscripcionesDao.insertarInscripcion(incripciones);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
