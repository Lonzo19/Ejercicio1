/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Lonzo
 */
public class Animales {
    private final String nombre;
    private final int edad, tamaño;

    public Animales(String nombre, int edad, int tamaño) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getTamaño() {
        return tamaño;
    }
    
}
