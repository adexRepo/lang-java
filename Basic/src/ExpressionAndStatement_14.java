import java.sql.Date;

public class ExpressionAndStatement_14 {
    public static void main(String[] args) {
        // Expression
        /* 
            1. Expression adalah konstruksi dari variabel, operasi dan pemanggilan method
                yang mengevaluasi menjadi sebuah single value \
            2. Expression adalah core component dari statement
            3. expresion itu part of statement
        */
        //contoh : expresion
        int value;
        value = 10;

        // Statement
        /* 
            1. Statement bisa dibilang adlaah kalimat lengkap dalam bahasa
            2. Sebuah statement berisikan execution komplit, biasanya diakhiri dengan titik koma (;)
            3. Ada beberapa jenis statement
                a. Assignments expression
                b. Penggunaan ++ and --
                c. Method invocation
                d. Object creation Statement
                e. Conditional Statement (if)
                f. Loop Statement (for while do while dls) 
                g. Return Statement (return a value)
            4. disini cuman dibahas 4 aja
        */

        //contoh : statement
        System.out.println(value + 10);

        // Assignment Statement
        double aValue = 418412.654;
        // Incremenet and Decrement
        aValue++;
        //Method Invocation
        System.out.println("Hello World");
        //Object Creation Statement
        Date date = new Date(value);


        //Block
        /* 
            1. Block adalah kumpulan statement yang terdiri dari nol atau lebih statement
            2. Block diawali dan diakhiri dengan kurung kurawal {}
        */
        //contoh : block
        { //awal block
            System.out.println("Hello World");
        } //akhir block
    }
}
