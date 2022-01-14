/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author imad
 */
public class PruebaCocheEj11 {

    public static void main(String[] args) {
        Motor motor = new Motor(2.0, false);
        Ventana ventana1 = new Ventana(true, true);
        Ventana ventana2 = new Ventana(true, true);

        Puerta puertaPiloto = new Puerta(ventana1, false);
        Puerta puertaCopiloto = new Puerta(ventana2, false);

        Rueda delanteraDer = new Rueda(80, true);
        Rueda delanteraIzq = new Rueda(80, true);
        Rueda traseraDer = new Rueda(80, true);
        Rueda traseraIzq = new Rueda(80, true);

        Coche auto = new Coche(motor, puertaPiloto, puertaCopiloto, delanteraDer, delanteraIzq, traseraDer, traseraIzq);
        Coche auto2 = new Coche(new Motor(2.0, false), new Puerta(new Ventana(true, true), false), new Puerta(new Ventana(true, true), false), new Rueda(80, true), new Rueda(80, true), new Rueda(80, true), new Rueda(80, true));

        System.out.println(auto);
        traseraDer.desinflar();
        System.out.println("destintar puerta piloto");
        auto2.getPuertaPiloto().getVentana().setEstaTintada(false);
        System.out.println(auto2);
        
        
        
    }
}
