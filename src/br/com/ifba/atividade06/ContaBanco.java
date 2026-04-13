/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06;

/**
 *
 * @author m
 */
public class ContaBanco {
  
    public int numConta; // está public como pedido na atividade
    protected String tipo; // cc ou cp
    private String dono;
    private double saldo;
    private boolean status;// aberta ou fechada
    

    // CONSTRUTOR
    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }

    // GETTERS E SETTERS
    
    public int getNumConta() {
    return numConta;
}

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // ABRIR CONTA
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);

        if (t.equals("cc")) {// "equals" compara string, logo, se t for igual a cc a pessoa recebe 50 reais
            this.setSaldo(50);
        } else if (t.equals("cp")) {
            this.setSaldo(150);// caso contrário, recebe 150
        }

        System.out.println("Conta aberta com sucesso!"); //imprime na tela
    }

    // FECHAR CONTA
    public void fecharConta() { // A conta só pode ser fechada se SALDO == 0
        if (this.getSaldo() == 0) {
            this.setStatus(false);// conta fechada 
            System.out.println("Conta fechada!");
        } else {
            System.out.println("Nao pode fechar conta com saldo!");
        }
    }

    // DEPOSITAR
    public void depositar(double valor) {
        if (this.getStatus()) {// se for verdadeiro, ou seja, se estiver aberta
            this.setSaldo(this.getSaldo() + valor);//pega(get) o saldo atual, soma com o valor depositado e atualiza(set) o saldo
            System.out.println("Deposito realizado!");
        } else {
            System.out.println("Conta fechada!");
        }
    }

    // SACAR
    public void sacar(double valor) {
        if (this.getStatus()) {// se a conta estiver aberta
            if (this.getSaldo() >= valor) { // se  o saldo for maior ou igual  ao valor
                this.setSaldo(this.getSaldo() - valor);// modifica o saldo subtraindo o valor desejado
                System.out.println("Saque realizado!");
            } else {// se o saldo for menor que o valor desejado
                System.out.println("Saldo insuficiente!");
            }
        } else {// se a conta estiver fechada
            System.out.println("Conta fechada!");
        }
    }
    
    // MENSALIDADE
    public void pagarMensal() {
// Neste contexto, o saldo negativo é permitido.
// Caso não haja saldo suficiente, a mensalidade será descontada mesmo assim, deixando a conta com saldo negativo.
        if (this.getStatus()) { // se a conta estiver aberta
           if ("cc".equals(this.getTipo())) { // se a string guardada em tipo for igual a cc
                this.setSaldo(this.getSaldo() - 12);//atualiza o saldo diminuindo 12 reais
            } else if("cp".equals(this.getTipo())) {// se cp for igual a string guardada em tipo
                this.setSaldo(this.getSaldo() - 20);//atualiza o saldo diminuindo 20 reais
            }
            System.out.println("Mensalidade paga!");
        }else{
            System.out.println("Conta fechada! Mensalidade nao cobrada.");
        }
    }
}
