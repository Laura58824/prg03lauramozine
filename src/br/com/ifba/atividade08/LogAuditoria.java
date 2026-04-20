/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

import java.time.LocalDateTime;

/**
 *
 * @author m
 */
public class LogAuditoria {
    
    private Long id;
    private Usuario usuario;
    private String acao; //tentativa de login, alteração de senha
    private LocalDateTime dataHora;
    private String ip;

    @Override
    public String toString() {
       return "LogAuditoria{" +
           "id = " + id + ", usuario = " + (usuario != null ? usuario.getNomeUsuario() : "null") +
           ", acao = " + acao +
           ", dataHora = " + dataHora +
           ", ip = " + ip +
           '}';
    }

    
    //CONSTRUTOR
    public LogAuditoria(Long id, Usuario usuario, String acao, LocalDateTime dataHora, String ip) {
        this.id = id;
        this.usuario = usuario;
        this.acao = acao;
        this.dataHora = dataHora;
        this.ip = ip;
    }
  
    
    //GETTERS E SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}