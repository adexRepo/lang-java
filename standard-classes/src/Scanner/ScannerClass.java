package Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerClass {
    /* ------------------------------ Scanner CLass ----------------------------- */
    /*
     * Scanner sebenarnya bagian dari Java IO (Input Output), dan ini akan dibahas
     * di materi terpisah. Namun sekarang dibahas sekilah terkait class Scanner
     * 
     * Class Scanner hadir sejak java 5
     * Class Scanner adalah class yang bisa digunakan untuk membaca input output,
     * entah dari file, console dan lain2.
     * 
     * Cocok untuk belajar melalui konsole.
     * 
     * Lengkapnya:
     * https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Scanner.html
     * 
     * nextLine()    >>  Membaca string  
     * nextInt()     >>  Membaca int      
     * nextLong()    >>  Membaca long
     * nextBoolean() >>  Membaca boolean
     */

    public static void main(String[] args) {
        
        try (Scanner scan1 = new Scanner(System.in)) {
            System.out.print("Name : ");
            String name = scan1.nextLine();
            System.out.println("WOy :"+name);
        }
        
        File text = new File("C:/development/github/lang-java/standard-classes/src/ScannerClass/readme.txt");

        try (Scanner scan2 = new Scanner(text)) {
            while (scan2.hasNext()) {
                System.out.println(scan2.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
