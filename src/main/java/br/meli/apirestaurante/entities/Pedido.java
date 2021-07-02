package br.meli.apirestaurante.entities;

import java.util.List;

public class Pedido {
    private long id;
    private List<Prato> pratos;
    private Double valor;

    public Pedido(long id, List<Prato> pratos, Double valor) {
        this.id = id;
        this.pratos = pratos;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", pratos=" + pratos +
                ", valor=" + valor +
                '}';
    }
}
