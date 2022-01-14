/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author imad
 */
public class Ventana {

    private boolean estaTintada;

    private boolean estado;

    public Ventana(boolean estaTintada, boolean estado) {
        this.estaTintada = estaTintada;
        this.estado = estado;
    }

    public void bajar() {
        this.estado = true;
    }

    public void subir() {
        this.estado = false;
    }

    public boolean isEstado() {
        return estado;
    }

    public boolean isEstaTintada() {
        return estaTintada;
    }
    public String isTintadaString(){
        return estaTintada?"tintada":"no tintada";
    }

    public void setEstaTintada(boolean estaTintada) {
        this.estaTintada = estaTintada;
    }

    @Override
    public String toString() {
        return "Ventana{" + "estaTintada=" + estaTintada + ", estado=" + estado + '}';
    }

}
