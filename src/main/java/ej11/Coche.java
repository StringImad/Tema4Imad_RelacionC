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
public class Coche {

    private Motor motor;
    private Puerta puertaPiloto;
    private Puerta puertaCopiloto;

    private Rueda delanteraDer;
    private Rueda delanteraIzq;
    private Rueda traseraDer;
    private Rueda traseraIzq;

    public Coche(Motor motor, Puerta puertaPiloto, Puerta puertaCopiloto, Rueda delanteraDer, Rueda delanteraIzq, Rueda traseraDer, Rueda traseraIzq) {
        this.motor = motor;
        this.puertaPiloto = puertaPiloto;
        this.puertaCopiloto = puertaCopiloto;
        this.delanteraDer = delanteraDer;
        this.delanteraIzq = delanteraIzq;
        this.traseraDer = traseraDer;
        this.traseraIzq = traseraIzq;
    }
    
    

    /**
     * Get the value of motor
     *
     * @return the value of motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * Set the value of motor
     *
     * @param motor new value of motor
     */
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

    public Rueda getDelanteraDer() {
        return delanteraDer;
    }

    public void setDelanteraDer(Rueda delanteraDer) {
        this.delanteraDer = delanteraDer;
    }

    public Rueda getDelanteraIzq() {
        return delanteraIzq;
    }

    public void setDelanteraIzq(Rueda delanteraIzq) {
        this.delanteraIzq = delanteraIzq;
    }

    public Rueda getTraseraDer() {
        return traseraDer;
    }

    public void setTraseraDer(Rueda traseraDer) {
        this.traseraDer = traseraDer;
    }

    public Rueda getTraseraIzq() {
        return traseraIzq;
    }

    public void setTraseraIzq(Rueda traseraIzq) {
        this.traseraIzq = traseraIzq;
    }

    @Override
    public String toString() {
        return "Coche{" + "motor=" + motor + ", puertaPiloto=" + puertaPiloto + ", puertaCopiloto=" + puertaCopiloto + ", delanteraDer=" + delanteraDer + ", delanteraIzq=" + delanteraIzq + ", traseraDer=" + traseraDer + ", traseraIzq=" + traseraIzq + '}';
    }

}
