package fiscal;

public class Operacao {

    private Documento documento;
    private Recibo recibo;

    public Operacao (FabricaAbstrata fabrica) {
        this.documento = fabrica.createDocumento();
        this.recibo = fabrica.createRecibo();
    }

    public String emitirDocumento() {
        return this.documento.emitir();
    }

    public String emitirRecibo() {
        return this.recibo.emitir();
    }
}