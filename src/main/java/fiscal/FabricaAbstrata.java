package fiscal;

public interface FabricaAbstrata {
    Documento createDocumento();
    Recibo createRecibo();
}