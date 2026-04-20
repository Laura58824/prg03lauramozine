/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author m
 */
public class Main {
    public static void main(String[] args) {
        
        // Array com todas as formas
        Forma[] formas = {
            new Circulo(6),
            new Quadrado(5),
            new Triangulo(4, 8),
            new Esfera(8),
            new Cubo(4),
            new Piramide(5, 10, 6)
        };
        
        System.out.println("\tFORMAS GEOMETRICAS");
        System.out.println("\nObs.: area medida em metros quadrados e volume em metros cubicos\n");
        System.out.println("-------------------");
        // Loop percorrendo todas as formas
        for (Forma forma : formas) {
            
            // toString() — descrição da forma
            System.out.println("Forma: " + forma.toString());
            forma.exibirInfo();
            System.out.println("-------------------");
        }
    }
    
}
