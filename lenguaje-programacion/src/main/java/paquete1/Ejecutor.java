/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;
import paquete2.EscrituraArchivoSecuencial;
import paquete2.LecturaArchivoSecuencial;
import paquete2.PlanPostPagoMinutos;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<PlanCelular> plan = new ArrayList<>();
        String n = "Planes.data";
        int bandera = 0;
        while (bandera != 5) {
            System.out.println("Ingrese el plan que desea.\n1. Plan postPago minutos\n"
                    + "2. Plan postPago megas\n3. Plan postPago minutos megas\n"
                    + "4. Plan postPago minutos megas economico\n5. Salir");
            bandera = entrada.nextInt();
            switch (bandera) {
                case 1:
                    PlanPostPagoMinutos(plan);
                    break;

                case 2:
                    PlanPostPagoMegas(plan);
                    break;

                case 3:
                    PlanPostPagoMinutosMegas(plan);
                    break;

                case 4:
                    PlanPostPagoMinutosEconomico(plan);
                    break;

                case 5:
                    bandera = 5;
                    break;
            }
        }

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(n);

        for (int i = 0; i < plan.size(); i++) {
            plan.get(i).calcularPagoMensual();
            archivo.establecerRegistro(plan.get(i));
            archivo.establecerSalida();

        }
        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(n);
        lectura.establecerPlanCelular();

        System.out.println(lectura);
        lectura.cerrarArchivo();

    }

    public static void PlanPostPagoMinutos(ArrayList<PlanCelular> plan) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los nombres del cliente");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese los apellidos del cliente");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese su identificación ");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese la ciudad en la que reside");
        String ciudad = entrada.nextLine();
        Persona p = new Persona(nombre, apellidos, identificacion, ciudad);
        System.out.println("Ingrese la marca del celular");
        String marcaCelular = entrada.nextLine();
        System.out.println("Ingrese el modelo del celular");
        String modeloCelular = entrada.nextLine();
        System.out.println("Ingrese el número del celular");
        int numeroCelular = entrada.nextInt();
        System.out.println("Ingrese los minutos nacionales");
        double minutosNacionales = entrada.nextDouble();
        System.out.println("Ingrese el costo por minuto nacional");
        double costoMinutosNacionales = entrada.nextDouble();
        System.out.println("Ingrese los minutos internacionales");
        double minutosInternacionales = entrada.nextDouble();
        System.out.println("Ingrese el costo por minuto internacional");
        double costoMinutosInternacionales = entrada.nextDouble();

        PlanPostPagoMinutos planpagoMinutos = new PlanPostPagoMinutos(p,
                marcaCelular, modeloCelular, numeroCelular, minutosNacionales,
                costoMinutosNacionales, minutosInternacionales,
                costoMinutosInternacionales);
        plan.add(planpagoMinutos);

    }

    public static void PlanPostPagoMegas(ArrayList<PlanCelular> plan) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los nombres del cliente");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese los apellidos del cliente");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese su identificación ");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese la ciudad en la que reside");
        String ciudad = entrada.nextLine();
        Persona p = new Persona(nombre, apellidos, identificacion, ciudad);
        System.out.println("Ingrese la marca del celular");
        String marcaCelular = entrada.nextLine();
        System.out.println("Ingrese el modelo del celular");
        String modeloCelular = entrada.nextLine();
        System.out.println("Ingrese el número del celular");
        int numeroCelular = entrada.nextInt();
        System.out.println("Ingrese las megas expresado en gigas");
        double gigas = entrada.nextDouble();
        System.out.println("Ingrese el costo por cada gigas");
        double costoGigas = entrada.nextDouble();
        System.out.println("Ingrese la tarifa base");
        double tarifaBase = entrada.nextDouble();

        PlanPostPagoMegas planpagomegas = new PlanPostPagoMegas(p, marcaCelular,
                modeloCelular, numeroCelular, gigas, costoGigas, tarifaBase);

        plan.add(planpagomegas);

    }

    public static void PlanPostPagoMinutosMegas(ArrayList<PlanCelular> plan) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los nombres del cliente");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese los apellidos del cliente");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese su identificación ");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese la ciudad en la que reside");
        String ciudad = entrada.nextLine();
        Persona p = new Persona(nombre, apellidos, identificacion, ciudad);
        System.out.println("Ingrese la marca del celular");
        String marcaCelular = entrada.nextLine();
        System.out.println("Ingrese el modelo del celular");
        String modeloCelular = entrada.nextLine();
        System.out.println("Ingrese el número del celular");
        int numeroCelular = entrada.nextInt();
        System.out.println("Ingrese los minutos ");
        double minutos = entrada.nextDouble();
        System.out.println("Ingrese el costo por minutos");
        double costoMinutos = entrada.nextDouble();
        System.out.println("Ingrese las megas expresado en gigas");
        double gigas = entrada.nextDouble();
        System.out.println("Ingrese el costo por cada gigas");
        double costoGigas = entrada.nextDouble();

        PlanPostPagoMinutosMegas planminutosmegas = new PlanPostPagoMinutosMegas(p,
                marcaCelular, modeloCelular, numeroCelular, minutos, costoMinutos,
                gigas, costoGigas);

        plan.add(planminutosmegas);

    }

    public static void PlanPostPagoMinutosEconomico(ArrayList<PlanCelular> plan) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los nombres del cliente");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese los apellidos del cliente");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese su identificación ");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese la ciudad en la que reside");
        String ciudad = entrada.nextLine();
        Persona p = new Persona(nombre, apellidos, identificacion, ciudad);
        System.out.println("Ingrese la marca del celular");
        String marcaCelular = entrada.nextLine();
        System.out.println("Ingrese el modelo del celular");
        String modeloCelular = entrada.nextLine();
        System.out.println("Ingrese el número del celular");
        int numeroCelular = entrada.nextInt();
        System.out.println("Ingrese los minutos ");
        double minutos = entrada.nextDouble();
        System.out.println("Ingrese el costo por minutos");
        double costoMinutos = entrada.nextDouble();
        System.out.println("Ingrese las megas expresado en gigas");
        double gigas = entrada.nextDouble();
        System.out.println("Ingrese el costo por cada gigas");
        double costoGigas = entrada.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento");
        double porcentajeDescuento = entrada.nextDouble();

        PlanPostPagoMinutosMegasEconomico planmegaseconomico = new PlanPostPagoMinutosMegasEconomico(p, marcaCelular, modeloCelular,
                numeroCelular, minutos, costoMinutos, gigas, costoGigas,
                porcentajeDescuento);

        plan.add(planmegaseconomico);

    }
}
