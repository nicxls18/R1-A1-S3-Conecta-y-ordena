package hospital.Empleados;

public class ResidenteEmpleado extends Empleado implements Residente {

    private int añosResidencia;
    private double bonoResidencial;

   public ResidenteEmpleado( String nombre, double salario, int añosResidencia, double bonoResidencial) {
        super(nombre, salario);
        this.añosResidencia = añosResidencia;
        this.bonoResidencial = bonoResidencial;
    }
   
    @Override
    public double calcularBonoResidencial(){
        return salario * (2* añosResidencia);
    }

    @Override
    public int getAñosResidencia() {
        return añosResidencia;
    }

    @Override
    public double calcularSalario() {
        return salario + calcularBonoResidencial() + bonoResidencial;
    }
}