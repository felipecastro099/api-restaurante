package br.meli.apirestaurante.entities;

import java.util.List;

public class Caixa {
    private List<Mesa> mesas;
    private Double valorTotal;

    public Caixa() {}

    public Caixa(List<Mesa> mesas, Double valorTotal) {
        this.mesas = mesas;
        this.valorTotal = valorTotal;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
