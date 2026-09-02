public interface Tresidencia extends EmpleadoRol {
    default String obtenerRol() {
        return "Residente";
    }
}
