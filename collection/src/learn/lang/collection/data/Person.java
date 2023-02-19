package learn.lang.collection.data;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;

public class Person {
    
    private String name;

    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return this.hobbies; // mutable
        // return Collections.unmodifiableList(this.hobbies); // immutable
    }

    public void setHobbies(String hobbies) {
        this.hobbies.add(hobbies);
    }
    
    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", hobbies='" + getHobbies() + "'" +
            "}";
    }
}
