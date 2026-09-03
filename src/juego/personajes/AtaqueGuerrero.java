package personajes;

public interface AtaqueGuerrero {

    default void atacar() {
        System.out.println("Ataque con espada.");
    }
}