package excepciones;

public class TransaccionSospechosaException extends ExcepcionTransaccion implements ExcepcionSeguridad {

    public TransaccionSospechosaException(
        String mensaje,
        String codigo,
        String severidad,
        Throwable causa) {

    super(mensaje, codigo, severidad);
    initCause(causa);
}

    @Override
    public boolean requiereFraude() {
        return true;
    }

}