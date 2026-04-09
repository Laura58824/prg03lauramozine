/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade05;

/**
 *
 * @author m
 */

// Classe que calcula o fatorial de um número
public class Fatorial {
        
    private long valor; // Variável privada que armazena o valor informado pelo usuário/ atributo do objeto

    public void setValor(int n) {  // Método para modificar o valor
        this.valor = n;     // atribui ao atributo "valor" do objeto o valor recebido no parâmetro n
    }

    public int getFatorial() {  // Método que calcula o fatorial
        int resultado = 1; // começa com 1
        for (long i = valor; i >= 1; i--) { //laço que vai de "valor" até 1
            resultado *= i; // mesma coisa que: resultado= resultado*i
        }
        return resultado; // retorna o valor final 
    }

    public String getFormula() {  // Método que monta a fórmula em formato de String
        String formula = ""; // começa vazia
        for (long i = valor; i >= 1; i--) { // Laço que monta a sequência do cálculo
            if (i == 1) {  // Se for o último número, não adiciona "x"
                formula += i;
            } else { 
                formula += i + " x "; // Caso contrário, adiciona o número + "x"
            }
        }
        return formula; // retorna a string com a fórmula completa
    }
}
