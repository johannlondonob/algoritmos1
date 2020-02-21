package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Primer algoritmo:
        /*1. Se requiere un algoritmo para obtener la edad promedio de un grupo de N alumnos. Si algún alumno tiene más de 18 años,
        se muestra el promedio que se lleva sin contar el alumno de 18 años. EL usuario decide si desea cerrar el programa o vuelve a ejecutarlo.*/
        Scanner scan = new Scanner(System.in);
        boolean go = true;
        int edadAlumno = 0;
        int edadesAlumnos = 0;
        int contadorAlumno = 0;
        double edadPromedio = 0;

        while(go) {
            System.out.print("¿Edad del alumno? ");
            edadAlumno = scan.nextInt();
            edadesAlumnos += edadAlumno;
            contadorAlumno++;

            if (edadAlumno > 18) {
                edadesAlumnos -= edadAlumno;
                contadorAlumno -= 1;
                edadPromedio = edadesAlumnos / contadorAlumno;
                System.out.println("Promedio de edad hasta ahora: " + edadPromedio);
            } else {
                edadPromedio = edadesAlumnos / contadorAlumno;
            }

            if (contadorAlumno >= 2) {
                System.out.print("¿Desea continuar con el ingreso de edad por alumno? \n Presione 1, para continuar \n Presione 2, para detener y calcular promedio\n Su respuesta: ");
                int res = scan.nextInt();
                go = res == 1;
            }
        }
        System.out.println("La edad promedio de " + contadorAlumno + " alumnos, es " + edadPromedio);

        // Segundo algoritmo:
        /* Se requiere un algoritmo para obtener la suma de diez cantidades mediante la utilización de un ciclo for */
        String num = "";
        int suma = 0;
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            numeros.add((int)Math.floor(Math.random()*(5-20)+20));
            suma += numeros.get(i);
            num += numeros.get(i) + ", ";
        }
        System.out.println("Números usados para la suma: " + num + "y estos sumaron: " + suma);

        // Tercer algoritmo:
        /* Se requiere un algoritmo para obtener la estatura promedio de un grupo de personas, cuyo número
        de miembros se desconoce, el ciclo debe efectuarse siempre y cuando se tenga una estatura registrada. */
        go = true;
        double estaturaPromedio = 0;
        double estatura = 0;
        int contadorMiembros = 0;
        while(go) {
            try {
                System.out.print("Ingrese estatura de la persona: ");
                estatura += scan.nextDouble();
                contadorMiembros++;
                estaturaPromedio = estatura / contadorMiembros;

                if (contadorMiembros >= 2) {
                    System.out.print("¿Desea continuar? \n Presione 1, para continuar \n Presione 2, para detenerse y ver promedio de estaturas\n Su respuesta: ");
                    int res = scan.nextInt();
                    go = res == 1;
                }
            } catch (Exception e) {
                go = false;
                System.out.println("\n---------------------------------------------------------------------");
                System.out.println("Se produjo un error en el sistema. No se ingresó una estatura válida.");
                System.out.println("---------------------------------------------------------------------\n");
            }
        }
        System.out.println("Estatura promedio: " + estaturaPromedio);
    }
}
