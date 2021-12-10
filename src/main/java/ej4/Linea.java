/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

/**
 *
 * @author imad
 */
public class Linea {

    private PuntoGeometrico puntoA;
    private PuntoGeometrico puntoB;

    public Linea() {

        puntoA = new PuntoGeometrico(0, 0);
        puntoB = new PuntoGeometrico(1, 1);

    }

    public Linea(PuntoGeometrico puntoA, PuntoGeometrico puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public void moverDerecha(double x) {
        this.puntoA.setCoordenadaX(x);
    }

    public void moverIzquierda(double x) {
        this.puntoA.setCoordenadaY(x);
    }

    public void moverArriba(double y) {
        this.puntoB.setCoordenadaX(y);
    }

    public void moverAbajo(double y) {
        this.puntoB.setCoordenadaX(y);
    }

    public PuntoGeometrico getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(PuntoGeometrico puntoA) {
        this.puntoA = puntoA;
    }

    public PuntoGeometrico getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(PuntoGeometrico puntoB) {
        this.puntoB = puntoB;
    }

    public void MostrarLinea() {
        System.out.println("(" + this.puntoA.getCoordenadaX() + "," + this.puntoA.getCoordenadaY() + "),(" + this.puntoB.getCoordenadaX() + "," + this.puntoB.getCoordenadaY() + ")'");
    }
}
