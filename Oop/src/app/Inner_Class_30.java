package app;

import data.Company.Company;

public class Inner_Class_30 {
    /* -------------------------------------------------------------------------- */
    /*                                 INNER CLASS                                */
    /* -------------------------------------------------------------------------- */

    /*
     * Di java, kita bisa membuat lcass di dalam class, atau disebut inner class
     * Salah satu kasus kita membuat inner class biasanya ketika kita butuh membuat class
     * yang saling berhubungan, dimana sebuah class tidak bisa dibuat tanpa class lain
     * Misal kita perlu membuat class Employee, dimana membutuhkan class Company, maka
     * kita bisa membuat class Employee sebagai inner class Company
     * Cara membuat inner class, cukup membuatnya di dalam block class outer class lainnya.
     * 
     * Lihat data.Company.Company
     *
     * 
     * Keuntungan Pakai Inner class
     * 1. inner class dapat mengakses outerclass
     * 2. inner class dapat mengakses semua private field/method yang ada di outer class
     * 
     * Untuk mengakses object outer class nya, kita bisa menggunakan nama class outernya
     * diikuti dengan kata kunci this, misalnya Company.this
     * Dan untuk mengakses outer classnya, kita bisa menggunakan nama class outernya
     * diikuti dnegan kata kunci super, misal Company.super
     */


    public static void main(String[] args) {
        Company comp = new Company();
        comp.setName("Adex");

        // access inner class (employee) in class Company
        Company.Employee employe = comp.new Employee();
        employe.setName("Inner Class");

        System.out.println(employe.getName());
    }
}
