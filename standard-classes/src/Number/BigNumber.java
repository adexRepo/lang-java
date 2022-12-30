package Number;

import java.math.BigInteger;

public class BigNumber {
    /* ------------------------------- Big Number ------------------------------- */

    /*
     * Jika kita ada kebutuhan untuk menggunakan angka yang besar sehingga melebihi
     * kapasitas Long dan Double, di java sudah disediakan class untuk handle data
     * besar tersebut.
     * BigInteger adalah class untuk handle tipe data Integer jika, dan
     * BigDecimal adalah class untuk handle tipe data floating point / Double.
     * 
     * Lengkapnya:
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/math/BigInteger.html
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/math/BigDecimal.html
     * 
     * Operator matematika yang dipakai di BigInteger dan BigDecimal
     * add          >> untuk penjumlahan +
     * subtract     >> untuk pengurangan -
     * multiply     >> untuk perkalian *
     * devide       >> untuk pembagian /
     * mod          >> untuk sisa bagi %
     * dls
     */

     public static void main(String[] args) {
        BigInteger a = new BigInteger("1000000000000000000000000000");
        BigInteger b = new BigInteger("1000000000000000000000000000");

        BigInteger c = a.add(b);

        System.out.println(c); //2000000000000000000000000000
     }
}
