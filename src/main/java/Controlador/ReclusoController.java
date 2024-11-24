package Controlador;

import Modelo.Condena;
import Modelo.CondenaDAO;
import Modelo.ReclusoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import modelo.Recluso;

public class ReclusoController {
    private ReclusoDAO reclusoDAO;
    private CondenaDAO condenaDAO;

    public ReclusoController(Connection connection) {
        this.reclusoDAO = new ReclusoDAO(connection);
        this.condenaDAO = new CondenaDAO(connection);
    }

    public void registrarReclusoYCondena(Recluso recluso, Condena condena) {
        try {
            // Insertar recluso y obtener su ID
            int reclusoId = reclusoDAO.insertarRecluso(recluso);
            if (reclusoId > 0) {
                // Asignar el ID del recluso a la condena y registrar la condena
                condena.setReclusoId(reclusoId);
                condenaDAO.insertarCondena(condena);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
     public Recluso buscarReclusoPorCedula(String cedula) {
        try {
            return reclusoDAO.buscarPorCedula(cedula);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
     
         public Condena buscarCondenaPorReclusoId(int reclusoId) {
        try {
            return condenaDAO.buscarPorReclusoId(reclusoId);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
         
             // Método para eliminar un recluso y su condena
    public void eliminarReclusoYCondena(int reclusoId) {
        try {
            // Eliminar primero la condena, luego el recluso
            condenaDAO.eliminarPorReclusoId(reclusoId);
            reclusoDAO.eliminarRecluso(reclusoId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
        // Método para actualizar un recluso y su condena
    public void actualizarReclusoYCondena(Recluso recluso, Condena condena) {
        try {
            // Actualizar primero los datos del recluso
            reclusoDAO.actualizarRecluso(recluso);
            // Luego actualizar la condena
            condenaDAO.actualizarCondena(condena);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
