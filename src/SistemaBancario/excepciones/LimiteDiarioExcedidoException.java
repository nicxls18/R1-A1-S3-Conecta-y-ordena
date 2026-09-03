package excepciones;

public class LimiteDiarioExcedidoException
        extends ExcepcionTransaccion {

    public LimiteDiarioExcedidoException() {
        super(
            "Limite diario excedido",
            "LIM001",
            "MEDIA"
        );
    }
}