package learn.lang.generic.application;

import learn.lang.generic.MyData;

public class CovariantApp {
    
    public static void main(String[] args) {
        
        MyData<String> strData = new MyData<>("Adex");
        running(strData);

        MyData<? extends Object> myData = strData;

        System.out.println(myData.toString());

    }

    public static void running(MyData<? extends Object> myData){
        // do somethong.
        // dibacanya method ini bisa meneripa data apapun selama dia extend dari si Object.

        System.out.println(myData.getData()); 
        // myData.setData("myData"); // error
        // di get data sudah jelas kalo dia valuenya adalah "Adex" / tipe nya String
        // jikalau covariant dibolehin method set nya maka 1 / tipe data Integer juga akan diterima
        // karena Integer juga extends dari Object
        // jadi wajar kalo dia gadibolehin setData.
    }

}
