package org.example;

// Folha: representa um item simples, sem filhos.
public class Pacote extends ItemCarga {
    private double pesoKg;

    public Pacote(String descricao, double pesoKg) {
        super(descricao);
        this.pesoKg = pesoKg;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    @Override
    public String getConteudo() {
        return "Pacote: " + getDescricao() + " - peso: " + pesoKg + " kg\n";
    }
}
