/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade07;

/**
 *
 * @author m
 */
public interface Pagamento {
    
   public double calcularTotal();
   public void imprimirRecibo();
   String gerarRecibo(); //foi necessário adicionar para aparecer na tela e não no console
}
