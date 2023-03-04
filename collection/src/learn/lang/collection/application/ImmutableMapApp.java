package learn.lang.collection.application;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    
    public static void main(String[] args) {
        
        Map<String,String> name1 = Collections.emptyMap();

        Map<String,String> name2 = Collections.singletonMap("name","joni");

        Map<String,String> name3 = Map.of(
            "firstName","adek",
            "middleName","Kristiyanto",
            "roleName","Fullstack Developer"
        );

        Map<String,String> mutable = new HashMap<>();
        mutable.put("force1", "add1");
        mutable.put("force2", "add2");
        mutable.put("force3", "add3");
        Map<String,String> immutable = Collections.unmodifiableMap(mutable);

        name1.put("forceX", "add"); // error UnsupportedOperationException
        name2.put("forceX", "add"); // error UnsupportedOperationException
        name3.put("forceX", "add"); // error UnsupportedOperationException
        immutable.put("forceX", "add"); // error UnsupportedOperationException

    }

}
