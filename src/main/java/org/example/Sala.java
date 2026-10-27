package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int numero;
    private List<Lugar> lugares;

    public Sala(int numero) {
        this.numero = numero;
        this.lugares = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Lugar> getLugars() {
        return lugares;
    }

    public void setLugars(List<Lugar> lugars) {
        this.lugares = lugars;
    }

    public void addLugar(char fila, int numero){
        this.lugares.add(new Lugar(fila, numero));
    }

    public void exibirLugares(){
        for (Lugar l: this.lugares){
            System.out.println(l);
        }
    }


    @Override
    public String toString() {
        return "Sala{" +
                "numero=" + numero +
                ", lugares=" + lugares +
                '}';
    }
}
