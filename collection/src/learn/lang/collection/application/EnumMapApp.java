package learn.lang.collection.application;

import java.util.EnumMap;

public class EnumMapApp {
    
    public static enum Level{
        FREE,STANDARD,PREMIUM,VIP
    }

    public static void main(String[] args) {
        EnumMap<Level,String> map = new EnumMap<>(Level.class);
        map.put(Level.FREE, "Gratis");
        map.put(Level.STANDARD, "Biasa aja");
        map.put(Level.PREMIUM, "Berbayar");
        map.put(Level.VIP, "Bayar Mahal");

        System.out.println(map.get(Level.FREE));
        System.out.println(map.get(Level.STANDARD));
        System.out.println(map.get(Level.PREMIUM));
        System.out.println(map.get(Level.VIP));
    }

}
