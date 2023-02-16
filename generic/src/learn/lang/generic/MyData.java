package learn.lang.generic;


public class MyData<T> {
 
    private T data;

    public MyData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "{" +
            " data='" + getData() + "'" +
            "}";
    }


}
