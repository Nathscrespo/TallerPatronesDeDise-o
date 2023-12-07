/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Decorator;

/**
 *
 * @author emilyvalarezo
 */

public class Celular extends ProductoDecorator {
    public Celular(Producto producto) {
        super(producto);
    }

    public void agregarMemoria() {
        // Implementación específica para agregar memoria a un celular
        System.out.println("Memoria agregada al celular.");
    } 
}
