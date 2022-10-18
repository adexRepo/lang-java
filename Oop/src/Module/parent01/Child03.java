package Module.parent01;

public class Child03 extends Parent01{

    String nameMom;
    
    public void sayHelloToMom(String nameMom) {
        System.out.println("Hello " + nameMom);
    }

    public void sayHelloToDad() {
        System.out.println("Hello " + super.nameDad);
    }

    /*
     * ketiga bagian diatas (var nameMom, sayHelloToMom, sayHelloToDad) sama seperti yang ada di Parent01
     * dengan kata lain, ketiga method diatas menutupi method di class parent.
     * akhirnya kita tidak bisa mengakses secara langsung original method / field yang ada di parent class.
     * 
     * Cara untuk mengakses original method / field yang ada di parent class adalah dengan menggunakan super keyword.
     * Sederhananya, super digunakan untuk mengakses class parent.
     */

    public String getParentFieldNameMom() {
        return super.nameMom;
    }

    public String getParentFieldNameDad() {
        return super.nameDad;
    }

    public void getParentMethodSayHelloToDad() {
        super.sayHelloToDad();
    }

    public void getParentMethodSayHelloToMom(String nameMom) {
        super.sayHelloToMom(nameMom);
    }
 
}
