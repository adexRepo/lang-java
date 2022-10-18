package Module.Product;

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

    }
}
