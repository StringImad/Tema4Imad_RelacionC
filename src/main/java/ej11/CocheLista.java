/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

import java.util.ArrayList;

/**
 *
 * @author imad
 */
public class CocheLista {

    private Motor motor;
    private Puerta puertaPiloto;
    private Puerta puertaCopiloto;
    private ArrayList<Rueda> listaRuedas;

    public CocheLista(Motor motor, Puerta puertaPiloto, Puerta puertaCopiloto, ArrayList<Rueda> listaRuedas) {
        this.motor = motor;
        this.puertaPiloto = puertaPiloto;
        this.puertaCopiloto = puertaCopiloto;
        this.listaRuedas = listaRuedas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Puerta getPuertaPiloto() {
        return puertaPiloto;
    }

    public void setPuertaPiloto(Puerta puertaPiloto) {
        this.puertaPiloto = puertaPiloto;
    }

    public Puerta getPuertaCopiloto() {
        return puertaCopiloto;
    }

    public void setPuertaCopiloto(Puerta puertaCopiloto) {
        this.puertaCopiloto = puertaCopiloto;
    }

    public ArrayList<Rueda> getListaRuedas() {
        return listaRuedas;
    }

    public void setListaRuedas(ArrayList<Rueda> listaRuedas) {
        this.listaRuedas = listaRuedas;
    }

    @Override
    public String toString() {
        return "CocheLista{" + "motor=" + motor + ", puertaPiloto=" + puertaPiloto + ", puertaCopiloto=" + puertaCopiloto + ", listaRuedas=" + listaRuedas + '}';
    }
    
    

}
