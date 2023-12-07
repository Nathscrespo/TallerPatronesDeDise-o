/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Decorator;

/**
 *
 * @author emilyvalarezo
 */

public class ProductoDecorator implements Producto {
    private Producto wrappee;

    public ProductoDecorator(Producto producto) {
        this.wrappee = producto;
    }

    public void agregarPrecio(double precio) {
        wrappee.agregarPrecio(precio);
    }

    public void agregarResolucion() {
        wrappee.agregarResolucion();
    }
}
