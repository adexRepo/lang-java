import Module.Product.Product02;

public class To_String_Method_25 {
    /* -------------------------------------------------------------------------- */
    /*                           THEORY TO STRING METHOD                          */
    /* -------------------------------------------------------------------------- */

    /*
     * toString() adalah method yang terdapat di class Object (java.lang.Object)
     * Method ini biasanya digunakan untuk merepresentasikan object dalam bentuk String,
     * Secara default, toString() ini akan menghasilkan :
     *   - nama_class + @ + hashcode
     * Namun kita bisa mengubahnya jika kita mau, agar object yang kita buat lebih mudah dibaca.
     * 
     * pakai module nya product
     */
    
     public static void main(String[] args) {
        Product02 product = new Product02( "Android", 10000);
        
        System.out.println(product.name);
        
        System.out.println(product);
     }
}
