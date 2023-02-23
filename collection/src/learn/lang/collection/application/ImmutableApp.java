package learn.lang.collection.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {

    public static void main(String[] args) {

        List<String> justOneAja = Collections.singletonList("Adex");
        List<String> emptyList = Collections.emptyList();
        List<String> mutable = new ArrayList<>();
        mutable.add("adek");
        mutable.add("adek");
        mutable.add("adek");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> element = List.of("Eko", "Kurniawan", "Khannedy");
        // element.add("null");// error
        System.out.println("justOneAja : " + justOneAja);
        System.out.println("emptyList  : " + emptyList );
        System.out.println("mutable    : " + mutable   );
        System.out.println("immutable  : " + immutable );
        System.out.println("element    : " + element   );

    }

}
