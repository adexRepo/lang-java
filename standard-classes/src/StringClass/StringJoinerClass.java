package StringClass;
import java.util.StringJoiner;

public class StringJoinerClass {
    /* --------------------------- StringJoiner Class --------------------------- */

    /*
     * StringJoiner adalah class yang bisa digunakan untuk membuat String sequence
     * yang dipisahkan dengan delimiter.
     * StringJoiner juga mengukung prefix dan suffix jika kita ingin menambahkannya.
     * Ini sangat bagus kalo mau print array dengan format yang diinginkan.
     * 
     * Lengkapnya :
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/StringJoiner.html
     * 
     */

    public static void main(String[] args) {
        
        String[] names = {"adek","kristiyanto","males-banget"};
        StringJoiner sj = new StringJoiner("-", "$$$ ", " $$$");
        sj.add(names[0]);
        sj.add(names[1]);
        sj.add(names[2]);

        System.out.println(sj.toString());
    }

}
