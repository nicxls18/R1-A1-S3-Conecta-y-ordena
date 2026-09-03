package excepciones;

public class ExcepcionTransaccion extends ExcepcionBancaria {

    public ExcepcionTransaccion(
            String mensaje,
            String codigo,
            String severidad) {

        super(mensaje, codigo, severidad);
    }
}