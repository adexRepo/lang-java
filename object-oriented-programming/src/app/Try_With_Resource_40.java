package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try_With_Resource_40 {
    /* -------------------------------------------------------------------------- */
    /* TRY WITH RESOURCE */
    /* -------------------------------------------------------------------------- */

    /*
     * Di java 7, terdapat fitur baru yang bernama try with resource
     * Try with resource adalah sebuah mekanisme agar kita lebih mudah menggunakan
     * resource (yang wajib di close) dalam block try
     * Jika kita ingin menggunakan fitur ini, kita wajib menggunakan interface
     * AutoClosable
     */

     public static void main(String[] args) {
        // NOTE DENGAN TRY WITH RESOURCE
        try (BufferedReader reader1 = new BufferedReader(new FileReader("README.MD"))){
            while (true) {
                String line = reader1.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
        }
        catch (Exception err) {
            System.out.println("Error membaca file");
            err.printStackTrace();
        }

        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");

        // NOTE TANPA TRY WITH RESOURCE
        BufferedReader reader2 = null;
        try {
            reader2 = new BufferedReader(new FileReader("README.MD"));

            while (true) {
                String line = reader2.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
        }
        catch (Exception err) {
            System.out.println("Error membaca file");
            err.printStackTrace();
        }finally{
            if(reader2 != null){
                try {
                    reader2.close();
                    System.out.println("Success Menutup");
                }
                catch (IOException err) {
                    System.out.println("Error menutup resurce!");
                    err.printStackTrace();
                }
            }
        }
     }
    
}
