/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author imad
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anyo;
    //LocalDate fechaPredeterminada;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anyo = 2022;

        //fechaPredeterminada = LocalDate.of(2022, 1, 1);
    }

    public Fecha(int dia, int mes, int anyo) {

        if (comprobarFecha(dia, mes, anyo)) {
            this.dia = dia;
            this.mes = mes;
            this.anyo = anyo;

        } else {
           throw new IllegalArgumentException();
        }

    }
//si devuelve true es que el formato de la fecha es correcto

    private boolean comprobarFecha(int dia, int mes, int anyo) {

        boolean fechaComprobada = true;
        try {
            LocalDate.of(anyo, mes, dia);
        } catch (DateTimeException DTE) {
            fechaComprobada = false;
        }
        return fechaComprobada;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
       if(comprobarFecha(dia, mes, anyo)){
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(comprobarFecha(dia, mes, anyo)){
            this.mes = mes;
        }
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
      if(comprobarFecha(dia, mes, anyo)){
            this.anyo = anyo;
        }
    }
    //indicará si el año almacenado es bisiesto o no

    public boolean bisiesto() {
        LocalDate hoy = LocalDate.of(anyo, mes, dia);

        return hoy.isLeapYear();
    }

    public int diaMes() {
        LocalDate hoy = LocalDate.of(anyo, mes, dia);
        return hoy.lengthOfMonth();
    }

    public void mostrarFechaCorta() {
        LocalDate hoy = LocalDate.of(anyo, mes, dia);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaString = hoy.format(formato);

        System.out.println("Fecha corta " + fechaString);
    }

    public void mostrarFechaLarga() {
        LocalDate hoy = LocalDate.of(anyo, mes, dia);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
        String fechaString = hoy.format(formato);

        System.out.println("Fecha corta " + fechaString);
    }

    public DayOfWeek diaSemana() {
        LocalDate hoy = LocalDate.of(anyo, mes, dia);
        return hoy.getDayOfWeek();
    }

    public static int diasEntreFechas(LocalDate inicial, LocalDate fechaFinal) {
        Period tiempoEntreFechas = Period.between(inicial, fechaFinal);

        return tiempoEntreFechas.getDays();
    }

    public void siguiente() {
        LocalDate hoy = LocalDate.of(anyo, mes, dia);
        hoy.plusDays(1);
    }

    public void anterior(Fecha object) {
        LocalDate hoy = LocalDate.of(object.dia, object.mes, object.anyo);
        hoy.minusDays(1);
    }

    public LocalDate copia() {
        LocalDate hoy = LocalDate.of(anyo, mes, dia);
        return hoy;
    }

    public boolean igualQue(LocalDate fecha) {
        LocalDate hoy = LocalDate.of(anyo, mes, dia);
        return hoy.isEqual(fecha);
    }

    public boolean menorQue(LocalDate fecha) {
        LocalDate hoy = LocalDate.of(anyo, mes, dia);

        return hoy.isBefore(fecha);

    }

    public boolean mayorQue(LocalDate fecha) {
        LocalDate hoy = LocalDate.of(anyo, mes, dia);

        return hoy.isAfter(fecha);

    }

    @Override
    public String toString() {
        return "Fecha{" +  dia + "/" + mes + "/" + anyo + '}';
    }
    
    
}
