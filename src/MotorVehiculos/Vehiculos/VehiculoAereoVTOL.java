package Vehiculos;

public class VehiculoAereoVTOL extends VehiculoAereo {

    public VehiculoAereoVTOL(String nombre, double peso, double potencia) {
        super(nombre, peso, potencia);
    }

    public void despegarVertical() {
        System.out.println("El vehiculo despega verticalmente.");
    }
}