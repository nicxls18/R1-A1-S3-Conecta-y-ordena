package excepciones;

public class Banco {

    public static void realizarTransaccion()
            throws ExcepcionTransaccion {

        try {

            // Las tres condiciones están presentes
            boolean saldoInsuficiente = true;
            boolean limiteExcedido = true;
            boolean sospechosa = true;

            if (saldoInsuficiente &&
                limiteExcedido &&
                sospechosa) {

                throw new SaldoInsuficienteException();
            }

        } catch (SaldoInsuficienteException e) {

            throw new TransaccionSospechosaException(
                    "Transaccion sospechosa",
                    "SEG001",
                    "CRITICA",
                    e
            );
        }
    }
}