package learn.lang.generic.application;

import learn.lang.generic.MyData;

public class WildcardApp {
    
    public static void main(String[] args) {
        
        MyData<String> strMyData = new MyData<String>("Adex");
        MyData<Integer> intMyData = new MyData<Integer>(30);

        printLength(strMyData);
        printLength(intMyData);

    }

    public static void printLength(MyData<?> data){
        System.out.println(data.getData());
    }

}
