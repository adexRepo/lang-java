package app;
import data.employe.Employee;
import data.employe.Manager;
import data.employe.VicePresident;

public class Type_Check_And_Cast_15 {
    /* -------------------------------------------------------------------------- */
    /*                   THEORY TYPE CHECK AND CONVERSION (CAST)                  */
    /* -------------------------------------------------------------------------- */


    /*
     * Sebelumnya kita sudah tau cara melakukan konversi tipe data (cast) di tipe data primitif
     * Casts juga bisa digunakan untuk tipe data bukan primitif
     * Namun agar aman, sebelum melakukan casts, pastikan melakukan type check (Pengecekan tipe data)
     *  dengan menggunakan kata kunci instanceof
     * Hasil Operator instanceof adalah boolean, true jika tipe data sesuai, false jika tidak
     * 
     * lihat Module/Employee
     */

     public static void main(String[] args) {
        
        sayHello(new Employee("ADEX"));
        sayHello(new Manager("SASUKE"));
        sayHello(new VicePresident("JONI"));
     }



     static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello, cast employee to vicePresident " + vicePresident.name);
        }else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello, cast employee to manager " + manager.name);
        }else{
            System.out.println("Hello " + employee.name);
        }
     };
}
