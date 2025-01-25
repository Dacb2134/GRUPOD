package controlador;

import modelo.UsuarioDAO;

public class UsuarioControlador {

    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public boolean autenticarUsuario(String username, String password, String role) {
        return usuarioDAO.autenticarUsuario(username, password, role);
    }
}


