public class MethodOverloading_29 {
    public static void main(String[] args) {
        // Method OverLoading
        /* 
            1. Method overloading adalah kemampuan membuat method dengan nama yan sama lebih dari sekali.
            2. Namun ada ketentuannya, yaitu data parameter di mathod tersebut harus berbeda-beda.
                Enth jumlahnya atau tipe data parameter nya.
            3. Jika ada yang sama, maka program Java akan error.
        */

        sayHello();
        sayHello("Adex");
        sayHello("Adex", 23);
    }
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    static void sayHello(String name, int age){
        System.out.println("Hello " + name + " , umur anda  " + age);
    }
}
