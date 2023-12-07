/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Decorator;

/**
 *
 * @author emilyvalarezo
 */

public class Televisor extends ProductoDecorator {
    public Televisor(Producto producto) {
        super(producto);
    }

    public void agregarAndroidTV() {
        // Implementación específica para agregar Android TV a un televisor
        System.out.println("Android TV agregado al televisor.");
    }
}
