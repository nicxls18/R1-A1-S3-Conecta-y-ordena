package excepciones;

public class ExcepcionBancaria extends Exception {

    protected String codigo;
    protected String severidad;

    public ExcepcionBancaria(
            String mensaje,
            String codigo,
            String severidad) {

        super(mensaje);
        this.codigo = codigo;
        this.severidad = severidad;
    }

    public ExcepcionBancaria(
            String mensaje,
            String codigo,
            String severidad,
            Throwable causa) {

        super(mensaje, causa);
        this.codigo = codigo;
        this.severidad = severidad;
    }

    public void mostrar() {
        System.out.println("Error: " + getMessage());
        System.out.println("Codigo: " + codigo);
        System.out.println("Severidad: " + severidad);
    }
}