package br.insper.iam.usuario;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Usuario {

    @Id
    private String id;           // ← adicionado

    private String nome;
    private String email;
    private String papel;
    private String senha;

    public Usuario() { }

    public Usuario(String nome, String email, String papel) {
        this.nome = nome;
        this.email = email;
        this.papel = papel;
    }

    // getter/setter para 'id'
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    // demais getters/setters continuam iguais...
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPapel() { return papel; }
    public void setPapel(String papel) { this.papel = papel; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    @Override
    public boolean equals(Object obj) {
        return this.email.equals(((Usuario) obj).getEmail());
    }
}
