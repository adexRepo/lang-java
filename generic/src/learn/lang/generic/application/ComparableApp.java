package learn.lang.generic.application;

import java.util.Arrays;

import learn.lang.generic.Person;

public class ComparableApp {

    public static void main(String[] args) {

        Person[] people = {
                new Person("Ade", "Jakarta"),
                new Person("Ade", "Bekasi"),
                new Person("Ade", "Depok"),
        };

        System.out.println(Arrays.toString(people));
        System.out.println("---------------------");
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));

    }

}
