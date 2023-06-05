package org.will.examples.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashBuscarDuplicados2 {
    public static void main(String[] args) {
        String[] peces = {"Corvina","Lenguado","Pejerrey","Corvina","Robalo","Atun","Lenguado"};

        //Se usa para buscar los duplicados
        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for (String pez: peces){
            if (!unicos.add(pez)){
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);
        System.out.println("Unicos: " +unicos);
        System.out.println("Duplicados: " +duplicados);
    }
}
