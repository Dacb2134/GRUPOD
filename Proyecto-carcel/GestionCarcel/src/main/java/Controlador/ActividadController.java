
package Controlador;

import Modelo.Actividad;
import Modelo.ActividadDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public class ActividadController {
    
    private ActividadDAO  actividadDAO;
    
    public ActividadController(Connection connection) {
        this.actividadDAO = new ActividadDAO(connection);
    }

    public void registrarActividad(Actividad actividad) {
        try {
            // Insertar Actividad y obtener su ID
            int actividadID = actividadDAO.insertarActividad(actividad);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Actividad buscarActividad(int actividadId) {
        try {
            return actividadDAO.buscarPorId(actividadId);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
     public void eliminarLaActividad(int actividadId) {
        try {
            // Eliminar la actividad
            actividadDAO.eliminarActividad(actividadId);
    
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
        // Método para actualizar una actividad
    public void actualizarLaActividad(Actividad actividad) {
        try {
            
            actividadDAO.actualizarActividad(actividad);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Método para buscar actividades por valor de reducción de condena
    public List<Actividad> buscarPorReduccionCondena(int reduccionCondena) {
        try {
            return actividadDAO.buscarPorReduccionCondena(reduccionCondena);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
