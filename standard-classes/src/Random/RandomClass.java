package Random;

import java.util.Random;

public class RandomClass {
    /* ------------------------------ Random Class ------------------------------ */
    /*
     * Random class adalah class yang bisa kita gunakan untuk mengenerate random
     * number.
     * 
     * Lengkapnya:
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Random.html
     */

     public static void main(String[] args) {
        
        Random random = new Random();

        var count = 1000;
        for (int i = 0; i < count; i++) {
            
            int val = random.nextInt(count);
            System.out.println(val);
        }


     }
}
