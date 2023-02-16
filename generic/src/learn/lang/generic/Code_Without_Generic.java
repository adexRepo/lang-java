package learn.lang.generic;
public class Code_Without_Generic {
    
    public static void main(String[] args) {
        
        Data str = new Data();
        str.setData("tralala");
        String value = (String) str.getData(); 
        // jika cast dihapus akan error , and jika ada cast string maka tidak dinamis lagi.
        // pengecekannya secara runtime bukan saat kompilasi, dan ini berbahaya
        System.out.println(value);
    }


    public static class Data{
        private Object data;

        public Object getData(){
            return data;
        }

        public Object setData(Object data){
            return this.data = data;
        }

    }

}
