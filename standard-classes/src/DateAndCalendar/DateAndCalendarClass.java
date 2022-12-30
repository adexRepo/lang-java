package DateAndCalendar;

import java.util.Calendar;
import java.util.Date;

public class DateAndCalendarClass {
    /* ------------------------- Date And Calendar Class ------------------------ */
    /*
     * Class Date adalah class representasi tanggal sampai presisi milisecond
     * Namun di class Date sudah banyak method-method yang di deprecated, sehingga
     * untuk memanipulasi data tanggal, kita sekarang harus melakukan kombinasi
     * antara class Date dan Calendar.
     * Sederhananya Date untuk representasi tanggal, dan Calendar untuk memanipulasi
     * tanggal
     * 
     * Lengkapnya:
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Date.
     * html
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/
     * Calendar.html
     */

    public static void main(String[] args) {
        Date tanggal = new Date(); // by default is System.currentTimeMillis()

        System.out.println(tanggal);

        // calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,1998);
        calendar.set(Calendar.DATE, 8);
        calendar.set(Calendar.MONTH,6);



        // conversi
        Date tgl = calendar.getTime();
        System.out.println(tgl);

    }
}
