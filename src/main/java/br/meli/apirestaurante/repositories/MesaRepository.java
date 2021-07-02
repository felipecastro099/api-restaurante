package br.meli.apirestaurante.repositories;

import br.meli.apirestaurante.entities.Mesa;
import br.meli.apirestaurante.entities.Pedido;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MesaRepository {
    List<Mesa> pedidos = new ArrayList<>();
    private Long id = 1L;

    public Mesa store(Mesa mesa) {
        mesa.setId(id);
        mesa.setValorTotal(setMesaTotalValue(mesa.getPedidos()));
        pedidos.add(mesa);
        id++;

        return mesa;
    }

    public Mesa findPerMesa(Long id) {
        Optional<Mesa> mesa = pedidos.stream().filter(pedido -> pedido.getId() == id).findFirst();

        return mesa.orElse(null);
    }

    public Double setMesaTotalValue(List<Pedido> pedidos) {
        Double count = 0.0;

        for (Pedido pedido: pedidos) {
            count += pedido.getValor();
        }

        return count;
    }
}
