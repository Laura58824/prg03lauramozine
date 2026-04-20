/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author m
 */
public class Piramide extends FormaTridimensional {

   private double ladoBase, altura, apotema; //pirâmide de base quadrada

    public Piramide(double base, double altura, double apotema) {
        this.ladoBase = base;
        this.altura = altura;
        this.apotema = apotema;
    }

    @Override
    public double obterArea() {
        double areaBase = ladoBase *ladoBase;
        double areaLateral = 4* (ladoBase * apotema)/2;
        return areaBase + areaLateral;
    }

    @Override
    public double obterVolume() {
        return (ladoBase * ladoBase * altura)/3;
    }

    @Override
    public String toString() {
       return "Piramide de base quadrada com lado da base " + ladoBase + ", altura "+ altura + " e apotema " + apotema;
    }

    public double getLadoBase() {
        return ladoBase;
    }

    public void setLadoBase(double ladoBase) {
        this.ladoBase = ladoBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
   
 
}
