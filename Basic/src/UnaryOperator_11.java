public class UnaryOperator_11 {
    public static void main(String[] args){
        // Unary Operator
        /* 
            1. a = a + 1  => ++a    (increment)
            2. a = a - 1  => a--    (decrement)
            3. a = +a     => +a     (positif)
            4. a = -a     => -a     (negatif)
            5. a = !a     => !a     (logical not)

            intinya ini juga mempersingkat
        */

        int a = 10;
        System.out.println("increment :"+ ++a);   
        System.out.println("decrement :"+ --a);  
        System.out.println("positif :"+ +a);   
        System.out.println("negatif :"+ -a);    
    }
}
