public class TipeDataArray_8 {
    public static void main(String[] args) {
        System.out.println("=============Array=============");
        String[] arrayString;
        arrayString = new String[5]; // jumlah data yang bisa ditampung
        arrayString[0] = "satu";
        arrayString[1] = "dua";
        arrayString[2] = "tiga";
        arrayString[3] = "empat";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        System.out.println(arrayString[3]);

        System.out.println("=============Inisialisasi Array=============");
        //Beberapa cara mengInisialisasi Array
        int [] arrayInt = new int[]{1, 2,3,4,5,6,7};

        String[] arrayLong = new String[]{
            "Adek", "Krist","tiyanto"
        };
        System.out.println(arrayInt[4]);
        System.out.println(arrayLong[2]);

        System.out.println("=============Operasi Array=============");
        //Operasi di Array
        /* 
        1. array[index]         --> untuk mengambil data array
        2. array[index] = value --> untuk mengubah data array
        3. array.length         --> untuk mengambil panjang array
        */

        System.out.println(arrayInt[0]);
        System.out.println(arrayInt.length);
        arrayInt[0] = 999;
        System.out.println(arrayInt[0]);
        System.out.println("=============Array dalam Array=============");

        String[][] array2D ={
            {"satu","dua","tiga"},
            {"empat","lima","enam"},
            {"tujuh","delapan","sembilan"}
        };
        System.out.println(array2D[0][2]);
        System.out.println(array2D[1][1]);
        System.out.println(array2D[2][2]);
        
    };
}