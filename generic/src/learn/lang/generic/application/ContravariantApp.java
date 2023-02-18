package learn.lang.generic.application;

import learn.lang.generic.MyData;

public class ContravariantApp {
    
    public static void main(String[] args) {
        
        MyData<Object> objectMyData = new MyData<>("Freed");//1
        objectMyData.setData(1); // 2
        MyData<? super String> myDataStr = objectMyData;//3
        process(objectMyData);
        // process(myDataStr);
        
        System.out.println(myDataStr.getData());
        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData){
        String valStr = (String)myData.getData(); // will be error
        System.out.println(valStr);

        myData.setData("uncle bob");
    }

    // NOTE
    // semuanya terlihat aman2 saja saat compile, but saat runtime akan terjadi error
    // di Line 8 sudah jelas objectMyData isi nya String, 
    // lalu kita ubah di line 9 menjadi Integer / 1 ,, disini tidak ada masalah karena Integer
    // superclass nya adalah Object, artinya objectMyData akan menerima nilai Integer tersebut.
    // dan data "Freed" dihapus menjadi "1"
    // lalu saat di Line 11, objectMyData dimasukkan kedalam variable dengan tipe <? super String>
    // hal ini compiler tidak mengaggap error, karena <? super String> superType class nya adalah object
    // dan hal itu benar. lalu pada line 12 dipanggil method proses dan didalamnya (pada line 20) mencoba getData 
    // dengan melakukan cast ke String,, looh kenapa wajib cast ? karena isinya type nya Object
    // parameter myData pada method proses bisa menerima 2 yaitu String dan Object.
    // alhasil wajib melakukan casting pada method get nya.. 
    // daaaann saat program di runn Woaaala..!
    // class java.lang.Integer cannot be cast to class java.lang.String 
    // at learn.lang.generic.application.ContravariantApp.process(ContravariantApp.java:20)
}
