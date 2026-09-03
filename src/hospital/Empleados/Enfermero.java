package hospital.Empleados;

public class Enfermero extends Empleado{
    private boolean UCI;
    private int turno;

    public Enfermero(String nombre, double salario, boolean UCI, int turno){
        super(nombre, salario);
        this.UCI=UCI;
        this.turno=turno;
    }
    @Override
    public double calcularSalario() {
        if (UCI) {
            return salario + (salario*20);
        } else {
            return salario;
        }
    }
    
}
