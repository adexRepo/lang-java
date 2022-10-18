public class Variable_7 {
    public static void main(String[] args){
        // VARIABEL
        /* 
            1. Variabel adalah tempat untuk menyimpan data
            2. Java adalah bahasa static type, sehingga sebuah variabel hanya bisa digunakan
                untuk menyimpan tipe data yang sama, tidak bisa berubah-rubah. tidak seperti
                di PHP atau di javaScript , deklarasi variabel lalu di dimasukkan data dengan
                type data apapun
            3. Untuk membuat variabel di Java ktia bisa menggunakan nama tipe data lalu diikuti
                dengan nama variabelnya
            4. Nama Variabel tidak boleh mengandung whitespace (spasi, enter, tab).
            5. Dan tidak boleh seluruhnya number
        */

        String name;
        name = "Adex Kristiyanto";
        int age = 25;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        name = "lord Rangga"; //name diganti value nya
        System.out.println(name);

        System.out.println("-------------Kata kunci var-------------");
        //Kata Kunci Var
        /* 
            1. Sejak versi java 10. Java mendukung pembuatan variabel dengan kata kunci var
                sehingga kita tidak perlu menyebutkan tipe datanya terlebih dahulu (seperti javascript)
            2. Namun perlu diingat, saat kita ingin menggunakan kata kunci var untuk membuat variabel
                kita harus menginisialisasi value / nilai dari variabel tersebut secara langsung
        */
        //var name; //error
        var nama = "Adex anak samsul";
        var umur = 25;
        System.out.println(nama);
        System.out.println(umur);

        System.out.println("-------------Kata kunci final-------------");
        //Kata kunci final / di js const
        /* 
            1. Secara default, variabel di Java bisa diubah-ubah nilainya
            2. Jika kita ingin membuat variabel yang datanya tidak boleh diubah setelah pertama kali dibuat
                kita bisa menggunakan kata kunci final
            3. Istilah variebal seperti ini, banyak juga yang menyebutnya konstan
        */

        final String application = "Belajar Java";
        System.out.println(application);
        //coba ubah
        //application = "ehh gajadi"; //error
        //comment diatas ini silahkan dihapus akan error karena variabel application
        // menggunakan kata kunci final
    }
}
