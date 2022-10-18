public class MethodVariableArgument_28 {
    public static void main(String[] args) {
        // Method Variable Argument
        /* 
            1. Kada kita butuh mengirim data ke method sejumlah data yang tidak pasti
            2. Biasanya, agar bisa seperti ini, kita akan enggunakan Array sebagai parameter
                di method tersebut
            3. Namun di Java, kita bisa menggunakan variabel argument, untuk mengirim data yang
                tidak pasti ke method tersebut jumlahnya,bisa nol atau lebih
            4. Parameter dengan tipe variable argument, hanya bisa ditempatkan di akhir method
        */
        int[] data = {42, 66, 90, 90, 41};
        sayCongrate("Adex",data);

        System.out.println("===============================");
        sayCongrate2("Kristiyanto", 89,88,90,78,21);
    }

    // ini pembuatan argument dengan array
    static void sayCongrate (String name, int[] scores) {
        var total = 0;
        for (var score : scores) {
            total += score;
        }
        var average = total / scores.length;

        if(average >= 90) {
            System.out.println(name + " Congratulation, you are a good student");
        } else {
            System.out.println(name + " Sorry, you are a goodblog");
        }
    }

    // ini pembuatan argument dengan variabel
    static void sayCongrate2 (String name, int... values) {
        var total = 0;
        for (var score : values) {
            total += score;
        }
        var value = total / values.length;

        if(value >= 90) {
            System.out.println(name + " Congratulation, you are a good student");
        } else {
            System.out.println(name + " Sorry, you are not a good student");
        }
    }
}
