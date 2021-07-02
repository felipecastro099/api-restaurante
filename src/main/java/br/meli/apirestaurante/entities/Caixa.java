package br.meli.apirestaurante.entities;

public class Caixa {
    private Double valor;

    public Caixa(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
