package Usuarios.Model.Entity;

import Abstractas.Persona;

public class Usuario extends Persona {
    private String tipoUsuario;

    public Usuario(String nombre, String apellido, String tipoUsuario) {
        super(nombre, apellido);
        this.tipoUsuario = tipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
