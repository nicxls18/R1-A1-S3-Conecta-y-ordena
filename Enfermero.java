public class Enfermero extends Empleado{
    protected String turno;

    public Enfermero(String nombre, double salario, String turno){
        super(nombre, salario);
        this.turno=turno;
    }
    @Override
    public double calcularSalario(){
        return salario;
    }
    
}
