package org.example;

import java.util.ArrayList;
import java.util.List;

// Composite: agrupa pacotes ou outros lotes pelo mesmo contrato.
public class Lote extends ItemCarga {
    private final List<ItemCarga> itens = new ArrayList<>();

    public Lote(String descricao) {
        super(descricao);
    }

    public void addItem(ItemCarga item) {
        itens.add(item);
    }

    @Override
    public String getConteudo() {
        StringBuilder saida = new StringBuilder("Lote: " + getDescricao() + "\n");
        for (ItemCarga item : itens) {
            saida.append(item.getConteudo());
        }
        return saida.toString();
    }
}
