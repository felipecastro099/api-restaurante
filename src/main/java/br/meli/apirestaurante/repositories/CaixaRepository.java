package br.meli.apirestaurante.repositories;

import br.meli.apirestaurante.entities.Caixa;
import br.meli.apirestaurante.entities.Mesa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CaixaRepository {
    Caixa caixa = new Caixa();
    List<Mesa> mesas = caixa.getMesas();

    public void addValor(Mesa mesa) {
        Double valor = 0.0;
        mesas.add(mesa);
        caixa.setMesas(mesas);

        for (Mesa m: caixa.getMesas()) {
            valor += m.getValorTotal();
        }

        caixa.setValorTotal(valor);
    }

    public Caixa list() {
        return caixa;
    }
}
