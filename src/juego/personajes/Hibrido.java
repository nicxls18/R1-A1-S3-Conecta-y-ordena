package personajes;

public class Hibrido extends Personaje
        implements AtaqueGuerrero, AtaqueMago {

    public Hibrido(String nombre, int mana) {
        super(nombre, 100, mana);
    }

    @Override
    public void atacar() {

        if (mana >= 20) {
            System.out.println(nombre + " usa ataque mágico.");
            mana -= 20;
        } else {
            System.out.println(nombre + " usa ataque con espada.");
        }
    }
}