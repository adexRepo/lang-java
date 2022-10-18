package Module.parent03;

public class GrandParent {
    public String grandDad = "Sudarman";
    public String name; 

    public GrandParent(String name) {
        this.name = name;
    }

    public String sayHello(String grandDad) {
        this.grandDad = grandDad;
        System.out.println("Hello (Grand Dad) : " + this.grandDad);
        return grandDad;
    }
}
