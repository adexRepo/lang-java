package learn.lang.generic;
public class Code_With_Generic {
    
    public static void main(String[] args) {
        
        Data<String> str = new Data<String>();
        str.setData("Test With Generic");
        String value = str.getData(); 
        System.out.println(value);
    }


    public static class Data<T>{
        private T data;

        public T getData(){
            return data;
        }

        public T setData(T data){
            return this.data = data;
        }

    }

}
