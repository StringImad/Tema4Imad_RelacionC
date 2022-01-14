/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author imad
 */
public class Puerta {

    private Ventana ventana;
    private boolean estado;

    public Puerta(Ventana ventana, boolean estado) {
        this.ventana = ventana;
        this.estado = estado;
    }

    public void abrir() {
        this.estado = true;
    }

    public void cerrar() {
        this.estado = false;
    }

    public Puerta(Ventana ventana) {
        this.ventana = ventana;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    @Override
    public String toString() {
        return "Puerta{" + "ventana=" + ventana + '}';
    }

}
