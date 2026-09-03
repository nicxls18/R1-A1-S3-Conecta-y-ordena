package figuras;

import java.util.ArrayList;

public class FiguraCompuesta extends Figura {

    private ArrayList<Figura> figuras = new ArrayList<>();

    public void agregar(Figura figura) {
        figuras.add(figura);
    }

    @Override
    public FiguraCompuesta escalar(double factor) {

        FiguraCompuesta nueva = new FiguraCompuesta();

        for (Figura figura : figuras) {
            nueva.agregar(figura.escalar(factor));
        }

        return nueva;
    }

    @Override
    public double area() {

        double total = 0;

        for (Figura figura : figuras) {
            total += figura.area();
        }

        return total;
    }

    @Override
    public double perimetro() {

        double total = 0;

        for (Figura figura : figuras) {
            total += figura.perimetro();
        }

        return total;
    }
}
