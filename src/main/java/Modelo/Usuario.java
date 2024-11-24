package modelo;


public class Usuario {
    private int usuarioId;
    private String nombre;
    private String apellido;
    private String username;
    private String password;
    private int roleId;
    private boolean estado; // true: Activo, false: Inactivo


    // Constructor vacío
    public Usuario() {
    }

    // Constructor con parámetros
    public Usuario(int usuarioId, String nombre, String apellido, String username, String password, int roleId, boolean estado) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
        this.roleId = roleId;
        this.estado = estado;
     
    }

    // Getters y Setters
    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "Usuario{" +
               "usuarioId=" + usuarioId +
               ", nombre='" + nombre + '\'' +
               ", apellido='" + apellido + '\'' +
               ", username='" + username + '\'' +
               ", roleId=" + roleId +
               ", estado=" + estado +'}';
    }
}
