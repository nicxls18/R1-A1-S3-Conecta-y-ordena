package MotorVehiculos.Vehiculos.consecionario;
import MotorVehiculos.Vehiculos.VehiculoAcuatico;
import MotorVehiculos.Vehiculos.VehiculoAereo;
import MotorVehiculos.Vehiculos.VehiculoAereoVTOL;
import MotorVehiculos.Vehiculos.VehiculoAnfibio;
import MotorVehiculos.Vehiculos.VehiculoTerrestre;

public class consecionario {
    public static void main(String[] args) throws Exception {
        VehiculoTerrestre carro = new VehiculoTerrestre("Carro", 1000, 120);

        VehiculoAcuatico barco = new VehiculoAcuatico("Barco", 2000, 100);

        VehiculoAereo avion = new VehiculoAereo("Avion", 3000, 500);

        VehiculoAnfibio anfibio = new VehiculoAnfibio("Anfibio", 1500, 150);

        VehiculoAereoVTOL vtol = new VehiculoAereoVTOL("VTOL", 2500, 400);

        carro.mostrar();

        System.out.println();

        barco.mostrar();

        System.out.println();

        avion.mostrar();
        avion.despegar();
        avion.volar();

        System.out.println();

        anfibio.mostrar();
        anfibio.mostrarMedio();
        System.out.println("Consumo: " + anfibio.consumo());

        System.out.println();

        anfibio.cambiarMedio("agua");
        anfibio.mostrarMedio();
        System.out.println("Consumo: " + anfibio.consumo());

        System.out.println();

        vtol.mostrar();
        vtol.despegarVertical();
        vtol.volar();
    }
}