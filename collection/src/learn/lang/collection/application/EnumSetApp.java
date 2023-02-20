package learn.lang.collection.application;

import java.util.EnumSet;

public class EnumSetApp {
    
    public static enum Gender{
        MALE,FEMALE,NOT_MENTION
    }

    public static void main(String[] args) {
        
        EnumSet<Gender> genders1 = EnumSet.allOf(Gender.class);
        EnumSet<Gender> genders2 = EnumSet.of(Gender.MALE,Gender.NOT_MENTION,Gender.NOT_MENTION);

        for (Gender gender : genders1) {
            System.out.println(gender);
        }
        
        for (Gender gender : genders2) {
            System.out.println(gender);
        }
        
        // cara dapatkan semua enum bisa juga gini
        Gender[] values = Gender.values();
        
        for (Gender gender : values) {
            System.out.println(gender);
        }


    }

}
