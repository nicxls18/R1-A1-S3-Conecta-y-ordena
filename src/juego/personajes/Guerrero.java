package personajes;

public class Guerrero extends Personaje {

    public Guerrero(String nombre) {
        super(nombre, 100, 0);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con su espada.");
    }
}