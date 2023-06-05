package org.will.examples.list;

import org.will.examples.modelo.Alumno;

import java.util.LinkedList;
import java.util.ListIterator;

import static java.util.Comparator.comparing;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        LinkedList<Alumno> enlazada= new LinkedList<>();
        enlazada.add(new Alumno("Pato",5));
        enlazada.add(new Alumno("Cata",6));
        enlazada.add(new Alumno("Luci",4));
        enlazada.add(new Alumno("Jano",7));
        enlazada.add(new Alumno("Andres",3));
        enlazada.add(new Alumno("Zeus2",2));
        enlazada.add(new Alumno("Zeus",2));
        enlazada.add(new Alumno("Lucas",2));
        enlazada.add(new Alumno("Lucas",3));
        //Collection.sort(enlazada,(a,b) -> b.getNota().compareTo(a.getNota()));
        //enlazada.sort((a,b) -> a.getNota().compareTo(b.getNota)));
        enlazada.sort(comparing(Alumno::getNombre).reversed());
        System.out.println(enlazada);

        System.out.println("Iterando usando Stream forEach");
        enlazada.forEach(System.out::println);
    }
}
