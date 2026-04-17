/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07;

/**
 *
 * @author m
 */
public class PagamentoPix implements Pagamento {//implementa interface
    
    private double valor;

    public PagamentoPix(double valor) { //construtor
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        return valor; // paga o valor total, sem desconto direto, depois que recebe o cashbak
    }

    @Override
    public String gerarRecibo() {
        return "Pagamento com PIX\n"
             + "Valor da compra: R$ " + valor + "\n"
             + "Valor pago: R$ " + calcularTotal() + "\n"
             + "Cashback recebido (2%): R$ " + (valor * 0.02);
    }

    @Override
    public void imprimirRecibo() {
        System.out.println(gerarRecibo()); // reusa o método
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

