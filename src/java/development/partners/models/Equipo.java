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
public class Equipo {
    private String no_serie;
    private String marca;
    private String modelo;
    private String so;
    private String hd;
    private String ram;
    private String ip;
    private String estado;

    public String getNo_serie() {
        return no_serie;
    }

    public void setNo_serie(String no_serie) {
        this.no_serie = no_serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Equipo{" + "no_serie=" + no_serie + ", marca=" + marca + ", modelo=" + modelo + ", so=" + so + ", hd=" + hd + ", ram=" + ram + ", ip=" + ip + ", estado=" + estado + '}';
    }
    
    
    
    
}
