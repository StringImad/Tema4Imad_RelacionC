/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

/**
 *
 * @author imad
 */
public class PruebaGeometrica {
    public static void main(String[] args) {
        PuntoGeometrico prueba1 = new PuntoGeometrico();
        prueba1.setCoordenadaX(2);
        prueba1.setCoordenadaY(40);
        
        System.out.println(prueba1);
        
        Linea prueba2 = new Linea();
        prueba2.MostrarLinea();
    }
}
