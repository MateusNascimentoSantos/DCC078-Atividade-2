package fiscal;

public class FabricaServico implements FabricaAbstrata {

    @Override
    public Documento createDocumento() {
        return new DocumentoServico();
    }

    @Override
    public Recibo createRecibo() {
        return new ReciboServico();
    }
}