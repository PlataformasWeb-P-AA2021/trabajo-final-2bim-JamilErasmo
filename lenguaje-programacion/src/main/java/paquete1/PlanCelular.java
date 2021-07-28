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
public abstract class PlanCelular implements Serializable{
    protected Persona cliente;
    protected String marcaCelular;
    protected String modeloCelular;
    protected int numeroCelular;
    protected double pagoMensual;
    
    public PlanCelular(Persona c, String mC, String moC, int nC){
        cliente = c;
        marcaCelular = mC;
        modeloCelular = moC;
        numeroCelular = nC;
    }
    
    public void establecerCliente(Persona n){
        cliente = n;
    }
    
    public void establecerMarcaCelular(String n){
        marcaCelular = n;
    }
    
    public void establecerModeloCelular(String n){
        modeloCelular = n;
    }
    
    public void establecerNumeroCelular(int n){
        numeroCelular = n;
    }
    
    public abstract void calcularPagoMensual();
    
    public Persona obtenerCliente(){
        return cliente;
    }
    
    public String obtenerMarcaCelular(){
        return marcaCelular;
    }
    
    public String obtenerModeloCelular(){
        return modeloCelular;
    }
    
    public int obtenerNumeroCelular(){
        return numeroCelular;
    }
    
    public double obtenerPagoMensual(){
        return pagoMensual;
    }
    
   @Override
    public String toString() {
        String cadena = String.format("\nNombres: %s\nApellidos: %s\n"
                + "Identificación: %s\nCiudad: %s\nMarca celular: %s\n"
                + "Modelo del celular: %s\nNúmero del celular: %d", 
                cliente.obtenerNombres(),
                cliente.obtenerApellidos(),
                cliente.obtenerIdentificacion(),
                cliente.obtenerCiudad(),
                obtenerMarcaCelular(),
                obtenerModeloCelular(),
                obtenerNumeroCelular());
        return cadena;
    }
    
}
