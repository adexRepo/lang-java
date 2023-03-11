package app;

import data.Product.Level;

public class Enum_Class_35 {
    /* -------------------------------------------------------------------------- */
    /*                                 ENUM CLASS                                 */
    /* -------------------------------------------------------------------------- */

    /*
     * Saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis-jenis data yang nilainya terbatas
     * Misal, gender, ada male dan female, atau tipe customer, ada standart, premium, atau vip dan lain-lain
     * 
     * Dalam kasus seperti ini, kita bisa menggunakan enum class, yaitu class yang berisikan nilai-nilai terbatas
     * yang sudah ditentukan
     * 
     * Saat membuat enum class, secara otomatis dia akan meng-extends class java.lang.Enum, oleh karena itu 
     * class enum tidak bisa di extend class lain, namun masih tetap bisa implements interface.
     * 
     * data.product.Level = enum class
     * 
     * // ENUM MEMBERS
     * Sama seperti class biasanya, di class enum pun kita bisa menambahkan members(field,method,dan costructor)
     * khusus untuk constructor, kita tidak bisa membuat public constructor, karena memang tujuan enum bukan untuk
     * di instansiasi secara bebas.
     */



    public static void main(String[] args) {
        Customer cust =  new Customer(
            Level.PREMIUM,"ADek"
        );

        System.out.println(cust.getName());
        System.out.println(cust.getLevel());
        System.out.println(cust.getLevel().getDescription());


        String levelName = Level.VIP.name();
        System.out.println(levelName);
        
        Level level = Level.valueOf("PREMIUM"); // kalo saat conversi salah maka error
        System.out.println(level);

        for (var item : Level.values()) {
            System.out.println("------------------");   
            System.out.println(item);   
        }

    }
}


class Customer {
    Level level;
    String name;
    
    Customer(Level level, String name){
        this.name = name;
        this.level = level;
    }

    public String getName(){
        return this.name;
    }
    public Level getLevel(){
        return this.level;
    }
}