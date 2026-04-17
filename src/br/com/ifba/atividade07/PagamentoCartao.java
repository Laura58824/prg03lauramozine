/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07;

/**
 *
 * @author m
 */
public class PagamentoCartao implements Pagamento {
     private double valor;
   
    @Override
    public double calcularTotal() {  
        return valor* 1.05; //cáculo para adicionar taxa de 5%
    }

       
   @Override
   public String gerarRecibo() {
       return "Pagamento com CARTÃO\n"
            + String.format("Valor da compra:    R$ %.2f\n", valor)
            + String.format("Taxa (5%%):          R$ %.2f\n", valor * 0.05)
            + String.format("Valor final:        R$ %.2f", calcularTotal());
   }

   @Override
   public void imprimirRecibo() {
       System.out.println(gerarRecibo()); // só reusa o método
   }


    public PagamentoCartao(double valor) { //construtor
        this.valor= valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
