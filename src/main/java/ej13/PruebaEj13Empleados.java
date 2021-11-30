/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author imad
 */
public class PruebaEj13Empleados {

    public static void main(String[] args) {
        EmpleadoEj13 prueba1 = new EmpleadoEj13();

//        System.out.println(prueba1.toString());
//        prueba1.setNombre("Vico");
//        prueba1.setEstaCasado(false);
//        System.out.println(prueba1.toString());
//        System.out.println("El complemento por las horas que ha realizado " + prueba1.getNombre() + " es de: "
//                + prueba1.calculoComplementoHorasExtrasRealizadas() + "€");
        EmpleadoEj13 prueba2 = new EmpleadoEj13("Jose", "Jimenez", "1284392S", 1800, 15, 20, 12, true, 2);

        System.out.println("-----------------------Informacion extendida------------------");
        prueba2.escribirAllInfo();
        System.out.println("------------------------------------------------");
//        System.out.println("El complemento por las horas que ha realizado " + prueba2.getNombre() + " es de: "
//                + prueba2.calculoComplementoHorasExtrasRealizadas() + "€");
//
//        System.out.println(prueba2.getNombre() + " tiene un sueldo bruto de: " + prueba2.calculoSueldoBruto() + "€ ");
//
//        System.out.println("Tiene un IRPF de: " + prueba2.getTipoIrpf() + "%\ny al estar " + prueba2.estaCasadoSiNo() + " y tiene " + prueba2.getNumHijos() + " hijos\nEl calculo del irpf es: " + prueba2.calculoRetencionIrpf() + "€");
//
//        System.out.println("Sueldo neto que recibe es: " + prueba2.calculoSueldoNeto());
//
//        System.out.println("------------------------Informacion basica--------------------");
//        prueba2.escribirBasicInfo();
//        System.out.println(prueba2.getNombre() + " se ha divorciado y ya no tiene hijos");
//        prueba2.setEstaCasado(false);
//        prueba2.setNumHijos(0);
//        System.out.println("-----------------------Informacion extendida------------------");
//        prueba2.escribirAllInfo();
//
//        prueba2.toString();
    }
}
