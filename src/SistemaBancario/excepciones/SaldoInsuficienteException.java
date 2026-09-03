package excepciones;

public class SaldoInsuficienteException
        extends ExcepcionTransaccion {

    public SaldoInsuficienteException() {
        super(
            "Saldo insuficiente",
            "SAL001",
            "ALTA"
        );
    }
}