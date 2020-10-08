package org.eencarnacion.ejemplos.set;

import org.eencarnacion.ejemplos.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {

    public static void main(String[] args) {

        Set<Alumno> sa = new TreeSet<>((a, b) -> b.getNombre().compareTo(a.getNombre()));
        sa.add(new Alumno("\nPato", 5));
        sa.add(new Alumno("\nCata", 6));
        sa.add(new Alumno("\nLuci", 4));
        sa.add(new Alumno("\nJano", 7));
        sa.add(new Alumno("\nAndrés", 3));
        sa.add(new Alumno("\nZeus", 2));
        //Necesita implementar el método compareTo de comparable en la clase Alumno
        System.out.println("sa = " + sa);
    }
}
