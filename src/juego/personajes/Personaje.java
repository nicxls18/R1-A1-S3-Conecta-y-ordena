package personajes;

public abstract class Personaje {

    protected String nombre;
    protected int vida;
    protected int mana;

    public Personaje(String nombre, int vida, int mana) {
        this.nombre = nombre;
        this.vida = vida;
        this.mana = mana;
    }

    public abstract void atacar();

    public void recibirDanio(int danio) {
        vida -= danio;
        System.out.println(nombre + " recibe " + danio + " de daño.");
    }

    public void mostrar() {
        System.out.println(nombre + " - Vida: " + vida + " - Mana: " + mana);
    }
}