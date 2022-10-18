package Module.parent03;

public class Child01 extends Parent03 {

    public String name;
    public Child01(String name) {
        super(name);
        this.name = name;
    };

    public String sayHello(String name) {
        this.name = name;
        System.out.println("Hello (Child) : " + this.name);
        return name;
    }
    
}
