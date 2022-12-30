package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    /* --------------------------- Regular Expression --------------------------- */

    /*
     * Regular Expression atau disingkat regex adalah cara untuk melakukan pola
     * pencarian
     * Biasanya dilakukan untuk pencarian dalam data String
     * 
     * Secara sederhana, kita mungkin sudah sering melakukan pencarian text, entah
     * di text editor atau di aplikasi word.
     * regex adalah pencarian yang lebih advanced dibandingkan pencarian text
     * biasanya, misalnya kita ingin mencari semua kata yang mengandung / diawali
     * dengan huruf tertentu atau diakhiri dengan huruf tertentu dls.
     * 
     * Regex Package
     * - Java sudah menyediakan package khusus untuk regex yaitu java.util.regex
     * berisikan utilitas untuk melakukan proses regular expression.
     * - Secara garis besar terdapat 2 class yang dapat kita gunakan, yaitu Pattern
     * class dan Matcher class.
     * Pattern Class adalah representasi hasil kompilasi dari pola regular
     * expression yang kita buat.
     * Matcher class adalah engine untuk melakukan pencarian dari pattern yang sudah
     * kita buat.
     * 
     * Aturan dalam Regular Expresion
     * Aturan disini banyak banget jadi gabisa dibahas disini baca aja dokumentasinya :P
     * Lengkapnya:
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/regex/Pattern.html
     * 
     */

    public static void main(String[] args) {
        
        String names = "Adek Kristiyanto Tralala Trilili Masooookk!";
        Pattern patternA = Pattern.compile("[a-zA-Z]*[e][a-zA-Z]*"); // harusnya dapet Adek doang
        Pattern patternB = Pattern.compile("[a-zA-Z]*[i][a-zA-Z]*"); // harusnya dapet Kristiyanto Trilili
        Pattern patternC = Pattern.compile("[a-zA-Z]*[o][a-zA-Z]*"); // harusnya dapet Masooookk
        Pattern patternD = Pattern.compile("[a-zA-Z]*[!]"); // harusnya dapet Masooookk

        // NOTE : [a-zA-Z]*[e][a-zA-Z]*
        // [a-zA-Z]*    >> depan kata huruf bebas bodo amat sama duplikat
        // [e]          >> tengah kata harus isinya e
        // [a-zA-Z]*    >> akhir kata bodo amat sama duplikat

        // NOTE : [a-zA-Z]*[!]
        // [a-zA-Z]*    >> depan kata huruf bebas bodo amat sama duplikat
        // [!]          >> akhir kata wajib ada tanda seru nya.

        Matcher matchA = patternA.matcher(names);
        Matcher matchB = patternB.matcher(names);
        Matcher matchC = patternC.matcher(names);
        Matcher matchD = patternD.matcher(names);

        while (matchA.find()) {
            System.out.println(matchA.group());
        }
        System.out.println("-----------------------------");
        while (matchB.find()) {
            System.out.println(matchB.group());
        }
        System.out.println("-----------------------------");
        while (matchC.find()) {
            System.out.println(matchC.group());
        }
        System.out.println("-----------------------------");
        while (matchD.find()) {
            System.out.println(matchD.group());
        }

    }

}
