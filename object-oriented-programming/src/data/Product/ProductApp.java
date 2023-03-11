package data.Product;

public class ProductApp {

    public static void main(String[] args) {
    
        // * Product App ada di dalam package Module.Product
        Product01 product = new Product01();
        product.name = "Product";
        product.price = 10000;
        
        System.out.println("Name : " + product.name);
        System.out.println("Price : " + product.price);

        // Product02 product2 = new Product02();
        // functionPrivate(); // err karena private

        // equals
        System.out.println("EQUALS");
        Product03 product3A = new Product03("kopi",300000);
        Product03 product3B = new Product03("kopi",300000);
        System.out.println(product3A.equals(product3B)); // jadi true, karena si equals sudah di override di rp

        // hashcode
        System.out.println("HASHCODE");
        System.out.println(product3A.hashCode() == product3B.hashCode());

    }
}
