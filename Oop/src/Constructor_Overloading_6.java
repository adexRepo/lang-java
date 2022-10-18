import Module.person.Person02;

public class Constructor_Overloading_6 {
    /* -------------------------------------------------------------------------- */
    /*                      THEORY OF CONSTRUCTOR OVERLOADING                     */
    /* -------------------------------------------------------------------------- */

    /*
     * Sama seperti di method, di constructor pun kita bisa melakukan overloading,
     * Kita bisa membuat constructor lebih dari satu, dengan syarat tipe data parameter harus berbeda,
     *  atau jumlah parameter harus berbeda.
     * Lihat : Module.Person02
     */

     public static void main(String[] args) {
        Person02 person01 = new Person02("Adex", "Jakarta03");
        Person02 person02 = new Person02("Ade", "Jakarta02");
        Person02 person03 = new Person02("Ade");
        Person02 person04 = new Person02();

        System.out.println("");
        System.out.println("Hello, I'm a new person");
        System.out.println("My name is " + person01.name);
        System.out.println("I live in " + person02.address);
        System.out.println("I live in " + person03.name);
        System.out.println("I live in " + person04);
        System.out.println("");
        
     }

    /* -------------------------------------------------------------------------- */
    /*                   CONSTRUCTOR CAN CALL OTHER CONSTRUCTOR                   */
    /* -------------------------------------------------------------------------- */
    
    /*
     * Constructor bisa memanggil constructor lainnya,
     * Hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan.
     * Cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method namun dengan kata kunci this.
     * lihat : Module.Person03
     */
    
}
