package application;

import java.util.ArrayList;
import java.util.List;

public class CollectionRemoveIfApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("adek","Kristiyanto","laper","banget"));

        /* -------------------------- with anonymouse class ------------------------- */
        // names.removeIf(new Predicate<String>(){
        //     @Override
        //     public boolean test(String val) {
        //         return val.length() > 5;
        //     }
        // });
        
        /* ------------------------------- with lambda ------------------------------ */
        names.removeIf(val-> val.length() > 5);

        System.out.println(names.toString());

    }
}
