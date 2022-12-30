package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
    // * ---------------------------- Properties Class ----------------------------
    // *
    // * Kebanyakan Programmer Java akan menyimpan konfigurasi file dalam bentuk
    // * properties file.
    // * Properties file adalah file yang berisi key value yang dipisahkan dengan
    // * tanda sama dengan (=).
    // * Properties file bisa kita gunakan untuk menyimpan konfigurasi di aplikasi
    // * kita.
    // *
    // * Properties Class adalah class yang bisa kita gunakan untuk mengambil atau
    // * menyimpan informasi ke file properties
    // * 
    // * Lengkapnya :
    // * https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Properties.html
    // *

    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            // readfile
            properties.load(new FileInputStream("aplication.properties"));

            // get data
            System.out.println(properties.getProperty("database.host"));
            System.out.println(properties.getProperty("database.password"));

            // input data
            properties.put("database.version", "14045");

            // membuat baru file .properties : by default kalo diluar gaada maka akan dibuat baru
            properties.store(new FileOutputStream("name.properties"), "Konfigurasi"); 

            System.out.println(properties.getProperty("database.version"));
        }
        catch (FileNotFoundException err) { // file tidak ketemu
            System.out.println(err.getMessage());
        }catch (IOException e){ // salah input
            System.out.println(e.getMessage());

        }
    }
}
