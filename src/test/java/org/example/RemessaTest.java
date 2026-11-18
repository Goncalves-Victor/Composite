package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemessaTest {
    @Test
    void deveRetornarCargaComLotesEPacotes() {
        Lote loteMinas = new Lote("Minas Gerais");
        loteMinas.addItem(new Pacote("Livros", 2.0));
        loteMinas.addItem(new Pacote("Roupas", 3.5));

        Lote loteSudeste = new Lote("Sudeste");
        loteSudeste.addItem(loteMinas);
        loteSudeste.addItem(new Pacote("Eletrônicos", 1.5));

        Lote carga = new Lote("Carga nacional");
        carga.addItem(new Lote("Sul"));
        carga.addItem(loteSudeste);

        Remessa remessa = new Remessa();
        remessa.setCarga(carga);

        assertEquals("Lote: Carga nacional\n"
                + "Lote: Sul\n"
                + "Lote: Sudeste\n"
                + "Lote: Minas Gerais\n"
                + "Pacote: Livros - peso: 2.0 kg\n"
                + "Pacote: Roupas - peso: 3.5 kg\n"
                + "Pacote: Eletrônicos - peso: 1.5 kg\n", remessa.getCarga());
    }

    @Test
    void deveAceitarPacoteComoCarga() {
        Remessa remessa = new Remessa();
        remessa.setCarga(new Pacote("Documentos", 0.5));

        assertEquals("Pacote: Documentos - peso: 0.5 kg\n", remessa.getCarga());
    }

    @Test
    void deveRetornarLoteVazio() {
        Remessa remessa = new Remessa();
        remessa.setCarga(new Lote("Aguardando pacotes"));

        assertEquals("Lote: Aguardando pacotes\n", remessa.getCarga());
    }

    @Test
    void deveLancarExcecaoQuandoRemessaNaoTemCarga() {
        Remessa remessa = new Remessa();

        NullPointerException erro = assertThrows(NullPointerException.class, remessa::getCarga);
        assertEquals("Remessa sem carga", erro.getMessage());
    }
}
