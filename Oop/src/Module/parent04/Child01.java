package Module.parent04;

public class Child01 extends Parent04 {
    public String name; // this field hiding name field in class parent
    
    public void doIt(){ // this method override parent04
        System.out.println("Child01 do it");
    }

    public void doIt2(){ // this method for access field name in parent04
        System.out.println("\n"); 
        System.out.println("Parent name is : " + super.name);
    }
}