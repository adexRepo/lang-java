package application;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        System.out.println("non lazy: ");
        testScore(90, getName());

        // by default dijava parameter itu EAGER , atau dipanggil terlebih dahulu
        // baru dikirim dulu
        // problemnya kalo score nya <= 80 [case dibawah] maka method testScore
        // gaperlu nunggu method getName(), karena gabakal dipakai juga, untuk apa
        // dipanggil?
        // lambda bisa membuat seakan2 getName() lazy menggunakan Supplier<String>
        // seperti dibawah ini
        System.out.println("");
        System.out.println("lazy: ");
        testScore(50, () -> getName());
        // method get name tidak dipanggil

    }

    /* -------------------------------- Non lazy -------------------------------- */
    public static void testScore(int score, String name) {
        if (score > 80) {
            System.out.println("Name: " + name);
        } else {
            System.out.println("Try again next year!");
        }
    }

    /* ----------------------------- Lazy by lambda ----------------------------- */
    public static void testScore(int score, Supplier<String> name) {
        if (score > 80) {
            System.out.println("Name: " + name.get());
        } else {
            System.out.println("Try again next year!");
        }
    }

    public static String getName() {
        System.out.println("Method getName dipanggil");
        return "Adx";
    }

}
