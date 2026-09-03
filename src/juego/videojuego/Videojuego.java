package videojuego;

import personajes.Aturdido;
import personajes.Envenenado;
import personajes.Guerrero;
import personajes.Hibrido;

public class Videojuego {

    public static void main(String[] args) {

        Guerrero guerrero = new Guerrero("Guerrero");
        Hibrido hibrido = new Hibrido("Hibrido", 40);

        Envenenado veneno = new Envenenado();
        Aturdido aturdido = new Aturdido();


        System.out.println("=== COMBATE ===");

        // Guerrero envenenado
        veneno.aplicar(guerrero);

        // Hibrido aturdido
        aturdido.mostrar();

        System.out.println();

        // Turno 1
        System.out.println("Turno 1:");

        guerrero.atacar();

        if (aturdido.puedeAtacar()) {
            hibrido.atacar();
        } else {
            System.out.println("El Hibrido pierde su turno.");
        }

        System.out.println();

        // Turno 2
        System.out.println("Turno 2:");

        guerrero.atacar();

        System.out.println("El Hibrido se recupera del aturdimiento.");
        hibrido.atacar();

        System.out.println();

        // Caso límite
        System.out.println("Caso límite:");

        System.out.println("El Hibrido está aturdido y se envenena.");

        veneno.aplicar(hibrido);

        System.out.println("Primero se aplica el veneno.");
        System.out.println("Después se revisa el aturdimiento.");
        System.out.println("Por estar aturdido, pierde el turno.");
    }
}