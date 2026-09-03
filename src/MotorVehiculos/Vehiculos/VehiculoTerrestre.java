package Vehiculos;

public class VehiculoTerrestre extends Vehiculo {

    public VehiculoTerrestre(String nombre, double peso, double potencia) {
        super(nombre, peso, potencia);
    }

    @Override
    public double velocidadMaxima() {
        return potencia - peso / 100;
    }

    public double consumo() {
        return 10;
    }
}