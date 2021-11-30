/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

/**
 *
 * @author imad
 */
public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;
//Constructor predeterminado, sin parámetros: establece la capacidad máxima en 1000 (c.c.) y la cantidad actual en cero (cafetera vacía).

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

//Constructor, que recibe sólo la capacidad máxima de la cafetera; inicializa la cantidad actual de café igual a la capacidad máxima (cafetera llen
    public Cafetera(int capacidadMaxima) {
        this.cantidadActual = capacidadMaxima;
    }
//Constructor, que recibe la capacidad máxima y la cantidad actual. Si la cantidad actual que se pasa es mayor que la capacidad máxima de la cafetera, 
//se ajustará la cantidad actual a la capacidad máxima.

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.cantidadActual = cantidadActual;

        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        }
        this.capacidadMaxima = capacidadMaxima;
    }
//llenarCafetera(): hace que la cantidad actual sea igual a la capacidad.

    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }
//servirTaza(double cantidadAServir): simula la acción de servir una taza con la capacidad indicada
//Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que que    

    public double servirTaza(double cantidadAServir) {
        double cantidadServida = 0.0;
        if (cantidadAServir > this.cantidadActual) {
            cantidadServida = this.cantidadActual;
        }
        this.cantidadActual -= cantidadServida;
        return cantidadServida;
    }
//vaciarCafetera(): pone la cantidad de café actual en cero.

    public void vaciarCafetera() {
        this.cantidadActual = 0;

    }
//agregarCafe(double cantidadAgregar): añade a la cafetera la cantidad de café indicada, 
//teniendo en cuenta que la cafetera no puede rebosar.

    public void agregarCafe(double cantidadAgregar) {
        if ((cantidadAgregar + this.cantidadActual) > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        }
        this.cantidadActual += cantidadAgregar;

    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

}
