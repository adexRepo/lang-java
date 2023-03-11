package data.Car;

public interface Car extends HasBrand, Modification {

    // cara 1
    public abstract void drive();

    // cara 2
    int getTire();

    // secara default di cara 2 sudah otomatis ada public abstract

    // default method
    default boolean countSheet() {
        // default method ini tidak wajib di override
        // tapi dia otomatis di copas di setiap child class nya si car ini
        // kyk di class Avanza
        return false;
    }
}
