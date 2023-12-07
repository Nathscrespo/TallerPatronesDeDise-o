/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Decorator;

/**
 *
 * @author emilyvalarezo
 */

public class ProductoConcreto implements Producto {
    private int id;
    private String nombre;
    private String marca;
    private String modelo;
    private double peso;
    private double precio;

    public ProductoConcreto(int id, String nombre, String marca, String modelo, double peso, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.precio = precio;
    }

    public void agregarPrecio(double precio) {
        // Implementación para agregar precio al producto
        this.precio += precio;
    }

    public void agregarResolucion() {
        // Implementación para agregar resolución al producto
        System.out.println("Resolución agregada al producto.");
    }
}
