package org.example;

import java.util.*;



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

    public static void listarReservas(List<Reserva> reservas) {
        System.out.println("\n--- LISTA DE RESERVAS ---");
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva efetuada até ao momento.");
        } else {
            for (Reserva r : reservas) {
                System.out.println("Reserva Nº: " + r.getId());
                System.out.println("Cliente Nº: " + r.getCliente().getNumero());
                System.out.println("Filme: " + r.getSessao().getNomeFilme());
                System.out.println("Lugares: " + r.getLugares());
                System.out.println("---------------------------------");
            }
        }
    }


    public static Reserva criarReserva(Scanner scanner, List<Sessao> sessoes, int proximoId) {
        System.out.println("\n--- CRIAR NOVA RESERVA ---");

        if (sessoes.isEmpty()) {
            System.out.println("Não existem sessões disponíveis.");
            return null;
        }

        System.out.print("Número do Cliente (ex: 23A): ");
        String numCliente = scanner.nextLine();
        Cliente cliente = new Cliente(numCliente);


        Sessao sessao = sessoes.get(0);

        Reserva novaReserva = new Reserva(proximoId, sessao, cliente);

        System.out.print("Quantos lugares quer reservar? ");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= qtd; i++) {
            System.out.print("Fila do lugar " + i + " (ex: A): ");
            char fila = scanner.nextLine().toUpperCase().charAt(0);

            System.out.print("Número do lugar " + i + " (ex: 1): ");
            int numero = scanner.nextInt();
            scanner.nextLine();

            Lugar lugar = new Lugar(fila, numero);
            novaReserva.adicionarLugar(lugar);
        }

        if (novaReserva.validarReserva()) {
            System.out.println("\nReserva criada e validada com sucesso!");
            return novaReserva;
        } else {
            System.out.println("\nReserva RECUSADA! Os lugares não são adjacentes (seguidos) ou os dados são inválidos.");
            return null;
        }
    }





}
