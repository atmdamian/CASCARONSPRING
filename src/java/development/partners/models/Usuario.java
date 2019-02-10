/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package development.partners.models;

/**
 *
 * @author jackh
 */
public class Usuario {
    private String user;
    private String pass;
    private String nombre;
    private String apellidos;
    private String estado;
    private String [] sexo;
    private String [] hobbie;

    public String getApellidos() {
        return apellidos;
    }

    public String[] getHobbie() {
        return hobbie;
    }

    public String getEstado() {
        return estado;
    }

   

    public String getNombre() {
        return nombre;
    }

    public String getPass() {
        return pass;
    }

   
    public String getUser() {
        return user;
    }
    public String[] getSexo() {
        return sexo;
    }

    

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }   
    public void setUser(String user) {
        this.user = user;
    }

    public void setSexo(String[] sexo) {
        this.sexo = sexo;
    }

    public void setHobbie(String[] hobbie) {
        this.hobbie = hobbie;
    }
    

    @Override
    public String toString() {
        return super.toString();
    }

    
    
    
    
}
