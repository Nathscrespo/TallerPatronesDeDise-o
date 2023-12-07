/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Decorator;

/**
 *
 * @author emilyvalarezo
 */

public class Main {
    
    public static void main(String[] args) {
        // Crear un producto concreto. Ejemplo, un celular.
        ProductoConcreto celular = new ProductoConcreto(1, "Smartphone", "Samsung", "Galaxy", 0.2, 500.0);

        // Decorar el celular con funcionalidades adicionales. Ejemplo, memoria.
        Celular celularDecorado = new Celular(celular);
        celularDecorado.agregarPrecio(50.0);  // Agregar precio adicional al celular decorado

        // Crear otro producto concreto. Ejemplo, un televisor.
        ProductoConcreto televisor = new ProductoConcreto(2, "Smart TV", "Sony", "Bravia", 5.0, 1000.0);

        // Decorar el televisor con funcionalidades adicionales. Ejemplo, Android TV.
        Televisor televisorDecorado = new Televisor(televisor);
        televisorDecorado.agregarPrecio(100.0);  // Agregar precio adicional al televisor decorado
    }
    
}
