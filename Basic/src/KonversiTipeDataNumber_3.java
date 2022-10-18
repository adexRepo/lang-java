public class KonversiTipeDataNumber_3 {
    public static void main(String[] args){
        System.out.println("KonversiTipeDataNumber");
        /* 
            Secara Umum ada 2 jenis :
            1. Widening Casting (Otomatis) :
                byte->short->int->long->float->double
            2. Narrowing Casting (Manual) :
                double->float->long->int->char->short->byte
            itu aturannya : dari kiri ke kanan bisa otomatis
            tapi kalo sebaliknya harus konversi manual
            because ingat itu semua yang membadakan adalah ukurannya!
        */

        //konversi otomatis
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        System.out.println("konversi Otomatis : "+iniInt); //10

        //konversi manual (berhasil)
        int iniInt2 = 10;
        byte iniByte2 = (byte) iniInt2;
        System.out.println("Manual Berhasil : "+iniByte2); //10
        
        //konversi manual (gagal) //number overflow
        int iniInt3 = 1000;
        byte iniByte3 = (byte) iniInt3;
        System.out.println("Manual Gagal : "+iniByte3); //-24
    }
}
