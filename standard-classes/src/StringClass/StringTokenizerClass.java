package StringClass;
import java.util.StringTokenizer;

public class StringTokenizerClass {
    /* ------------------------- String Tokenizer Class ------------------------- */

    /*
     * String Tokenizer class adalah class yang bisa digunakan untuk memotogn String
     * menjadi token atau string yang lebih kecil.
     * Kita bisa memotong String dengan delimiter yang kita mau.
     * 
     * bagusnya pakai tokenizer daripada split adalah kalo tokenizer itu dia Lazy,
     * looping nya perlu manual pakai next, sedangkan split dia langsung. kita
     * gabisa kontrol karena langsung full semua stringnya, dan makan memory.
     * 
     * Lengkapnya :
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/
     * StringTokenizer.html
     */

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("this is a test");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        String name = "Adek Kristiyanto Koar-koar";
        // StringTokenizer tokenizer = new StringTokenizer(name, "/");
        StringTokenizer tokenizer = new StringTokenizer(name, " ");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

    }
}
