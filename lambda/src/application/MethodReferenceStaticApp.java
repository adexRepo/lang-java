package application;

import java.util.function.Predicate;

import util.IsLowerChecker;

public class MethodReferenceStaticApp {
    public static void main(String[] args) {

        /* --------------------- lambda without method reference -------------------- */
        Predicate<String> predicateIsLower1 = (val) -> IsLowerChecker.isLowerCase(val);
        System.out.println(predicateIsLower1.test("Adex"));
        System.out.println(predicateIsLower1.test("adex"));

        System.out.println("");
        /* ----------------------- lamda with method reference ---------------------- */
        Predicate<String> predicateIsLower2 = IsLowerChecker::isLowerCase; 
        System.out.println(predicateIsLower2.test("Adex"));
        System.out.println(predicateIsLower2.test("adex"));
        // * generic type nya wajib sama dan jumlah parameternya harus 1

    }
}
