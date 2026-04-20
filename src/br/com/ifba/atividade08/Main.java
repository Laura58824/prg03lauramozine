/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author m
 */
public class Main {
    
    public static void main(String[] args) {

        // 1. CRIANDO PERFIS
        System.out.println("--- PERFIS ---");
        PerfilUsuario perfilAdmin = new PerfilUsuario(1L, "Administrador", null);
        perfilAdmin.adicionarPermissao("CREATE");
        perfilAdmin.adicionarPermissao("READ");
        perfilAdmin.adicionarPermissao("UPDATE");
        perfilAdmin.adicionarPermissao("DELETE");

        PerfilUsuario perfilBasico = new PerfilUsuario(2L, "Basico", null);
        perfilBasico.adicionarPermissao("READ");

        System.out.println(perfilAdmin);
        System.out.println(perfilBasico);

        // 2. CRIANDO USUÁRIOS
        System.out.println("\n--- USUARIOS ---");
        Usuario admin = new Usuario(1L, perfilAdmin, "admin", "admin@mail.com", "admin123", true);
        Usuario joao  = new Usuario(2L, perfilBasico, "joao", "joao@mail.com", "joao456", true);
        Usuario inativo = new Usuario(3L, perfilBasico, "inativo", "inativo@mail.com", "senha", false);

        System.out.println(admin);
        System.out.println(joao);
        System.out.println(inativo);

        // 3. TESTANDO LOGIN
        System.out.println("\n--- LOGIN ---");
        admin.logar("admin123");   // sucesso
        joao.logar("errada");      // senha errada
        joao.logar("joao456");     // sucesso
        inativo.logar("senha");     // usuário inativo

        // 4. CRIANDO SESSÕES
        System.out.println("\n--- SESSOES ---");
        Sessao s1 = admin.criarSessao();
        Sessao s2 = joao.criarSessao();
        System.out.println(s1);
        System.out.println(s2);

        // 5. EXIBINDO LOGS
        System.out.println("\n--- LOGS DE AUDITORIA ---");
        for (LogAuditoria log : admin.getLogs()) {
            System.out.println(log);
        }
        for (LogAuditoria log : joao.getLogs()) {
            System.out.println(log);
        }
    }

}
