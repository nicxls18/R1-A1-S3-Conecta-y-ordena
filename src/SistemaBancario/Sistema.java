import excepciones.Banco;
import excepciones.ExcepcionTransaccion;

public class Main {
    public static void main(String[] args) throws Exception {
         try {

            Banco.realizarTransaccion();

        } catch (ExcepcionTransaccion e) {

            e.mostrar();

            System.out.println();
            System.out.println("Causa original: "
                    + e.getCause().getMessage());
        }
    }
}
