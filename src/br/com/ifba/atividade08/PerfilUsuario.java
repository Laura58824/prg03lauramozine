/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author m
 */
public class PerfilUsuario {
    
  private Long id;
  private String descricao;
  private List<String> permissoes= new ArrayList<>();

  
   public void adicionarPermissao(String permissao){
    this.permissoes.add(permissao);
}
  
 
    @Override
    public String toString() {
        return "PerfilUsuario{" + "id = " + id + ", descricao = " + descricao + ", permissoes = " + permissoes + '}';
    }
    
   //CONSTRUTOR
    public PerfilUsuario(Long id, String descricao, List<String> permissoes) {
        this.id = id;
        this.descricao = descricao;
        if(permissoes != null){
            this.permissoes = permissoes;
        }
    }

  
  //GETTERS E SETTERS
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }
  
  
  
  
  
  
  
  
  
  
}
