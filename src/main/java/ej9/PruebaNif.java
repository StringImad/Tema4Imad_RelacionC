/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej9;

/**
 *
 * @author imad
 */
public class PruebaNif {

    public static void main(String[] args) {
        NIF prueba1 = new NIF("79428882");
        NIF prueba2 = new NIF("794288872");
        
        System.out.println(prueba1);
        System.out.println(prueba2);

        System.out.println(NIF.getContadorDeInstancias());
    }
}
