package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void printDepartment(List<Person> people){
        System.out.println(Arrays.toString(people.toArray()));
    }

    public static void main(String[] args) {
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");

        System.out.println(pekka);
        System.out.println(esko);

        System.out.println("-----------------------");

        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());

        System.out.println("-----------------------");

        Teacher teacherPekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher teacherEsko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( teacherPekka );
        System.out.println( teacherEsko );

        System.out.println("-----------------------");

        Student olli2 = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            olli2.study();
        }
        System.out.println( olli2 );

        System.out.println("-----------------------");

        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );
        printDepartment(people);
    }
}