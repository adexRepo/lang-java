package data.Car;

public class Avanza implements Car ,Maintenance {

    // NOTE WAJIB MENG IMPLEMENT SEMUA METHOD YANG ADA DI INTERFACE CAR

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
    public boolean IsMaintenances() {
        // method ini dari IsMaintenance.java
        return true;
    }

    @Override // abaikan dulu @override ini
    public boolean isModification() {
        // method ini dari Modification.java
        return true;
    }

    // NOTE OVERRIDE ADALAH PENDEKLARASIAN ULANG!
}
