package learn.lang.collection.collection;

public class SimpleSingletonCounter {
    
    private static SimpleSingletonCounter init;
    private long counter = 0L;

    private SimpleSingletonCounter(){}

    // public static  SimpleSingletonCounter getObj(){
    public static synchronized SimpleSingletonCounter getObj(){
        return (init == null) ? new SimpleSingletonCounter() : init;
    }

    public void increment() {
        counter++;
    }

    public long getCounter() {
        return counter;
    }

}
