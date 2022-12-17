package data.parent01;

public class Parent01 {
    
    String nameMom;
    String nameDad = "Woyoo";

    public void sayHelloToDad() {
        System.out.println("Hello " + nameDad);
    }

    public void sayHelloToMom(String nameMom) {
        this.nameMom = nameMom;
        System.out.println("Hello " + this.nameMom);
    }
    
}
