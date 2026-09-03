package personajes;

public interface AtaqueMago {

    default void atacar() {
        System.out.println("Ataque mágico.");
    }
}