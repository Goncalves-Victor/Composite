package org.example;

// Cliente: usa o componente sem distinguir pacote de lote.
public class Remessa {
    private ItemCarga carga;

    public void setCarga(ItemCarga carga) {
        this.carga = carga;
    }

    public String getCarga() {
        if (carga == null) {
            throw new NullPointerException("Remessa sem carga");
        }
        return carga.getConteudo();
    }
}
