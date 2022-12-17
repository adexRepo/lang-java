package data.Product;

import java.util.Objects;

public class Product03 
{
    public String name;
    private int price;

    public Product03(String name, int price)
    {
        this.name = name;
        this.price = price;
    }


    @Override
    public boolean equals(Object o) 
    {
        if (o == this)
            return true;
        if (!(o instanceof Product03)) {
            return false;
        }
        Product03 product03 = (Product03) o;
        return Objects.equals(name, product03.name) && price == product03.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }


    // public boolean equals(Object o){
    //     if(o == this){
    //         return true;
    //     }

    //     if(!(o instanceof Product03)){
    //         return false;
    //     }

    //     Product03 product = (Product03) o;

    //     if(this.price != product.price){
    //         return false;
    //     }

        
    //     if(this.name != null){
    //         return this.name.equals(product.name);
    //     }else{
    //         return product.name == null;
    //     }
    // }

}
