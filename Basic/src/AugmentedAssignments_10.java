public class AugmentedAssignments_10 {
    public static void main(String[] args){
        // Augmented Assignments
        /* 
            1. a = a + 1  -> a += 1
            2. a = a - 1  -> a -= 1
            3. a = a * 2  -> a *= 2
            4. a = a / 2  -> a /= 2
            5. a = a % 2  -> a %= 2

            yang kanan tanda panah adalah augmented asignment
            sedangkan yang kiri operasi matematika biasa
            inti nya augmented itu untuk mempersingkat aja
        */

        int a = 10;
        int b = 20;

        System.out.println(a += b); // 30
        System.out.println(a -= b); // -10
        System.out.println(a *= b); // 200
        System.out.println(a /= b); // 0
        System.out.println(a %= b); // 10
    }
}
