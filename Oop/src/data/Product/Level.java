package data.Product;

public enum Level {
    STANDART("Standart Level"),
    PREMIUM("Premium Level "),
    VIP("VIP level ");


    private String description;

    Level(String description){
        this.description = description;
    }


    public String getDescription(){
        return this.description;
    }
}
