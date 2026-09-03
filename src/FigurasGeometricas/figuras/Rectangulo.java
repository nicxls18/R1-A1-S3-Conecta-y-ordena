package figuras;

public class Rectangulo extends Figura {

    protected double ancho;
    protected double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public Rectangulo escalar(double factor) {
        return new Rectangulo(ancho * factor, alto * factor);
    }

    @Override
    public double area() {
        return ancho * alto;
    }

    @Override
    public double perimetro() {
        return 2 * (ancho + alto);
    }
}