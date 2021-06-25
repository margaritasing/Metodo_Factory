package com.company;

public abstract class Empleado implements IEmpleado{
    private TipoEmpleado cargo;
    private Double salario;
    private String nombre;

    @Override
    public void actualizarDatos(TipoEmpleado tipoEmpleado, String nombre, Double salario) {
        this.cargo = tipoEmpleado;
        this.salario = salario;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "cargo=" + cargo +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public TipoEmpleado getCargo() {
        return cargo;
    }

    public void setCargo(TipoEmpleado cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
