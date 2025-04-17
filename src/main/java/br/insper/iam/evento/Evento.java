package br.insper.iam.evento;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class Evento {

    @Id
    private String id;        // ← adicionado

    private String email;
    private String acao;
    private LocalDateTime dataEvento;

    // getter/setter para 'id'
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    // demais getters/setters
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAcao() {
        return acao;
    }
    public void setAcao(String acao) {
        this.acao = acao;
    }
    public LocalDateTime getDataEvento() {
        return dataEvento;
    }
    public void setDataEvento(LocalDateTime dataEvento) {
        this.dataEvento = dataEvento;
    }
}
