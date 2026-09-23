package fiscal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacaoTest {

    @Test
    void deveEmitirDocumentoProduto() {
        FabricaAbstrata fabrica = new FabricaProduto();
        Operacao operacao = new Operacao(fabrica);
        assertEquals("Nota Fiscal de Produto", operacao.emitirDocumento());
    }

    @Test
    void deveEmitirDocumentoServico() {
        FabricaAbstrata fabrica = new FabricaServico();
        Operacao operacao = new Operacao(fabrica);
        assertEquals("Nota Fiscal de Servico", operacao.emitirDocumento());
    }

    @Test
    void deveEmitirReciboProduto() {
        FabricaAbstrata fabrica = new FabricaProduto();
        Operacao operacao = new Operacao(fabrica);
        assertEquals("Recibo de Produto", operacao.emitirRecibo());
    }

    @Test
    void deveEmitirReciboServico() {
        FabricaAbstrata fabrica = new FabricaServico();
        Operacao operacao = new Operacao(fabrica);
        assertEquals("Recibo de Servico", operacao.emitirRecibo());
    }

}