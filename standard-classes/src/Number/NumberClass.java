package Number;

public class NumberClass {
    /* ------------------------------ Number Class ------------------------------ */
    /*
     * Semua number class yang bukan primitif memiliki parent class yang sama, yaitu class Number.
     * Class Number memiliki banyak method yang bisa digunakan untuk mengkonversi ke tipe number lainnya.
     * 
     * Hal ini dipakai saat mengkonversi satu tipe number ke tipe yang lain.
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/Number.html
     * 
     *          byte   byteValue  () Returns the value of the specified number as a  byte  .
     * abstract double doubleValue() Returns the value of the specified number as a  double.
     * abstract float  floatValue () Returns the value of the specified number as a  float .
     * abstract int    intValue   () Returns the value of the specified number as an int   .
     * abstract long   longValue  () Returns the value of the specified number as a  long  .
     *          short  shortValue () Returns the value of the specified number as a  short .
     * 
     * Konversi String to Number
     * Long, Integer, Short, dan Byte memiliki static method untuk melakukan konversi dari String ke number.
     * parseXxx(string) digunakan untuk mengkonversi dari string ke tipe data number primitif.
     * valueOf(string) digunakan untuk mengkonversi dari string ke tipe data number non primitif.
     * Method ini akan throw NumberFormatException jika ternyata gagal melakukan konversi string ke number.
     * tenang saja error ini, error runtime jadi gaperlu di try catch.
     * 
     */

    public static void main(String[] args) {
        Integer intValue = 10;

        Long   longValue   = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short  shortValue  = doubleValue.shortValue();

        System.out.println("intValue    : "+ intValue);
        System.out.println("longValue   : "+ longValue  );
        System.out.println("doubleValue : "+ doubleValue);
        System.out.println("shortValue  : "+ shortValue );


        System.out.println("------------------------------" );

        // String to Number
        String strNum = "10000";
        String strNumErr = "100XC00";

        Integer intObj      = Integer.valueOf (strNum);
        Integer intObjErr   = Integer.valueOf (strNumErr);
        Double  doubleObj   = Double .valueOf (strNum);
        Short   shortObj    = Short  .valueOf (strNum);
        Float   floatObj    = Float  .valueOf (strNum);
        int     intPrimitif = Integer.parseInt(strNum);

        System.out.println("intObj      : "+intObj      );
        System.out.println("doubleObj   : "+doubleObj   );
        System.out.println("shortObj    : "+shortObj    );
        System.out.println("floatObj    : "+floatObj    );
        System.out.println("intPrimitif : "+intPrimitif );
        
        // err
        System.out.println("intObj      : "+intObjErr   );
    }

}
