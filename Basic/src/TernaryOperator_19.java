public class TernaryOperator_19 {
    public static void main(String[] args) {
        // TERNARY OPERATOR
        /* 
            1. Ternary operator adalah operator sederhana dari if statement
            2. Ternary operator terdiri dari kondisi yang dievaluasi,
                jika true maka nilai pertama diambil, jika false nilai kedua diambil
        */
        // EXAMPLE : TANPA Ternary Operator
        var nilai = 90;
        String ucapan;

        if (nilai >= 80) {
            ucapan ="WAhh nilai anda besar";
        } else {
            ucapan ="WAhh nilai anda kecil";
        }
        System.out.println(ucapan);

        nilai = 60;
        
        // EXAMPLE : DENGAN Ternary Operator
        ucapan = (nilai >= 80) ? "WAhh nilai anda besar banget" : "WAhh nilai anda kecil banget";

        System.out.println(ucapan);
    }
}
