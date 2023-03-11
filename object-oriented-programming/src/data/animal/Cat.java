package data.animal;

public class Cat extends Animal{
    
    public void eat(){ // wajib karena Cat anak dari Animal yang class abstract
        System.out.println(name + " Now Eating");
    }
    
}
