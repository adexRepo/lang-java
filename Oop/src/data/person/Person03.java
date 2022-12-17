package data.person;

public class Person03 {

    /* -------------------------------------------------------------------------- */
    /*                           FOR METHOD OVERLOADING                           */
    /* -------------------------------------------------------------------------- */
    
    public String name;
    public String address;

    public Person03(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    public Person03(String paramName) {
        this(paramName, null);
    }

    public Person03() {
        this(null);
    }
}
