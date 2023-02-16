package learn.lang.generic.application;

import learn.lang.generic.MyData;

public class InvariantApp {
    
    public static void main(String[] args) {
        
        MyData<String> strData = new MyData<>("Adex"); // diamon di kanan tidak wajib ada sejak java 8
        // eat(strData);  // error compilation: cannot convert from MyData<Object> to MyData<String>
        // artinya disini dia gabisa polymorphism 
        System.out.println(strData.getData());
        
        // MyData<Object> obj = strData; // error compilation: cannot convert from MyData<String> to MyData<Object>
        
        MyData<Object> intData = new MyData<>(10023); // diamon di kanan tidak wajib ada sejak java 8
        // eater(intData); // error :
        // The method eater(MyData<Integer>) in the type InvariantApp is not applicable for the arguments (MyData<Object>)Java(67108979)
        System.out.println(intData.getData());

    }

    public static void eat(MyData<Object> objMyData){
        // do something cool!.
    }
    public static void eater(MyData<Integer> objMyData){
        // do something cool!.
    }


}
