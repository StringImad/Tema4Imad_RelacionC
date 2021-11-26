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
//Cálculo del complemento correspondiente a las horas extra realizadas. El valor es devuelto por el método.

    public double calculoComplementoHorasExtrasRealizadas() {
        double resultadoCalculo = 0.0;
        resultadoCalculo = this.horasExtrasRealizadas * this.pagoHoraExtra;
        return resultadoCalculo;
    }
//Cálculo del sueldo bruto. El valor es devuelto por el método. El sueldo bruto es el resultado del sueldo base más el complemento por las horas extra trabajadas en el mes.

    public double calculoSueldoBruto() {
        double resultadoCalculo = 0.0;
        resultadoCalculo = this.sueldoBase + calculoComplementoHorasExtrasRealizadas();
        return resultadoCalculo;
    }

    public double calculoRetencionIrpf() {
        double resultadoCalculo = 0;
        double calculoIrpf;
        calculoIrpf = this.tipoIrpf - this.numHijos;
        if (this.estaCasado) {
            calculoIrpf = calculoIrpf - 2;
        }
        resultadoCalculo = (calculoSueldoBruto() * calculoIrpf) / 100;

        return resultadoCalculo;
    }

    public double calculoSueldoNeto() {
        double resultadoCalculo = 0;

        resultadoCalculo = calculoSueldoBruto() - calculoRetencionIrpf();
        return resultadoCalculo;
    }

    public void escribirBasicInfo() {
        System.out.println("Nombre: " + this.nombre + ""
                + "\nApellido: " + this.apellidos
                + "\nNif: " + this.Nif
                + "\nCasado: " + estaCasadoSiNo()
                + "\nnumero hijos: " + this.numHijos);
    }

    public void escribirAllInfo() {
        System.out.println(
                "Nombre: " + this.nombre
                + "\nApellido: " + this.apellidos
                + "\nNif: " + this.Nif
                + "\nestado: " + estaCasadoSiNo()
                + "\nnumero hijos: " + this.numHijos
                + "\nsueldo base: " + this.sueldoBase
                + "\ncomplemento extra: " + calculoComplementoHorasExtrasRealizadas()
                + "\nsueldo Bruto: " + calculoSueldoBruto()
                + "\nretencion IRPF: " + calculoRetencionIrpf()
                + "\nsueldo neto: " + calculoSueldoNeto()
        );
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

    public String estaCasadoSiNo() {
        String casado = "";
        if (this.estaCasado) {
            casado = "casado";
        } else {
            casado = "soltero ";
        }
        return casado;
    }

    @Override
    public String toString() {

        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", Nif=" + Nif + ", sueldoBase=" + sueldoBase + ", pagoHoraExtra=" + pagoHoraExtra + ", horasExtrasRealizadas=" + horasExtrasRealizadas + ", tipoIrpf=" + tipoIrpf + ", estado=" + estaCasadoSiNo() + ", numHijos=" + numHijos + '}';
    }

}
