/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author imad
 */
public class EmpleadoEj13 {

    private String nombre;
    private String apellidos;
    private String Nif;
    private double sueldoBase;
    private double pagoHoraExtra;
    private int horasExtrasRealizadas;
    private double tipoIrpf;
    private boolean estaCasado;
    private int numHijos;

    public EmpleadoEj13() {
        nombre = "Juan";
        this.apellidos = "Garcia";
        this.Nif = "2342342F";
        this.sueldoBase = 1200;
        this.pagoHoraExtra = 12;
        this.horasExtrasRealizadas = 4;
        this.tipoIrpf = 10;
        this.estaCasado = true;
        this.numHijos = 2;
    }

    public EmpleadoEj13(String nombre, String apellidos, String Nif, double sueldoBase, double pagoHoraExtra, int horasExtrasRealizadas, double tipoIrpf, boolean estaCasado, int numHijos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Nif = Nif;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.horasExtrasRealizadas = horasExtrasRealizadas;
        this.tipoIrpf = tipoIrpf;
        this.estaCasado = estaCasado;
        this.numHijos = numHijos;
    }

    public double calculoComplementoHorasExtrasRealizadas() {
        double resultadoCalculo = 0.0;
        resultadoCalculo = this.horasExtrasRealizadas * this.pagoHoraExtra;
        return resultadoCalculo;
    }

    public double calculoSueldoBruto(double calculoComplementohorasExtras) {
        double resultadoCalculo = 0.0;
        resultadoCalculo = this.sueldoBase +calculoComplementohorasExtras;
        return resultadoCalculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return Nif;
    }

    public void setNif(String Nif) {
        this.Nif = Nif;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(double pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }

    public int getHorasExtrasRealizadas() {
        return horasExtrasRealizadas;
    }

    public void setHorasExtrasRealizadas(int horasExtrasRealizadas) {
        this.horasExtrasRealizadas = horasExtrasRealizadas;
    }

    public double getTipoIrpf() {
        return tipoIrpf;
    }

    public void setTipoIrpf(double tipoIrpf) {
        this.tipoIrpf = tipoIrpf;
    }

    public boolean isEstaCasado() {
        return estaCasado;
    }

    public void setEstaCasado(boolean estaCasado) {
        this.estaCasado = estaCasado;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    @Override
    public String toString() {
        String casado = "";
        if (this.isEstaCasado()) {
            casado = "si";
        } else {
            casado = "no";
        }
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", Nif=" + Nif + ", sueldoBase=" + sueldoBase + ", pagoHoraExtra=" + pagoHoraExtra + ", horasExtrasRealizadas=" + horasExtrasRealizadas + ", tipoIrpf=" + tipoIrpf + ", estaCasado=" + casado + ", numHijos=" + numHijos + '}';
    }

}
