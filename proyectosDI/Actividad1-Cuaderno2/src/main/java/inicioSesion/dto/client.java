/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicioSesion.dto;

import java.util.Date;

/**
 *
 * @author estudiante
 */
public class client {
    private String trato;
    private String usuario;
    private String contra1;
    private String nacimiento;
    private String fechaRegistro;
    private String pathImage;
    private int edad;

    public client(String trato, String usuario, String contra1, String nacimiento, String fechaRegistro, int edad, String Pimage) {
        this.trato = trato;
        this.usuario = usuario;
        this.contra1 = contra1;
        this.nacimiento = nacimiento;
        this.fechaRegistro = fechaRegistro;
        this.edad = edad;
        this.pathImage = Pimage;
    }

    public String getTrato() {
        return trato;
    }

    public void setTrato(String trato) {
        this.trato = trato;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra1() {
        return contra1;
    }

    public void setContra1(String contra1) {
        this.contra1 = contra1;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }
}