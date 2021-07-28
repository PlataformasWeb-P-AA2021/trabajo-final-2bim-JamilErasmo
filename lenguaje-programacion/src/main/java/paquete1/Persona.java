/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.io.Serializable;

/**
 *
 * @author macbookair
 */
public class Persona implements Serializable{

    private String nombres;
    private String apellidos;
    private String identificacion;
    private String ciudad;

    public Persona(String n, String a, String i, String c) {
        nombres = n;
        apellidos = a;
        identificacion = i;
        ciudad = c;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerApellidos(String n) {
        apellidos = n;
    }

    public void establecerIdentificacion(String n) {
        identificacion = n;
    }
    
    public void establecerCiudad(String n){
        ciudad = n;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }
    
    public String obtenerCiudad(){
        return ciudad;
    }
}
