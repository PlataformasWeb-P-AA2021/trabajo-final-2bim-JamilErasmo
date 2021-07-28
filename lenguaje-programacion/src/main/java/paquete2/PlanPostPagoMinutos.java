/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.io.Serializable;
import paquete1.Persona;
import paquete1.PlanCelular;

/**
 *
 * @author macbookair
 */
public class PlanPostPagoMinutos extends PlanCelular implements Serializable {

    private double minutosNacionales;
    private double costoMinutoNacional;
    private double minutosInternacionales;
    private double costoMinutoInternacional;

    public PlanPostPagoMinutos(Persona c, String mC, String moC, int nC,
            double mN, double cN, double mI, double cI) {
        super(c, mC, moC, nC);
        minutosNacionales = mN;
        costoMinutoNacional = cN;
        minutosInternacionales = mI;
        costoMinutoInternacional = cI;
    }

    public void establecerMinutosNacionales(int n) {
        minutosNacionales = n;
    }

    public void establecerCostoMinutoNacional(double n) {
        costoMinutoNacional = n;
    }

    public void establecerMinutosInternacionales(int n) {
        minutosInternacionales = n;
    }

    public void establecerCostoMinutoInternacional(double n) {
        costoMinutoInternacional = n;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = ((minutosNacionales * costoMinutoNacional)
                + (minutosInternacionales * costoMinutoInternacional));
    }

    public double obtenerMinutosNacionales() {
        return minutosNacionales;
    }

    public double obtenerCostoMinutoNacional() {
        return costoMinutoNacional;
    }

    public double obtenerMinutosInternacionales() {
        return minutosInternacionales;
    }

    public double obtenerCostoMinutoInternacional() {
        return costoMinutoInternacional;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nMinutos nacionales: %.2f\n"
                + "Costo por minutos nacionales: %.2f\n"
                + "Minutos internacionales: %.2f\n"
                + "Costo por minutos internacionales: %.2f\n"
                + "Pago Mensual: %.2f\n", super.toString(),
                minutosNacionales,
                costoMinutoNacional,
                minutosInternacionales,
                costoMinutoInternacional,
                pagoMensual);
        return cadena;
    }
}
