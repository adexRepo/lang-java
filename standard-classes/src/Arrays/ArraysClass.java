package Arrays;

import java.util.Arrays;

public class ArraysClass {
    /* ------------------------------ Arrays CLass ------------------------------ */
    /*
     * Arrays class adalah class yang berisikan static method yang bisa kita gunakan
     * untuk memanipulasi data array, seperti pencarian dan pengurutan.
     * 
     * Lengkapnya:
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Arrays.html
     * 
     * Contoh:
     *   binarySearch(array, value)     >> Mencari value di array
     *   copyOf(...)                    >> Menyalin data array
     *   equals(array1, array2)         >> Membandingkan array1 dan array2
     *   sort(array)                    >> Mengurutkan array
     *   toString(array)                >> Mengembalikan representasi string
     */

    public static void main(String[] args) {
        
        String[] arrString = {"a","c","b","x","a","x","z"};
        int[] arrInt = {1,2,3,4,5,623,23,231,31,531,2,43};

        Arrays.sort(arrInt);
        Arrays.sort(arrString);
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(arrString));
        System.out.println(Arrays.binarySearch(arrInt, 623));
        System.out.println(Arrays.binarySearch(arrInt, 1));
        System.out.println(Arrays.binarySearch(arrInt, 100)); // -negatif there is no


        String[] stringsCopy = Arrays.copyOf(arrString, arrString.length);
        int[] intCopy = Arrays.copyOfRange(arrInt, 4,10);
        System.out.println(Arrays.toString(stringsCopy));
        System.out.println(Arrays.toString(intCopy));


        int[] arrInt2 = {1,2,3,4,5,623,23,231,31,531,2,43};
        Integer[] arrInt3 = {1,2,3,4,5,623,23,231,31,531,2,43};
        Integer[] arrInt4 = {1,2,3,4,5,623,23,231,31,531,2,43};
        // arrInt sudah di sort coba di qual dengan ini 

        boolean isSame1 = arrInt3.equals(arrInt4); // membandingkan lokasi
        boolean isSame2 = Arrays.deepEquals(arrString, stringsCopy); // true
        boolean isSame3 = Arrays.equals(arrInt, arrInt2); // membandingkan isi
        Arrays.sort(arrInt2);
        boolean isSame4 = arrInt3.equals(arrInt4); // membandingkan lokasi
        boolean isSame5 = Arrays.deepEquals(arrString, stringsCopy); // true
        boolean isSame6 = Arrays.equals(arrInt, arrInt2);  // membandingkan isi

        System.out.println("-----------------------------------------");
        System.out.println("isSame1 : "+ isSame1);
        System.out.println("isSame2 : "+ isSame2);
        System.out.println("isSame3 : "+ isSame3);
        System.out.println("isSame4 : "+isSame4);
        System.out.println("isSame5 : "+isSame5);
        System.out.println("isSame6 : "+isSame6);


    }

}
