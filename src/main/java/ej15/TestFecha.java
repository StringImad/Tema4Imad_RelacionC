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
        dia = UtilidadesFechas.leerDia();
        mes = UtilidadesFechas.leerMes();
        anyo = UtilidadesFechas.leerAnyo();

        Fecha imad = new Fecha(dia, mes, anyo);

//        Fecha pepe = new Fecha(UtilidadesFechas.leerDia(), UtilidadesFechas.leerMes(), UtilidadesFechas.leerAnyo());
//
//        Fecha juan = new Fecha(UtilidadesFechas.leerDia(), UtilidadesFechas.leerMes(), UtilidadesFechas.leerAnyo());

        imad.anterior(imad);
        System.out.println(imad);
        
    }
}
