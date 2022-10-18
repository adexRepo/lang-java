public class TipeDataBukanPrimitif_8 {
    public static void main(String[] args){
        // TIPE DATA PRIMITIF
        /* 
            1. Tipe data primitif adalah tipe data bawaan dalam bahasa pemrograman.
                Tipe data primitif tidak bisa diubah lagi, karena menyatu dnegan mesin
            2. Tipe data number, char, boolean, adalah tipe data primitif.
                Tipe data primitif selalu memiliki default value
            3. Tipe data String bukan tipe data primitif, tipe data bukan primitif
                tidak memiliki default value, sebagai gantinya akan bernilai null
            4. Tipe data bukan primitif bisa memiliki method/function (akan dibahas nanti)
            5. Di Java, semua tipe data primitif memiliki representasi tipe data bukan primitfnya
            6. jadi tinggal diubah aja huruf depannya jadi huruf besar contoh byte jadi Byte, short jadi Short dst
            7. kecuali int jadi Integer , dan char menjadi Character
            8. cara pembuatannya sama aja
        */

        Integer iniInteger= 15;
        String  iniString = "Adex Uciha";
        String  laaahNull =null;
        Byte iniByte = 30;
        //Long iniLong; -- need inisialisasi

        System.out.println(iniInteger);
        System.out.println(iniString);
        System.out.println(laaahNull);
        System.out.println(iniByte);
        //System.out.println(iniLong); //error karena belum di inisialisasi

        System.out.println("-----------------konversi--------------");
        //Konversi dari primitif ke bukan primitif
        //ini sama tipe datanya yaitu integer
        int iniAngka = 10; //primitif
        Integer angkaKonversi = iniAngka; //ke bukan primitf
        System.out.println(iniAngka);
        System.out.println(angkaKonversi);

        short shortValue = angkaKonversi.shortValue();
        long  iniLongValue = angkaKonversi.longValue();
        float iniFloat =angkaKonversi.floatValue();

        System.out.println(shortValue);
        System.out.println(iniLongValue);
        System.out.println(iniFloat);
    }
}
