package app;
public class Equals_Method_For_Object_26 {
    /* -------------------------------------------------------------------------- */
    /*                       THEORY EQUALS METHOD FOR OBJECT                      */
    /* -------------------------------------------------------------------------- */

    /*
     * Hal yang agak membingungkan di Java adalah, cara membandingkan object,
     * Di bahasa pemrograman lain, untuk mengecek apakah sebuah object sama, biasanya kita menggunakan == operator.
     *  di java, operator == hanya untuk mengecek data primitif, seperti integer, boolean, dan sebagainya.
     * Untuk non primitif pengecekan nya menggunakan method equals
     * Dan secara default, method equals itu akan membandingkan dua buah object secara bersamaan posisi object di memorynya
     * Artinya jika kita membuat 2 object yang isi field nya sama, tetap dianggap berbeda oleh method equals,
     *  karena perbandingan based on posisi memory
     * Oleh karena itu, ada baiknya kita meng-override method equals milik class Object tersebut.
     * 
     * Java itu optimize memory, klo isinya sama secara initialnya maka akan true; sysout a,b,c == kalo dibandingkan sama
     * tapi jika a di operatorkan == dengan e maka hasilnya false, karena initialnya berbeda, a secara langsung adek trarara,
     * sedangkan e didapat dari gabungan d dan e
     * 
     */

    public static void main(String[] args) {
        String a = "adek trarara";
        String b = "adek trarara";
        String c = b;
        String d = "adek";
        String e = d +" "+"trarara";
        // * Java itu optimize memory, klo isinya sama secara initialnya maka akan true; sysout a,b,c == kalo dibandingkan sama
        // * tapi jika a di operatorkan == dengan e maka hasilnya false, karena initialnya berbeda, a secara langsung adek trarara,
        // * sedangkan e didapat dari gabungan d dan e
        System.out.println(a == b); // true
        System.out.println(a == c); // true
        System.out.println(a == e); // false

        // equals
        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(c)); // true
        System.out.println(a.equals(e)); // true
    }
    
}
