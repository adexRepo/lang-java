package learn.lang.generic;

public class Person implements Comparable<Person>{
    
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }

    @Override
    public int compareTo(Person o) {
        return this.address.compareTo(o.address);
    }

}
