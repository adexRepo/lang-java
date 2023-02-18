package learn.lang.generic.application;

public class MultipleConstraintApp {
    
    public static void main(String[] args) {
        
        // Data<Manager> managerData = new Data<>(new Manager()); // error karena manager tidak implements CanSayWoooii
        Data<VicePresident> vpData = new Data<>(new VicePresident());
        // dua diatas bisa karena pada class Data adalah covariant
        // artinya semuanya dapat diterima selama dia anaknya si Employee 

        // ini case Multiple Bounded

        System.out.println(vpData);
    }

    public static interface CanSayWoooii{
        void sayWoooi(String name);
    }

    public static abstract class Employee{
        
    }
    public static class Manager extends Employee{

    }
    public static class VicePresident extends Employee implements CanSayWoooii{

        @Override
        public void sayWoooi(String name) {
            System.out.println("WOoooiii " + name);
        }

    }

    public static class Data<T extends Employee & CanSayWoooii>{ // multiple
        private T data;

        public Data(T data){
            this.data = data;
        }

        public T getData(){
            return this.data;
        }

        public void setData(T data){
            // 
            this.data =data;
            this.data.sayWoooi("uncle fred"); // bisa diakses karena sudah implement CanSayWoooii
        }

    }

}
