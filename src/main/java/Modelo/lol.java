/*
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FrmRegistroRecluso extends javax.swing.JFrame {

    // Variables de la interfaz
    private javax.swing.JButton jButton1;  // btnRegistrar
    private javax.swing.JButton jButton2;  // btnModificar
    private javax.swing.JButton jButton3;  // btnEliminar
    private javax.swing.JButton jButton4;  // btnBuscar
    private javax.swing.JComboBox<String> jComboBox1;  // comboGenero
    private javax.swing.JComboBox<String> jComboBox2;  // comboEstadoRecluso
    private javax.swing.JFormattedTextField jFormattedTextField1;  // txtCedula
    private javax.swing.JFormattedTextField jFormattedTextField2;  // txtFechaIngreso
    private javax.swing.JFormattedTextField jFormattedTextField3;  // txtEdad
    private javax.swing.JTextArea jTextArea1;  // txtDelitos
    private javax.swing.JTextArea jTextArea2;  // txtCargos
    private javax.swing.JTextField jTextField1;  // txtNombres
    private javax.swing.JTextField jTextField2;  // txtApellidos
    private javax.swing.JTextField jTextField3;  // txtCondenaDias
    private javax.swing.JTextField jTextField4;  // txtFechaInicioCondena
    private javax.swing.JTextField jTextField7;  // txtFechaEstimadaLiberacion
    private javax.swing.JTextField jTextField8;  // txtEdad

    public FrmRegistroRecluso() {
        initComponents();
    }

    private void initComponents() {
        // Inicializar componentes y configurar la interfaz (esto debe ser creado en tu UI)
        // Aquí solo se configura la acción de los botones y la inicialización de los componentes
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarRecluso();
            }
        });

        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                modificarRecluso();
            }
        });

        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                eliminarRecluso();
            }
        });

        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buscarRecluso();
            }
        });
    }

    // Método para registrar un nuevo recluso
    private void registrarRecluso() {
        // Obtener datos de los campos
        String cedula = jFormattedTextField1.getText();
        String apellidos = jTextField2.getText();
        String nombres = jTextField1.getText();
        int edad = Integer.parseInt(jTextField8.getText());
        String genero = (String) jComboBox1.getSelectedItem();
        String estadoRecluso = (String) jComboBox2.getSelectedItem();

        Date fechaIngreso = obtenerFecha(jFormattedTextField2.getText());
        Date fechaInicioCondena = obtenerFecha(jTextField4.getText());
        Date fechaEstimadaLiberacion = obtenerFecha(jTextField7.getText());

        // Crear el objeto Recluso
        Recluso recluso = new Recluso(cedula, apellidos, nombres, edad, genero, estadoRecluso, fechaIngreso);

        // Crear el objeto Condena
        int condenaDias = Integer.parseInt(jTextField3.getText());
        String delitos = jTextArea1.getText();
        String cargos = jTextArea2.getText();
        Condena condena = new Condena(delitos, cargos, condenaDias, fechaInicioCondena, fechaEstimadaLiberacion);

        // Insertar en la base de datos utilizando el DAO
        ReclusoDAO reclusoDAO = new ReclusoDAO();
        try {
            reclusoDAO.insertarRecluso(recluso);
            CondenaDAO condenaDAO = new CondenaDAO();
            condenaDAO.insertarCondena(condena);
            JOptionPane.showMessageDialog(this, "Recluso registrado con éxito.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al registrar el recluso: " + ex.getMessage());
        }
    }

    // Método para modificar un recluso
    private void modificarRecluso() {
        // Obtener los datos y actualizar en la base de datos
        String cedula = jFormattedTextField1.getText();
        // Lógica para modificar el recluso
        // Similar al de registrar, pero con una lógica diferente para actualizar
    }

    // Método para eliminar un recluso
    private void eliminarRecluso() {
        String cedula = jFormattedTextField1.getText();
        ReclusoDAO reclusoDAO = new ReclusoDAO();
        try {
            reclusoDAO.eliminarRecluso(cedula);
            JOptionPane.showMessageDialog(this, "Recluso eliminado con éxito.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el recluso: " + ex.getMessage());
        }
    }

    // Método para buscar un recluso
    private void buscarRecluso() {
        String cedula = jFormattedTextField1.getText();

        ReclusoDAO reclusoDAO = new ReclusoDAO();
        try {
            Recluso recluso = reclusoDAO.buscarReclusoPorCedula(cedula);
            if (recluso != null) {
                // Si el recluso existe, cargar los datos en los campos
                jTextField2.setText(recluso.getApellidos());
                jTextField1.setText(recluso.getNombres());
                jTextField8.setText(String.valueOf(recluso.getEdad()));
                jComboBox1.setSelectedItem(recluso.getGenero());
                jComboBox2.setSelectedItem(recluso.getEstadoRecluso());
                jFormattedTextField2.setText(formatFecha(recluso.getFechaIngreso()));
            } else {
                JOptionPane.showMessageDialog(this, "Recluso no encontrado.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar el recluso: " + ex.getMessage());
        }
    }

    // Método para obtener la fecha en formato adecuado desde un String
    private Date obtenerFecha(String fechaTexto) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.parse(fechaTexto);
        } catch (Exception e) {
            return null;
        }
    }

    // Método para formatear una fecha en String
    private String formatFecha(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(fecha);
    }

    public static void main(String[] args) {
        // Ejecutar la interfaz
        FrmRegistroRecluso frm = new FrmRegistroRecluso();
        frm.setVisible(true);
    }
}

 */
package Modelo;

/**
 *
 * @author KEISUKE29
 */
public class lol {
    
}
