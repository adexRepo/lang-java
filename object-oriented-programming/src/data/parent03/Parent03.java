package data.parent03;

public class Parent03 extends GrandParent{
    public String nameDad = "Sudarman";
    public String name = "Siti";

    public Parent03(String name) {
        super(name);
        this.name = name;
    };

    public String sayHello(String nameDad) {
        this.nameDad = nameDad;
        System.out.println("Hello (Daddy) : " + this.nameDad);
        return nameDad;
    }
}