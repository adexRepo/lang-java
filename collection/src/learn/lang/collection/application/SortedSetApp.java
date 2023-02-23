package learn.lang.collection.application;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import learn.lang.collection.data.Person;
import learn.lang.collection.data.PersonComparator;

public class SortedSetApp {
    
    public static void main(String[] args) {
        
        // anggap Person kelas yang tidak bisa ditambahkan comoparable
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());//descending
        // SortedSet<Person> people = new TreeSet<>(new PersonComparator());// ascending

        people.add(new Person("adex"));
        people.add(new Person("Dupin"));
        people.add(new Person("adek"));
        people.add(new Person("Krist"));

        for (Person person : people) {
            
            System.out.println(person.getName());

        }

        SortedSet<Person> sortedSetUnModify = Collections.unmodifiableSortedSet(people);

        sortedSetUnModify.add(new Person("test")); // error coz already unmodifiable

    }

}
