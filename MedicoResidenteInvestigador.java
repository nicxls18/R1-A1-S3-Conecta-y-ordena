
public class MedicoResidenteInvestigador extends Empleado implements Tresidencia, Especialidad{
    protected String especialidad;
    protected int Tresidencia;

    public MedicoResidenteInvestigador(String nombre, double salario, String especialidad, int Tresidencia){
        super(nombre, salario);
        this.especialidad=especialidad;
        this.Tresidencia=Tresidencia;
    }
    @Override
    public double calcularSalario(){
        return salario;
    }

    @Override
    public String obtenerRol(){
        return "Medico residente";
    }
}