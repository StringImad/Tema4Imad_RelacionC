/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7;

/**
 *
 * @author imad
 */
public class PruebaCuentaBancaria {

    public static void main(String[] args) {
        CuentaBancaria prueba = new CuentaBancaria();

        System.out.println(prueba);
        System.out.println("-----Intentamos cambiar el interes a 4-----");
        prueba.setInteresAnual(4);
        System.out.println(prueba);
        System.out.println("--------Ingresamos 10000----------");
        prueba.ingresarDinero(10000);
        System.out.println(prueba);
        System.out.println("Intentamos retirar mas dinero del que hay en la cuenta");
        prueba.retirarEfectivo(100000);
        System.out.println("Calculamos el interes");
        prueba.ingresarIntereses();
        System.out.println(prueba);    
    }
}
