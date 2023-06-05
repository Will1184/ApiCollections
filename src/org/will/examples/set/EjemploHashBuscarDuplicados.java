package org.will.examples.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashBuscarDuplicados {
    public static void main(String[] args) {

        String[] peces = {"Corvina","Lenguado","Pejerrey","Corvina","Robalo","Atun","Lenguado"};

        //Se usa para buscar los duplicados
        Set<String> unicos = new HashSet<>();
        for (String pez: peces){
            if (!unicos.add(pez)){
                System.out.println("Elemento Duplicado: "+ pez );
            }
        }
        System.out.println(unicos.size()+" elementos no duplicados: " +unicos);
    }
}
