package data;

public class Constant {

    public static final String APPLICATION = "TRALALALA";
    public static final int VERSION_NO = 1;
    public static final int PROCESSOR;

    static{
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
    
}
