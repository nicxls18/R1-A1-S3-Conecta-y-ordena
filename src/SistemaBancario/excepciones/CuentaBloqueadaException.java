package excepciones;

public class CuentaBloqueadaException
        extends ExcepcionTransaccion {

    public CuentaBloqueadaException() {
        super(
            "Cuenta bloqueada",
            "CTA001",
            "ALTA"
        );
    }
}