
package Modelo;


public class Actividad {
    
    private int actividadId, reduccionCondena;
    private String nombreActividad, descripcion;
    private boolean Isestado;
    
    public Actividad(){
        
    }

    public int getActividadId() {
        return actividadId;
    }

    public void setActividadId(int actividadId) {
        this.actividadId = actividadId;
    }

    public int getReduccionCondena() {
        return reduccionCondena;
    }

    public void setReduccionCondena(int reduccionCondena) {
        this.reduccionCondena = reduccionCondena;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getIsestado() {
        return Isestado;
    }

    public void setIsestado(boolean Isestado) {
        this.Isestado = Isestado;
    }
    
    
}
