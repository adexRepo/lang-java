package Module.parent01;

public class Child02 extends Parent01 {
    // OVERRIDING dari Parent01
    public void sayHelloToDad() {
        System.out.println("Tralalaa " + nameDad);
    }

    public void sayHelloToMom(String nameMom) {
        this.nameMom = nameMom;
        System.out.println("Tralalaa " + this.nameMom);
    }
}