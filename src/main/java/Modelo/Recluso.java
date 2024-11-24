package modelo;

public class Recluso {
    private int reclusoId;
    private String numeroCedula;
    private String nombre;
    private String apellido;
    private int edad;
    private String genero; // Masculino o Femenino
    private boolean isEstado; // 1: Activo, 0: Inactivo


    // Constructor vacío
    public Recluso() {}

    // Constructor completo
    public Recluso(int reclusoId, String numeroCedula, String nombre, String apellido, int edad, String genero, boolean isEstado) {
        this.reclusoId = reclusoId;
        this.numeroCedula = numeroCedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.isEstado = isEstado;
       
    }

    // Getters y Setters
    public int getReclusoId() {
        return reclusoId;
    }

    public void setReclusoId(int reclusoId) {
        this.reclusoId = reclusoId;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public boolean getIsEstado() {
        return isEstado;
    }

    public void setIsEstado(boolean isEstado) {
        this.isEstado = isEstado;
    }
    
}
   
