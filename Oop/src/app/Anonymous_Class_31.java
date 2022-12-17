package app;

import data.HelloWorld;

public class Anonymous_Class_31{

    /* -------------------------------------------------------------------------- */
    /*                              CLASS TANPA NAMA                              */
    /* -------------------------------------------------------------------------- */

    /*
     * Anonymous Class artinya class tanpa nama
     * Adalah kemampuan java mendeklarasikan class, sekaligus menginstansiasi object-nya secara langsung
     * Anonymous class sebenarnya termasuk inner class, dimana outer classnya adalah tempat dimana
     * kita membuat anonymous class tersebut.
     * Anonymouse class sangat cocok ketika kita berhadapan dengan kasus membuat implementasi interface
     * atau abstract class sederhana, tanpa harus membuat implementasi class nya.
     * 
     * Contoh dibawah ini adalah pembuatan class langsung dari interface nya tanpa harus buat class konkritnya.
     * orang adalah object dari class yang tidak ada namanya karena langsung dibuat dari interface HelloWorld 
     * 
     * Kekurangannya adalah tidak bisa di re-use class nya, karena hanya dibuat di satu class aja
     */


    public static void main(String[] args) {
        HelloWorld orang = new HelloWorld() {

            @Override
            public void sayHello() {
                System.out.println("Hallo Manusia");
            }
            
            @Override
            public void sayHello(String name) {
                System.out.println("Hallo Manusia bernama " + name);
                
            }
            
        };

        orang.sayHello();
        orang.sayHello("dupin");
    }

}