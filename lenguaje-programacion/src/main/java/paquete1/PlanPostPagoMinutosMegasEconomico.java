/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author macbookair
 */
public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {

    private double minutos;
    private double costoMinutos;
    private double gigas;
    private double costoGigas;
    private double porcentajeDescuento;

    public PlanPostPagoMinutosMegasEconomico(Persona c, String mC, String moC,
            int nC, double m, double cM, double g, double cG, double pD) {
        super(c, mC, moC, nC);
        minutos = m;
        costoMinutos = cM;
        gigas = g;
        costoGigas = cG;
        porcentajeDescuento = pD;
    }

    public void establecerMinutos(double n) {
        minutos = n;
    }

    public void establecerCostoMinutos(double n) {
        costoMinutos = n;
    }

    public void establecerGigas(double n) {
        gigas = n;
    }

    public void establecerCostoGigas(double n) {
        costoGigas = n;
    }

    public void establecerPorcentajeDescuento(double n) {
        porcentajeDescuento = n;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = ((minutos * costoMinutos) + (gigas * costoGigas)
                * porcentajeDescuento/100);
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMinutos() {
        return costoMinutos;
    }

    public double obtenerGigas() {
        return gigas;
    }

    public double obtenerCostoGigas() {
        return costoGigas;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%s\nMinutos: %.2f\n"
                + "Costo por minutos: %.2f\n"
                + "Megas expresado en gigas: %.2f\n"
                + "Costo por cada gigas: %.2f\n"
                + "Porcentaje de descuento: %.2f\n"
                + "Pago Mensual: %.2f\n",
                super.toString(),
                minutos,
                costoMinutos,
                gigas,
                costoGigas,
                porcentajeDescuento,
                pagoMensual);
        return cadena;
    }
}
