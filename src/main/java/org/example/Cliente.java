package org.example;

public class Cliente {

    private String numero;


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

}
