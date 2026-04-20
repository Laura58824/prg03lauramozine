/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author m
 */
public class Usuario {
   private Long id;
   private PerfilUsuario perfil;
   private String nomeUsuario;
   private String email;
   private String senha;
   private LocalDateTime ultimoLogin;
   private boolean ativo;
    // Lista que vai armazenar várias sessões do usuário
   private final List<Sessao> sessoes = new ArrayList<>();
    // Lista que vai armazenar vários logs de auditoria do usuário
   private final List<LogAuditoria> logs = new ArrayList<>();

  

    public Sessao criarSessao() {
        String token = "SESS_" + id + "_" + System.currentTimeMillis(); //criação do token com a palavra SESS_ + o id do ususario e o tempo em millisegundos

        Sessao sessao = new Sessao((long)(sessoes.size() + 1), this, token); 
    // (long)(sessoes.size() + 1) significaa que está pedindo a quantidade de sessoes existentes e soma 1 para o proximo id; ele retrona int e o (long) converte para long 
    // o this representa o próprio objeto; Token foi criado anteriormente     

       sessoes.add(sessao); //adiciona a sessão na lista de sessõees
        return sessao;
    }
    
    public boolean logar(String senha){
        
        if(!this.ativo){ //verifica se o usuario está inativo
            System.out.println("Usuario inativo.");
            return false;
        }
        
        if(this.senha.equals(senha)){//compara a senha salva no objeto com a senha digitada
            this.ultimoLogin = LocalDateTime.now();
       
        LogAuditoria log =new LogAuditoria((long)(logs.size()+ 1), this, "login", this.ultimoLogin, "127.0.0.1");
        //id do log; usuário que logou; ação realizada; data/hora; ip da máquina
        
        logs.add(log); //adiciona à lista
            System.out.println("Senha correta");
        return true;
        }else{ //se a senha estiver incorreta
            LogAuditoria log =new LogAuditoria((long)(logs.size()+ 1), this, "tentativa de login", LocalDateTime.now(), "127.0.0.1");
            //deixa salvo como tentativa de login
            logs.add(log);//adiciona na lista
            System.out.println("Senha incorreta");
            return false;
        }
       
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "id = " + id + ", perfil = " + perfil + ", nomeUsuario = " + nomeUsuario + ", email = " + email + ", ultimoLogin = " + ultimoLogin + ", ativo = " + ativo + '}';
    }
   
   //CONSTRUTOR
    public Usuario(Long id, PerfilUsuario perfil, String nomeUsuario, String email, String senha, boolean ativo) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
    }

    
   //GETTERS E SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public List<LogAuditoria> getLogs() {
        return logs;
    }

   
}
