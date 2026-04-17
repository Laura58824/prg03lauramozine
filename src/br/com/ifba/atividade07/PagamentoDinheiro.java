/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07;

/**
 *
 * @author m
 */
public class PagamentoDinheiro implements Pagamento{
    
   private double valor;
   
    @Override
    public double calcularTotal() {  
        return valor* 0.9; // retorna o valor descontado 10%
    }

    
        
    @Override
    public String gerarRecibo() { // Monta o texto do recibo linha por linha e retorna como uma String só
        return "Pagamento em DINHEIRO\n"
             + String.format("Valor da compra:    R$ %.2f\n", valor)
             + String.format("Desconto (10%%):     R$ %.2f\n", valor * 0.10)
             + String.format("Valor final:        R$ %.2f", calcularTotal());
    }

    @Override
    public void imprimirRecibo() {
        System.out.println(gerarRecibo()); //só reusa o método
    }

    public PagamentoDinheiro(double valor) { //construtor
        this.valor= valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    
}
