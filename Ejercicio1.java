/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lonzo
 */
public class Ejercicio1 {

//APLICANDO SOLO HERENCIA
    public static void main(String[] args) {
        String nombreA;
        int edadA, tamañoA, op;

        ArrayList<Animales> animales = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Animales pajaro, gato, perro;

        do {
            System.out.println(" ****** Menu****** ");
            System.out.println("1.- Pájaro");
            System.out.println("2.- Gato");
            System.out.println("3.- Perro");
            System.out.println("0.- Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del Pájaro");
                    nombreA = sc.next();
                    System.out.println("Ingrese la edad del Pájaro en años");
                    edadA = sc.nextInt();
                    System.out.println("Ingrese el tamaño del Pájaro en centímetros");
                    tamañoA = sc.nextInt();
                    pajaro = new Pajaro(nombreA, edadA, tamañoA);
                    animales.add(pajaro);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del Gato");
                    nombreA = sc.next();
                    System.out.println("Ingrese la edad del Gato en años");
                    edadA = sc.nextInt();
                    System.out.println("Ingrese el tamaño del Gato en centímetros");
                    tamañoA = sc.nextInt();
                    gato = new Gato(nombreA, edadA, tamañoA);
                    animales.add(gato);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del Perro");
                    nombreA = sc.next();
                    System.out.println("Ingrese la edad del Perro en años");
                    edadA = sc.nextInt();
                    System.out.println("Ingrese el tamaño del Perro en centímetros");
                    tamañoA = sc.nextInt();
                    perro = new Perro(nombreA, edadA, tamañoA);
                    animales.add(perro);
                    break;
                case 4:
                    break;
            }
        } while (op != 0);

        for (int i = 0; i < animales.size(); i++) {
            System.out.println(" ");
            System.out.println("en el indice elementos[" + i + "] ");
            System.out.println("con nombre " + animales.get(i).getNombre());
            System.out.println("con edad " + animales.get(i).getEdad());
            System.out.println("con tamaño " + animales.get(i).getTamaño());

        }
    }

}
