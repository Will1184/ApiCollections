package org.will.examples.set;

import org.will.examples.modelo.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>((a,b)->b.compareTo(a));
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        System.out.println("ts = "+ ts);

        Set<Integer> nums= new TreeSet<>(Comparator.reverseOrder());
        nums.add(1);
        nums.add(5);
        nums.add(4);
        nums.add(2);
        nums.add(3);
        nums.add(10);
        System.out.println("Numeros = "+nums);
    }
}
