/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej9;

/**
 *
 * @author imad
 */
public class NIF {

    private String numeroDNI;
    private char letraDNI;
    private static int contadorDeInstancias;

    public NIF(String numeroDNI) {
        if(numeroDNI.length()>8||numeroDNI.length()<8){
            numeroDNI = "12345678";
        }
        this.numeroDNI = numeroDNI;
        this.letraDNI = (char) generadorLetraDni();
        contadorDeInstancias++;
    }

    private char generadorLetraDni() {
        int letraGenerada = 0;
        String palabra = "TRWAGMYFPDXBNJZSQVHLCKE";
        // char letra = 0;
        letraGenerada = (Integer.parseInt(getNumeroDNI()) % 23);

        return palabra.charAt(letraGenerada);
    }

    public String getNumeroDNI() {
        return numeroDNI;
    }

    public char getLetraDNI() {
        return letraDNI;
    }

    public static int getContadorDeInstancias() {
        return contadorDeInstancias;
    }

    @Override
    public String toString() {
        return "NIF{" + numeroDNI + "-" + letraDNI + '}';
    }

}
