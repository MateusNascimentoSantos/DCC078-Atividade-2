package fiscal;

public class FabricaProduto implements FabricaAbstrata {

    @Override
    public Documento createDocumento() {
        return new DocumentoProduto();
    }

    @Override
    public Recibo createRecibo() {
        return new ReciboProduto();
    }
}