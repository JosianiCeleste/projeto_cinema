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

    public boolean saoLugaresAdjacentes() {

        if (lugares.size() <= 1) {
            return true;
        }


        for (int i = 0; i < lugares.size() - 1; i++) {
            Lugar atual = lugares.get(i);
            Lugar proximo = lugares.get(i + 1);


            if (atual.getFila() != proximo.getFila()) {
                return false;
            }


            if (proximo.getNumero() != atual.getNumero() + 1) {
                return false;
            }
        }

        return true;
    }


    public boolean validarReserva() {

        if (cliente == null || sessao == null) {
            return false;
        }


        if (lugares.isEmpty()) {
            return false;
        }


        if (!saoLugaresAdjacentes()) {
            return false;
        }

        return true;
    }


}
