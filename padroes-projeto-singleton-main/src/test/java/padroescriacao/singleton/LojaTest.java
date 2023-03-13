package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaTest {

    @Test
    public void deveRetornarNomeLoja() {
        Loja.getInstance().setNomeLoja("Loja Visual");
        assertEquals("Loja Visual", Loja.getInstance().getNomeLoja());
    }

    @Test
    public void deveRetornarFuncionarioCaixa() {
        Loja.getInstance().setUsuarioLogado("Alex");
        assertEquals("Alex", Loja.getInstance().getUsuarioLogado());
    }

}