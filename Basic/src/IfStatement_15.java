public class IfStatement_15 {
    public static void main(String[] args) {
        // IF Statement
        /* 
            1. Dalam java, if adalah salah satu kata kunci yang digunakan untuk percabangan
            2. Percabangan artinya kita bisa mengeksekusi progam tertentu ketika suatu kondisi terpenuhi
            3. Hampir di semua bahasa pemrograman mendukung if expression
            4. Else expression ialah kondisi jika if bernilai false
            5. Else juga bisa diberikan kondisi layaknya if, yakni dengan else if { yourcode here}
            */

        var nilai = 88;
        var absen = 90;

        if (nilai >= 90 && absen >= 80) {
            System.out.println("Selamat anda lulus");
        } else if (nilai > 75 || absen > 75) {
            System.out.println("Anda tidak lulus");
        }else {
            System.out.println(" wah anda bodoh sekali ");
        }
    }
}
