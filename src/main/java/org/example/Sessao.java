package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Sessao {
    private String nomeFilme;
    private LocalDateTime datahora;
    private Sala sala;

    public Sessao(String nomeFilme, LocalDateTime datahora, Sala sala) {
       setNomeFilme(nomeFilme);
        setDatahora(datahora);
        setSala(sala);
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        if (nomeFilme != null) {
            this.nomeFilme = nomeFilme;
        }
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }

    public void setDatahora(LocalDateTime datahora) {
        if (datahora != null) {
            this.datahora = datahora;
        }
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        if (sala != null) {
            this.sala = sala;
        }
    }
}
