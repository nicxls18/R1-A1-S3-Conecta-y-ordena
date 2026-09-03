package Empleados;

public class MedicoResidenteInvestigador extends Medico implements Residente {

    private int añosResidencia;
    private double bonoInvestigacion;

    public MedicoResidenteInvestigador(String nombre, double salarioBase, String especialidad, int añosResidencia, double bonoInvestigacion) {
        super(nombre, salarioBase, especialidad);
        this.añosResidencia = añosResidencia;
        this.bonoInvestigacion = bonoInvestigacion;
    }

    @Override
    public double calcularBonoResidencial() {
        return salario * (2 * añosResidencia);
    }

    @Override
    public int getAñosResidencia() {
        return añosResidencia;
    }

    @Override
    public double calcularSalario() {
        return salario + calcularBonoResidencial() + bonoInvestigacion;
    }
}