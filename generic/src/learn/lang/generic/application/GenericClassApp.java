package learn.lang.generic.application;

import learn.lang.generic.MyData;

public class GenericClassApp {
    
    public static void main(String[] args) {
        
        MyData<String> stringData = new MyData<String>("Datas");
        MyData<Integer> integerData = new MyData<Integer>(5);
        // dua diatas bisa akses MyData padahal tipe data nya berbeda
        // ini karena tipe data generic di dalam class MyData

        String str = stringData.getData(); 
        Integer ints = integerData.getData();


        System.out.println(str);
        System.out.println(ints);
    }


}
