package com.company;

/*
Un instituto necesita modelar su sistema de gestión de empleados.
            Utilizar el método Factory para armar un esquema que permita crear objetos de tipo:
            - Docente
            - Directivo
            - Jefe de departamento
            - Administrativo

            Los objetos de cada clase deben poder indicar su cargo, salario y nombre.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TipoEmpleado tipoEmpleado = TipoEmpleado.ADMINISTRATIVO;
        String nombre = "Libia";
        Double salario = 8.50;

        IEmpleado empleado = EmpleadoFactory.getEmpleado(tipoEmpleado, nombre, salario);

        System.out.println("Soy "+empleado.getNombre());
        System.out.println(empleado);

    }
}
