package learn.lang.generic.application;

import learn.lang.generic.MyData;

public class TypeErasureApp {
    
    public static void main(String[] args) {
        
        // disini tidak error tapi ada warning
        MyData myData = new MyData("Adex");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        // integerMyData.setData(10);
        Integer integer = integerMyData.getData();

        // inti nya type erasure itu seperti line 10, secara compile tidak error
        // namun saat di runtime error
        // but banyak warning

    }


}
