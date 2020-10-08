package org.eencarnacion.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {

        String[] peces = {"corbina","atún","lenguado","pejerrey","robalo","atún","lenguado"};
        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for (String pez: peces){
            if (!unicos.add(pez)){
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);

        System.out.println("Unicos: " + unicos);
        System.out.println("Duplicados: " + duplicados);

    }
}
