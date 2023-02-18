package learn.lang.generic.application;

import java.util.Arrays;
import java.util.Comparator;

import learn.lang.generic.Person;

public class ComparatorApp {

    public static void main(String[] args) {
        Person[] people = {
                new Person("Xavi", "Jakarta"),
                new Person("Ronaldo", "Bekasi"),
                new Person("Adex", "Depok"),
        };

        Comparator<Person> comparator = new Comparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }

        };

        Arrays.sort(people,comparator);
        
        System.out.println(Arrays.toString(people));

    }

}
