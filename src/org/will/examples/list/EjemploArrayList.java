package org.will.examples.list;

import org.will.examples.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno> alumnoList = new ArrayList<>();
        System.out.println(alumnoList+", size = " + alumnoList.size());
        System.out.println("Esta vacia: " + alumnoList.isEmpty());
        alumnoList.add(new Alumno("Pato",5));
        alumnoList.add(new Alumno("Cata",6));
        alumnoList.add(new Alumno("Luci",4));
        alumnoList.add(2,new Alumno("Jano",7));
        alumnoList.set(3,new Alumno("Andres",3));

        System.out.println(alumnoList+", size = " + alumnoList.size());
        alumnoList.remove(new Alumno("Jano",7));
        System.out.println(alumnoList+", size = " + alumnoList.size());

        boolean b = alumnoList.contains(new Alumno("Cata",6));
        System.out.println("La lista contiene a Cata = "+b);

        Object a[] = alumnoList.toArray();

        for (int i=0; i<a.length; i++){
            System.out.println("Desde el array = "+a[i]);
        }

    }
}
