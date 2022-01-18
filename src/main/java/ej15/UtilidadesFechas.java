/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class UtilidadesFechas {

    private static Scanner teclado = new Scanner(System.in);

    public static int leerDia() {
        int diaLeido = 0;
        do {
            System.out.println("Introduce un dia del mes");
            diaLeido = teclado.nextInt();
        } while (diaLeido < 1 || diaLeido > 31);
        return diaLeido;

    }

    public static int leerMes() {
        int mesLeido = 0;
        do {
            System.out.println("Introduce un mes");
            mesLeido = teclado.nextInt();
        } while (mesLeido < 1 || mesLeido > 12);
        return mesLeido;

    }

    public static int leerAnyo() {
        int anyoLeido = 0;
        do {
            System.out.println("Introduce un año");
            anyoLeido = teclado.nextInt();
        } while (anyoLeido < 1900 || anyoLeido > 2100);
        return anyoLeido;

    }
}
