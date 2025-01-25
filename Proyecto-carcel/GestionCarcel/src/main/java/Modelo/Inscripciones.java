
package Modelo;


public class Inscripciones {
    
    private int inscripcionId, reclusoId, actividadId;
    private boolean Isestado;
    private String fechaFinalizacion;
    
    public Inscripciones(){
        
    }

    public int getInscripcionId() {
        return inscripcionId;
    }

    public void setInscripcionId(int inscripcionId) {
        this.inscripcionId = inscripcionId;
    }

    public int getReclusoId() {
        return reclusoId;
    }

    public void setReclusoId(int reclusoId) {
        this.reclusoId = reclusoId;
    }

    public int getActividadId() {
        return actividadId;
    }

    public void setActividadId(int actividadId) {
        this.actividadId = actividadId;
    }

    public boolean getIsestado() {
        return Isestado;
    }

    public void setIsestado(boolean Isestado) {
        this.Isestado = Isestado;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
    
    
}
