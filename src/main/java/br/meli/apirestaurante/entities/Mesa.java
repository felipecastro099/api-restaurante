package br.meli.apirestaurante.entities;

import java.util.List;

public class Mesa {
    private long id;
    private List<Pedido> pedidos;
    private Double valorTotal;

    public Mesa(long id, List<Pedido> pedidos, Double valorTotal) {
        this.id = id;
        this.pedidos = pedidos;
        this.valorTotal = valorTotal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "id=" + id +
                ", pedidos=" + pedidos +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
