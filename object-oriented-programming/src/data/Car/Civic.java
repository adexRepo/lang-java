package data.Car;

public class Civic implements Car {
    
    @Override // abaikan dulu @override ini
    public void drive() {
        // method ini dari Car.java
        System.out.println("Avanza is driving");
    }

 
    @Override // abaikan dulu @override ini
    public int getTire() {
        // method ini dari Car.java
        return 4;
    }

    @Override // abaikan dulu @override ini
    public String getBrand() {
        // method ini dari Hashbrand.java
        // Hashbrand adalah bapaknya si Car
        return "Avanza";
    }

    @Override // abaikan dulu @override ini
    public boolean isModification() {
        // method ini dari Modification.java
        return true;
    }


    public boolean countSheet() {
        // default method ini tidak wajib di override
        // tapi dia otomatis di copas di setiap child class nya si car ini
        // kyk di class Avanza
        return false;
    }
}
