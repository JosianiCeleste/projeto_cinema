package org.example;

import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private int id;
    private Sessao sessao;
    private Cliente cliente;
    private List<Lugar> lugares;

    public Reserva(int id, Sessao sessao, Cliente cliente) {
        this.id = id;
        setSessao(sessao);
        setCliente(cliente);
        this.lugares = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        if (sessao != null) {
            this.sessao = sessao;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
        }
    }

    public List<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }

    public void adicionarLugar(Lugar lugar) {
        if (lugar != null) {
            this.lugares.add(lugar);
        }
    }
}
