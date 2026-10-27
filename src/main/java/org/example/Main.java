package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Sessao> sessoes = new ArrayList<>();
    private static List<Reserva> reservas = new ArrayList<>();
    private static int proximoIdReserva = 1001;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados de exemplo
        Sala sala1 = new Sala(1);
        sala1.addLugar('A', 1);
        sala1.addLugar('A', 2);
        sala1.addLugar('A', 3);

        Sessao sessao1 = new Sessao("Homem Aranha", LocalDateTime.of(2026, 9, 10, 14, 30), sala1);
        sessoes.add(sessao1);

        int opcao = -1;

        // Menu Principal
        while (opcao != 0) {
            System.out.println("\n===== MENU CINEMA =====");
            System.out.println("1. Listar Sessões");
            System.out.println("2. Listar Reservas");
            System.out.println("3. Criar Reserva");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            // Menu com switch case
            switch (opcao) {
                case 1:
                    Sessao.listarSessoes(sessoes);
                    break;

                case 2:
                    Reserva.listarReservas(reservas);
                    break;

                case 3:
                    Reserva novaReserva = Reserva.criarReserva(scanner, sessoes, proximoIdReserva);
                    if (novaReserva != null) {
                        reservas.add(novaReserva);
                        proximoIdReserva++;
                    }
                    break;

                case 0:
                    System.out.println("A encerrar o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}