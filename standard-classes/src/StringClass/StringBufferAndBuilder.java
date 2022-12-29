package StringClass;
public class StringBufferAndBuilder {
    /* -------------------- STRING BUFFER AND STRING BUILDER -------------------- */

    /*
     * String adalah tipe data immutable, artinya tidak bisa dirubah isinya, saat
     * kita mengubah string, sebenarnya yang dilakukan di Java adlaah membuat String
     * baru.
     * 
     * Jika kita ingin memanipulasi String dalam jumlah banyak, sangat tidak
     * disarankan menggunakan String, karena akan memakan memory yang cukup besar,
     * untuk kasus seperti ini, disarankan menggunakan StringBuffer dan String
     * Builder.
     * 
     * String Buffer vs String Builder
     * - Kemampuan StringBuffer dan StringBuilder cukup sama, bisa digunakan untuk
     * memanipulasi String. Yang membedakan adalah StringBuffer itu thread safe,
     * sedangkan StringBuilder tidak thread safe.
     * - Jika kita ingin memanipulasi String secara paralel bersamaan, disarankan
     * mengguanakn StringBuffer, namun jika tidak butuh paralel, cukup gunakan
     * StringBuilder, hal ini karena StringBuffer dibuat agar thread safe, maka
     * secara otomatis performanya lebih lambat dibandingkan StringBuilder
     * 
     * Lengkapnya:
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/
     * StringBuffer.html
     * 
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/
     * StringBuilder.html
     */

    public static void main(String[] args) {

        String name = "adek";
        name = name + " " + "kristiyanto";
        name = name + " " + "lari-larian";

        System.out.println("manual version : " + name);

        // contoh diatas sebenernya 3 memory yang dipakai atau ada 3 object
        // meskipun nama variabel nya sama. karena di Java String itu immutable

        // oleh karena itu StringBuilder dan StringBuffer ada , memorynya di 1 object
        StringBuilder str = new StringBuilder();
        str.append("adek");
        str.append(" ");
        str.append("kristiyanto");
        str.append(" ");
        str.append("lari-larian");

        System.out.println("builder version : " + str.toString());

        // * hasilnya sama tapi efisiensi memory lebih tinggi siBuilder

    }
}
