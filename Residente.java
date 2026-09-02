public class Residente extends Empleado{
    protected int Tresidencia;

    public Residente(String nombre, double salario, int Tresidencia){
        super(nombre, salario);
        this.Tresidencia=Tresidencia;
    }
    @Override
    public double calcularSalario(){
        return salario;
    }


    
}
