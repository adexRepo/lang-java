package application;

import java.util.function.Supplier;

public class SupplierApp {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Adek Kristiyanto - Backend";
        String name = supplier.get();
        System.out.println("name: " + name);

    }

}
