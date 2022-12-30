package Number;

public class MathClass {
    /* ------------------------------- Math Class ------------------------------- */
    /*
     * Class Math merupakan class utilities yang berisikan banyak sekali static
     * method untuk perasi numerik, seperti trigonometri, logarithm, akar pangkat,
     * dan lain-lain. ada buanyak banget!
     * 
     * Lengkapnya:
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/Math.html
     */


    public static void main(String[] args) {

        var mins = Math.min(1000, 230);
        System.out.println(mins);

        var max = Math.max(1000, 230);
        System.out.println(max);

        var pi = Math.PI;
        System.out.println(pi);

        var ceil = Math.ceil(32.45);
        System.out.println(ceil);

        var floor = Math.floor(32.45);
        System.out.println(floor);
    }
}
