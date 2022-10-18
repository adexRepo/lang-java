public class Scope_31 {
    public static void main(String[] args) {
        // Scope
        /* 
            1. Di java, variable hanya bisa diakses didalam area dimana mereka dibuat.
            2. Hal ini disebut scope
            3. Contoh, jika sebuah variable dibuat di method, maka hanya bisa diakses di method tersebut.
            4. Jika variable dibuat di luar method, maka bisa diakses di semua method.
            5. Scope bisa berbeda-beda, misalnya, variable dibuat di method, maka bisa diakses di method tersebut.
        */
        sayHello("Adex");
        System.out.println("========================");
        sayHello("Jhon cena");
    }

    static void sayHello(String name){
        String hello = "Hello " + name;
        
        if(String.valueOf(name).equals("Adex")){
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
    }
}
