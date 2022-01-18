/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15;

import java.time.LocalDate;

/**
 *
 * @author MSI
 */
public class TestFecha {

    public static void main(String[] args) {
        int dia, mes, anyo;
        System.out.println("------------Introduce los datos de imad---------------");
        dia = UtilidadesFechas.leerDia();
        mes = UtilidadesFechas.leerMes();
        anyo = UtilidadesFechas.leerAnyo();
        Fecha imad = new Fecha(dia, mes, anyo);
        System.out.println("dia de la semana es " + imad.diaSemana());

        System.out.println("la fecha anterior al nacimiento de imad era: ");
        imad.anterior();

         imad.diaSemana();
        System.out.println("------------Introduce los datos de pepe---------------");
        Fecha pepe = new Fecha(UtilidadesFechas.leerDia(), UtilidadesFechas.leerMes(), UtilidadesFechas.leerAnyo());
        if (pepe.bisiesto()) {
            System.out.println("El año de nacimiento de pepe es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
        System.out.println("------------Introduce los datos de juan---------------");
        Fecha juan = new Fecha(UtilidadesFechas.leerDia(), UtilidadesFechas.leerMes(), UtilidadesFechas.leerAnyo());
        juan.mostrarFechaLarga();
        LocalDate imadCopia = imad.copia();
        LocalDate pepeCopia = pepe.copia();
        
        System.out.println("Entre la fecha de imad y pepe han pasado: "+Fecha.diasEntreFechas(imadCopia, pepeCopia)+ " dias");
    }
}
