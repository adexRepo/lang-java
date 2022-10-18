public class DoWhileLoop_22 {
    public static void main(String[] args) {
        // Do While loop
        /* 
            1. Do While loop adlaah perulangan yang mirip dengan while loop
            2. Perbedaannya hanya pada pengecekan kondisi
            3. Pengecekan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan
                sedangkan Do While loop dilakukan di awal setelah perulangan pertama dilakukan
            4. Oleh karena itu dalam do while loop, minimal pasti perulangan akan di lakukan
                sekali, walaupun kondisi kondisi tidak terpenuhi / false
        */

        int i = 100;
        //int i = 0;
        do {
            System.out.println("Perulangan ke - : "+i);
            i++;
        } while (i < 10); // kondisi perulangan

        // ini cuman di akses sekali karena si i sudah lebih besar dari 10
    }
}
