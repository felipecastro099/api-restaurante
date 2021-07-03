package br.meli.apirestaurante.repositories;

import br.meli.apirestaurante.entities.Caixa;
import br.meli.apirestaurante.entities.Mesa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CaixaRepository {
    List<Mesa> mesas = new ArrayList<>();
    Caixa caixa = new Caixa(mesas, 0.0);

    public void addValor(Mesa mesa) {
        System.out.println(mesa);
        caixa.getMesas().add(mesa);
        caixa.setValorTotal(caixa.getValorTotal() + mesa.getValorTotal());
    }

    public Caixa list() {
        return caixa;
    }
}
