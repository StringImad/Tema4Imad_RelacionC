package ej1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author imad
 */
public class Complejo {
    private double parteReala;
    private double parteImaginariab;

    public Complejo() {
    }

    public Complejo(double parteReala, double parteImaginariab) {
        this.parteReala = parteReala;
        this.parteImaginariab = parteImaginariab;
    }
    

    
    public double getParteReala() {
        return parteReala;
    }

    public void setParteReala(double parteReala) {
        this.parteReala = parteReala;
    }

    public double getParteImaginariab() {
        return parteImaginariab;
    }

    public void setParteImaginariab(double parteImaginariab) {
        this.parteImaginariab = parteImaginariab;
    }
    public static double sumar(){
        double suma = 0;
        return suma;
    }
 public static double resta(){
        double suma = 0;
        return suma;
    }
 public static double multiplicacion(){
        double suma = 0;
        return suma;
    }
 public static double division(){
        double suma = 0;
        return suma;
    }

    @Override
    public String toString() {
        return "Complejo{" + "parteReala=" + parteReala + ", parteImaginariab=" + parteImaginariab + '}';
    }
    
    
    
}
