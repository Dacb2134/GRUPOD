package Modelo;

public class Condena {
    private int condenaId;
    private int reclusoId;
    private String FechaIngreso;
    private String delitos;
    private String cargos;
    private int condenaDias;
    private String fechaInicioCondena;
    private String fechaEstimacionLiberacion;

    // Constructor vacío
    public Condena() {}

    // Constructor completo
    public Condena(int condenaId, int reclusoId, String FechaIngreso, String delitos, String cargos, int condenaDias, String fechaInicioCondena, String fechaEstimacionLiberacion) {
        this.condenaId = condenaId;
        this.reclusoId = reclusoId;
        this.FechaIngreso = FechaIngreso;
        this.delitos = delitos;
        this.cargos = cargos;
        this.condenaDias = condenaDias;
        this.fechaInicioCondena = fechaInicioCondena;
        this.fechaEstimacionLiberacion = fechaEstimacionLiberacion;
    }

    // Getters y Setters
    public int getCondenaId() {
        return condenaId;
    }

    public void setCondenaId(int condenaId) {
        this.condenaId = condenaId;
    }

    public int getReclusoId() {
        return reclusoId;
    }

    public void setReclusoId(int reclusoId) {
        this.reclusoId = reclusoId;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public String getDelitos() {
        return delitos;
    }

    public void setDelitos(String delitos) {
        this.delitos = delitos;
    }

    public String getCargos() {
        return cargos;
    }

    public void setCargos(String cargos) {
        this.cargos = cargos;
    }

    public int getCondenaDias() {
        return condenaDias;
    }

    public void setCondenaDias(int condenaDias) {
        this.condenaDias = condenaDias;
    }

    public String getFechaInicioCondena() {
        return fechaInicioCondena;
    }

    public void setFechaInicioCondena(String fechaInicioCondena) {
        this.fechaInicioCondena = fechaInicioCondena;
    }

    public String getFechaEstimacionLiberacion() {
        return fechaEstimacionLiberacion;
    }

    public void setFechaEstimacionLiberacion(String fechaEstimacionLiberacion) {
        this.fechaEstimacionLiberacion = fechaEstimacionLiberacion;
    }
}
