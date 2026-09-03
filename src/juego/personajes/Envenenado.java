package personajes;

public class Envenenado {

    public void aplicar(Personaje personaje) {
        System.out.println(personaje.nombre + " está envenenado.");
        personaje.recibirDanio(5);
    }
}