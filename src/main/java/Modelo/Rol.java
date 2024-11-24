package modelo;

public class Rol {
    private int roleId;
    private String nombreRol;

    // Constructor vacío
    public Rol() {
    }

    // Constructor con parámetros
    public Rol(int roleId, String nombreRol) {
        this.roleId = roleId;
        this.nombreRol = nombreRol;
    }

    // Getters y Setters
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    @Override
    public String toString() {
        return "Rol{" +
               "roleId=" + roleId +
               ", nombreRol='" + nombreRol + '\'' +
               '}';
    }
}
