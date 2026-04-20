/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author m
 */
public class Esfera extends FormaTridimensional {

    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double obterArea() {
        return 4* Math.PI * raio *raio;
    }

    @Override
    public double obterVolume() {
        return (4.0 / 3.0)* Math.PI * raio * raio * raio;
    }

    @Override
    public String toString() {
        return "Esfera com raio " + raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
    
}
