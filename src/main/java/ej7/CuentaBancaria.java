/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author imad
 */
public class CuentaBancaria {

    private String numeroCuenta;
    private String nifCliente;
    private String nomCliente;
    private double saldoActual;
    private double interesAnual;

    //Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = RandomStringUtils.randomNumeric(20).toUpperCase();
        this.nifCliente = "23232317A";
        this.nomCliente = "Jonas";
        this.saldoActual = 23000;
        this.interesAnual = 1.3;
    }
//Constructor parametrizado

    public CuentaBancaria(String nifCliente, String nomCliente, double saldoActual, double interesAnual) {
        this.numeroCuenta = RandomStringUtils.randomNumeric(15).toUpperCase();
        this.nifCliente = nifCliente;
        this.nomCliente = nomCliente;
        this.saldoActual = saldoActual;
        this.interesAnual = 2;
        if (interesAnual < 3 && interesAnual >= 0.1) {
            this.interesAnual = interesAnual;
        }
    }

    public void ingresarIntereses() {
        this.saldoActual += (interesAnual * saldoActual)/100;
    }

    public void ingresarDinero(double cantidad) {

        this.saldoActual = saldoActual + cantidad;
    }

    public void retirarEfectivo(double cantidad) {
        if (cantidad > saldoActual) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldoActual = saldoActual - cantidad;
        }

    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNifCliente() {
        return nifCliente;
    }

    public void setNifCliente(String nifCliente) {
        this.nifCliente = nifCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {

        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = 2;
        if (interesAnual < 3 && interesAnual >= 0.1) {
            this.interesAnual = interesAnual;
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", nifCliente=" + nifCliente + ", nomCliente=" + nomCliente + ", saldoActual=" + saldoActual + ", interesAnual=" + interesAnual + '}';
    }

}
