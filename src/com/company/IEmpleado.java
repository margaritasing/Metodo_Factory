package com.company;

public interface IEmpleado {
    String getNombre();
    TipoEmpleado getCargo();
    Double getSalario();

    void actualizarDatos(TipoEmpleado tipoEmpleado, String nombre, Double salario);
}