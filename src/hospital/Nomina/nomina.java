package hospital.Empleados.Nomina;
import hospital.Empleados.Administrativo;
import hospital.Empleados.Empleado;
import hospital.Empleados.Enfermero;
import hospital.Empleados.Medico;
import hospital.Empleados.MedicoResidenteInvestigador;
import hospital.Empleados.ResidenteEmpleado;

public class nomina{
    public static void main(String[] args) throws Exception {
        Empleado empleado1 = new Medico("Santiago", 3000000.0, "Cardiología");
        Empleado empleado2 = new Medico("valentina", 2500000.0, "Pediatría");
        Empleado empleado3 = new ResidenteEmpleado("nicolas", 30040000.0, 2, 500000.0);
        Empleado empleado4 = new Enfermero("María", 2000000.0, true, 67);
        Empleado empleado5 = new Administrativo("Patricia", 1800000.0, "Salud Medica");
        Empleado empleado6 = new MedicoResidenteInvestigador("Luis", 3500000.0, "Neurología", 3, 700000.0);

        empleado1.mostrar();
        System.out.println("Salario: " + empleado1.calcularSalario());
        empleado2.mostrar();
        System.out.println("Salario: " + empleado2.calcularSalario());
        empleado3.mostrar();
        System.out.println("Salario: " + empleado3.calcularSalario());
        empleado4.mostrar();
        System.out.println("Salario: " + empleado4.calcularSalario());
        empleado5.mostrar();
        System.out.println("Salario: " + empleado5.calcularSalario());
        empleado6.mostrar();
        System.out.println("Salario: " + empleado6.calcularSalario());

    }
}