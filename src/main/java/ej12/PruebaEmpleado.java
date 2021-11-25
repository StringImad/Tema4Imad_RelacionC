/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author imad
 */
public class PruebaEmpleado {
    
    public static void main(String[] args) {
        Empleado prueba1 = new Empleado();
        
        System.out.println(prueba1.toString());
        prueba1.setNombre("Vico");
        prueba1.setEstaCasado(false);
        
        System.out.println(prueba1.toString());
        
    }
}
