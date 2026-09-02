public class Administrativo extends Empleado{

    public Administrativo(String nombre, double salario){
        super(nombre, salario);
    }
    @Override
    public double calcularSalario(){
        return salario;
    }
    
}
