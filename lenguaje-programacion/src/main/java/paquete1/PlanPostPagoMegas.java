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
public class PlanPostPagoMegas extends PlanCelular {

    private double gigas;
    private double costoGigas;
    private double tarifaBase;

    public PlanPostPagoMegas(Persona c, String mC, String moC, int nC,
            double g, double cG, double tB) {
        super(c, mC, moC, nC);
        gigas = g;
        costoGigas = cG;
        tarifaBase = tB;
    }

    public void establecerGigas(double n) {
        gigas = n;
    }

    public void establecerCostoGigas(double n) {
        costoGigas = n;
    }

    public void establecerTarifaBase(double n) {
        tarifaBase = n;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = ((gigas * costoGigas) + tarifaBase);
    }

    public double obtenerGigas() {
        return gigas;
    }

    public double obtenerCostoGigas() {
        return costoGigas;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nMegas expresado en gigas: %.2f\n"
                + "Costo por cada gigas: %.2f\n"
                + "Tarifa base: %.2f\n"
                + "Pago Mensual: %.2f\n", super.toString(),
                gigas,
                costoGigas,
                tarifaBase,
                pagoMensual);
        return cadena;
    }
}
