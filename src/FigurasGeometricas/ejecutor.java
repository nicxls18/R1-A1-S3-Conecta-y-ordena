import figuras.Circulo;
import figuras.Cuadrado;
import figuras.FiguraCompuesta;
import figuras.Rectangulo;

public class App {
    public static void main(String[] args) throws Exception {
        
        Rectangulo rectangulo1 = new Rectangulo(6, 5);
        Cuadrado cuadrado1 = new Cuadrado(2);
        Circulo circulo1 = new Circulo(9);

        FiguraCompuesta grupo1 = new FiguraCompuesta();

        grupo1.agregar(rectangulo1);
        grupo1.agregar(cuadrado1);
        grupo1.agregar(circulo1);

        Rectangulo rectangulo2 = new Rectangulo(3, 3);
        Cuadrado cuadrado2 = new Cuadrado(9);
        Circulo circulo2 = new Circulo(1);

        FiguraCompuesta grupo2 = new FiguraCompuesta();

        grupo2.agregar(rectangulo2);
        grupo2.agregar(cuadrado2);
        grupo2.agregar(circulo2);

        FiguraCompuesta total = new FiguraCompuesta();

        total.agregar(grupo1);
        total.agregar(grupo2);

        System.out.println("Area total: " + total.area());
        System.out.println("Perimetro total: " + total.perimetro());

        FiguraCompuesta nueva = total.escalar(2);

        System.out.println("Area despues de escalar: " + nueva.area());
        System.out.println("Perimetro despues de escalar: "
                + nueva.perimetro());
    
    }
}
