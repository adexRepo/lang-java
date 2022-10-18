public class RecursiveMethod_30 {
    public static void main(String[] args) {
        // Recursive Method
        /* 
            1. Recursive method adalah kemampuan method memambil method dirinya sendiri.
            2. Kadang memamng ada banyak problem, yang lebih mudah diselesaikan menggunakan recursive method.
                seperti kasus factorial, fibonacci, dan lainnya.
        */
        //lihat method dibawah ini dulu part 1
        System.out.println("Recursive Method");
        System.out.println(factorialLoop(5));
        System.out.println("========================");
        System.out.println(factorialRecursive(5));
        System.out.println("========================");


        //Problem Dengan Recursive Method
        /* 
            1. Walaupun recursive method itu sangat menarik, namun kita perlu berhati-hati guys
            2. Jika recursive terlalu dalam, maka akan ada kemungkinan terjadi error StackOverflowError,
                yang berarti recursive terlalu dalam.
            3. Kenapa problem ini bisa terjadi ?, karena ketika kita memanggil diri sendiri, Java akan menyimpan
                dalam stack, jika method tersebut memanggil method lain, maka stack akan menumpuk terus,
                dan jika terlalu dalam, maka stack memori akan terlalu besar, lalu akhirnya error StackOverflowError.
            4. Untuk besarannya bisa berbeda beda tiap error
            5. lihat method error di part 2 dibawah ini :
        */

        //lepas comment dibawah ini kalo mau lihat error nya
        //loopError(9000); //disini stackoverflow +-
    }

    // PART `1`
    // Tanpa Recursive Method / dengan Loop

    static int factorialLoop(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int fibbonaciLoop(int n){
        int result = 0;
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    //====================================================================

    // Dengan Recursive Method
    static int factorialRecursive(int n){
        if(n == 1){
            return 1;
        }
        return n * factorialRecursive(n-1);
    }

    static int fibbonaciRecursive(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return fibbonaciRecursive(n-1) + fibbonaciRecursive(n-2);
    }

    //====================================================================

    // PART `2`
    static void loopError(int value){
        if (value == 0){
            System.out.println("Selesai");
        }else{
            System.out.println("Loop : "+value);
            loopError(value-1);
        }
    }
}
