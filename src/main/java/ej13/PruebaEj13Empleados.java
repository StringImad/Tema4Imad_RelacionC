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

        System.out.println(prueba1.toString());
        prueba1.setNombre("Vico");
        prueba1.setEstaCasado(false);

        System.out.println(prueba1.toString());

        System.out.println("El complemento por las horas que ha realizado " + prueba1.getNombre() + " es de: "
                + prueba1.calculoComplementoHorasExtrasRealizadas() + "€");

        EmpleadoEj13 prueba2 = new EmpleadoEj13("Jose", "Jimenez", "1284392S", 1440.0, 20, 8, 10, false, 0);

        System.out.println("El complemento por las horas que ha realizado " + prueba2.getNombre() + " es de: "
                + prueba2.calculoComplementoHorasExtrasRealizadas() + "€");
        prueba2.calculoSueldoBruto(prueba2.calculoComplementoHorasExtrasRealizadas());
        
    }
}
