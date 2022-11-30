package rgaviolli.com.br;

import rgaviolli.com.br.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ex {
    public static void main(String[] args) {

        System.out.println("Type name and gender: ");
        Person a = new Person("Rafael", "Male");
        Person b = new Person("Rafaela", "Female");
        Person c = new Person("Brayan", "Male");
        Person d = new Person("Shirlei", "Female");

        List<Person> listAll = new ArrayList<>();
        listAll.add(a);
        listAll.add(b);
        listAll.add(c);
        listAll.add(d);

        System.out.println("Persons: " + listAll);

        List<Person> listMale = new ArrayList<>();
        listMale.add(a);
        listMale.add(c);

        System.out.println("Male: " + listMale);

        List<Person> listFemale = new ArrayList<>();
        listFemale.add(b);
        listFemale.add(d);

        System.out.println("Female: " + listFemale);

















    }
}

