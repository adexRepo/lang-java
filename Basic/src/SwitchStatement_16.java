public class SwitchStatement_16 {
    public static void main(String[] args) {
        // Switch statement
        /*
            1. Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakaan operator ==,
            2. Switch adalah statement percabangan yang sama dengan if, namun lebih sederhana cara pembuatannya
            3. Kondisi di switch statement hanya untuk perbandingan ==
        */
        //contoh switch statement

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Jenius");
                break;
            case "B": //ini artinya nilai B dan C itu sama
            case "C":
                System.out.println("Pintar");
                break;
            case "D":
                System.out.println("Rata - rata");
                break;
            default: System.out.println("Mungkin anda salah jurusan");
                break;
        }
    }
}
