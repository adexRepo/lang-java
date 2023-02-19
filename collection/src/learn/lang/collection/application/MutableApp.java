package learn.lang.collection.application;

import java.util.List;

import learn.lang.collection.data.Person;

public class MutableApp {
    public static void main(String[] args) {
        
        Person person = new Person("Adek");

        person.setHobbies("Ngoding");
        person.setHobbies("Ngomong");
        person.setHobbies("Ngok ngok");

        doSomethingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        // do shomethong
        hobbies.add("Indonesia"); 
        // saya ingin doSomethingWithHobbies tidak bisa menambahkan atau merubah
        // isi dari hobbies dan Indonesia bukan hobby
        // and need to add immutable on Hobbies
        // after add immutable in person
        // will error in line 16 / line 25 java.lang.UnsupportedOperationException
    }

}
