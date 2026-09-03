package hospital.Empleados;

public class Administrativo extends Empleado{

    public Administrativo(String nombre, double salario, String departamento) {
        super(nombre, salario);
    }
    @Override
    public double calcularSalario(){
        return salario;
    }
    
}
