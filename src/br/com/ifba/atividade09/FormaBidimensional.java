/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author m
 */
public abstract  class FormaBidimensional extends Forma {
    
    public abstract double obterArea();
 
    @Override
    public void exibirInfo() {
        System.out.println("Tipo: FormaBidimensional");
        System.out.printf("Area: %.2f%n", obterArea());
    }
}
