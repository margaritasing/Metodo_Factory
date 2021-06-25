package com.company;

public abstract class EmpleadoFactory {
    public static IEmpleado getEmpleado(TipoEmpleado tipoEmpleado, String nombre, Double salario) {

        IEmpleado empleado = switch (tipoEmpleado){
            case DOCENTE -> new Docente();
            case DIRECTIVO -> new Directivo();
            case ADMINISTRATIVO -> new Administrativo();
            case JEFE_DEPARTAMENTO -> new JefeDepartamento();
        };
        empleado.actualizarDatos(tipoEmpleado, nombre, salario);
        return empleado;
    }
}
