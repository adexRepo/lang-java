package data.Product;

public class Product02 {
    public String name;
    private int price;

    public Product02(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void sayWoy(){
        System.out.println("Woy");
        System.out.println(this.name);
        System.out.println(this.price);
    }

    public String toString() { // mengcustom method toString() khusus untuk product02
        return "Product name : " + this.name + " Price : " + this.price;
    }
}
