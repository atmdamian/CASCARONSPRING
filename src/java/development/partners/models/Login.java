/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package development.partners.models;

/**
 *
 * @author DeveloperSr
 */
public class Login {
    private String nombre_usuario;
    private String contraseña;

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Login{" + "nombre_usuario=" + nombre_usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
    
    
}
