package personajes;

public class Mago extends Personaje {

    public Mago(String nombre) {
        super(nombre, 80, 50);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza un hechizo.");
    }
}