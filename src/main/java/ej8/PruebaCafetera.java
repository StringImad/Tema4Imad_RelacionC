/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

/**
 *
 * @author imad
 */
public class PruebaCafetera {

    public static void main(String[] args) {
        Cafetera prueba = new Cafetera(1000, 400);

        System.out.println(prueba.toString());
        System.out.println("----Agregando 200ml de Cafe ------");
        prueba.agregarCafe(200);
        System.out.println(prueba.toString());
        System.out.println("----Vaciando la maquina de Cafe ------");
        prueba.vaciarCafetera();
        System.out.println(prueba.toString());
        System.out.println("----------Llenando la cafetera------");
        prueba.llenarCafetera();
        System.out.println(prueba.toString());

        System.out.println("------Sirviendo 800 ml de cafe");
        prueba.servirTaza(800);
        System.out.println(prueba.toString());

        System.out.println("------Sirviendo lo que queda de cafe");
        System.out.println("Hemos servido una cantidad de: "+prueba.servirTaza(550));
        System.out.println(prueba.toString());

    }
}
