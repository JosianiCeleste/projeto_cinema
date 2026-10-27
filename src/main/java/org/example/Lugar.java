package org.example;

public class Lugar {
    private char fila;
    private int numero;

    public Lugar(char fila, int numero) {
        this.fila = fila;
        this.numero = numero;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Fila " + fila + ", Número " + numero;
    }
}
