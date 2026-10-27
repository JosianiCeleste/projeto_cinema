package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        Sala sala = new Sala(1);
        sala.addLugar('A',1);
        sala.addLugar('A',2);

        Cliente cliente1 = new Cliente("23A");
        Sessao sessao = new Sessao("Homem Aranha e a Perda dos Poderes", LocalDateTime.of(2026,9,10,1,30),sala);

        Reserva reserva = new Reserva(1001,sessao, cliente1);

        reserva.adicionarLugar(sala.getLugars().get(0));

        System.out.println("Reserva Nº: " + reserva.getId());
        System.out.println("Cliente Nº: " + reserva.getCliente().getNumero());
        System.out.println("Filme: " + reserva.getSessao().getNomeFilme());
        System.out.println("Horário: " + reserva.getSessao().getDatahora());
        System.out.println("Sala: " + reserva.getSessao().getSala().getNumero());
        System.out.println("Lugar Reservado: Fila " + reserva.getLugares().get(0).getFila() + " - Assento " + reserva.getLugares().get(0).getNumero());


    }
}