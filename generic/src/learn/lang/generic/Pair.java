package learn.lang.generic;

public class Pair<X,Y> {
    
    private X key;
    private Y value;

    public Pair(X key, Y value) {
        this.key = key;
        this.value = value;
    }

    public X getKey() {
        return this.key;
    }

    public void setKey(X key) {
        this.key = key;
    }

    public Y getValue() {
        return this.value;
    }

    public void setValue(Y value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "{" +
            " key='" + getKey() + "'" +
            ", value='" + getValue() + "'" +
            "}";
    }


}
