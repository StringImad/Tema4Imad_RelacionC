/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author imad
 */
public class Rueda {
    private double diametro;
    private boolean estado;

    public Rueda(double diametro, boolean estado) {
        this.diametro = diametro;
        this.estado = estado;
    }

    public double getDiametro() {
        return diametro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public void inflar() {
        this.estado = true;
    }
    
     public void desinflar() {
        this.estado = false;
    }

    @Override
    public String toString() {
        return "rueda{" + "diametro=" + diametro + ", estado=" + estado + '}';
    }
     
     
}
