public class Medico extends Empleado {
    protected String especialidad;

    public Medico(String nombre, double salario, String especialidad){
        super(nombre, salario);
        this.especialidad=especialidad;
    }
    @Override
    public double calcularSalario(){
        return salario;
    }

    
}
