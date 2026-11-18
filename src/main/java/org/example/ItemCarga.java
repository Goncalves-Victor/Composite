package org.example;

// Componente: contrato comum para pacotes e lotes.
public abstract class ItemCarga {
    private String descricao;

    public ItemCarga(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getConteudo();
}
