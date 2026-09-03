package MotorVehiculos.Vehiculos;

public class VehiculoAereo {
   public VehiculoAereo(String nombre, double peso, double potencia) {
        super(nombre, peso, potencia);
    }

    @Override
    public double velocidadMaxima() {
        return potencia - peso / 300;
    }

    public void despegar() {
        System.out.println("El vehiculo despega.");
    }

    public void volar() {
        System.out.println("El vehiculo vuela horizontalmente.");
    }
}

