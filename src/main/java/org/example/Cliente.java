package org.example;

public class Cliente {

    private String numero;
    private int telefone;


    public Cliente(String numero) {
        setNumero(numero);
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero != null) {
            this.numero = numero;
        }
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
