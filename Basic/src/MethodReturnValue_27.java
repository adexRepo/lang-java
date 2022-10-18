public class MethodReturnValue_27 {
    public static void main(String[] args) {
        // Method Return Value
        /* 
            1. Secara default, method itu tidak menghasilkan value apapun.
            2. Jika kita ingin membuat method mengembalikan nilai / ada hasilnya
                setelah method dijalankan
            3. Agar method bisa menghasilkan value, kita harus mengubah kata kunci void
                dengan tipe data yang dihasilkan
            4. Dan di dalam block method, untuk menghasilkan nilai tersebut, kita harus
                menggunakan keyword return, lalu diikuti dengan data yang sesuai dengan tipe
                data yang sudah dideklarasikan di awal method ya guys
            5. Di Java, kita hanya bisa menghasilkan 1 data di sebuah method, tidak bisa lebih dari 1
                tipe data. //kecuali tipe data di awalnya adalah object
        */
        var a = 100;
        var b = 300;
        var c = sum(a, b);
        System.out.println(c);

        System.out.println("\n");
        
        System.out.println(sum(21,32));
        System.out.println("\n");

        var d = hitung(12,"x",12);
        System.out.println(d);
    }

    static int sum(int a, int b) {
        var total = a + b;
        return total;
    }

    static int hitung(int value,String operasi, int value2) {
        return switch (operasi) {
            case "+" -> value + value2;
            case "-" -> value - value2; 
            case "x" -> value * value2;
        default -> throw new IllegalArgumentException("Unexpected value: " + operasi); 
        };
    }
}
