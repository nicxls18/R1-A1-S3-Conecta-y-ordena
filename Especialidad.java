public interface Especialidad extends EmpleadoRol {
    default String obtenerRol() {
        return "Medico";
    }
}
