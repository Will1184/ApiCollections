package org.will.examples.set;

import org.will.examples.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> alumnos = new HashSet<>();
//        List<Alumno> alumnos = new LinkedList<>();
        alumnos.add(new Alumno("Pato",5));
        alumnos.add(new Alumno("Cata",6));
        alumnos.add(new Alumno("Luci",4));
        alumnos.add(new Alumno("Jano",7));
        alumnos.add(new Alumno("Andres",3));
        alumnos.add(new Alumno("Zeus2",2));
        alumnos.add(new Alumno("Zeus",2));
        alumnos.add(new Alumno("Lucas",2));
        alumnos.add(new Alumno("Lucas",3));
        System.out.println(alumnos);

        System.out.println("Iterando con un foreach");
        for (Alumno a: alumnos){
            System.out.println(a.getNombre());
        }
        System.out.println("Iterando usando while e iterador");
        Iterator<Alumno> it = alumnos.iterator();
        while (it.hasNext()){
            Alumno a =it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando Stream foreach");
        alumnos.forEach(System.out::println);
    }
}
