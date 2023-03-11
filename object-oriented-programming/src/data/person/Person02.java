package data.person;
public class Person02 
{
    public String name;
    public String address;
    final String Country ="Indonesia";
    /* -------------------------------------------------------------------------- */
    /*                           PEMBAHASAN CONSTRUCTOR                           */
    /* -------------------------------------------------------------------------- */

    public Person02(String paramName, String paramAddress) 
    {
      name = paramName;
      address = paramAddress;

      System.out.println("Hello, I'm a new person");
      System.out.println("My name is" + name);
      System.out.println("I live in " + address);
      System.out.println("Nice to meet you guys");
    }

    /* -------------------------------------------------------------------------- */
    /*                     PEMBAHASAN CONSTRUCTOR OVERLOADING                     */
    /* -------------------------------------------------------------------------- */

    public Person02(String paramName) 
    {
      name = paramName;
      address = "Jakarta02";

      System.out.println("Hello, I'm a new person");
      System.out.println("My name is" + name);
      System.out.println("I live in " + address);
      System.out.println("Nice to meet you guys");
    }

    public Person02() 
    {
      name = "Adex";
      address = "Jakarta03";

      System.out.println("Hello, I'm a new person");
      System.out.println("My name is" + name); 
      System.out.println("I live in " + address);
      System.out.println("Nice to meet you guys");
    }
}
