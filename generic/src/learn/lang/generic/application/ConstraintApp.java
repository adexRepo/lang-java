package learn.lang.generic.application;

public class ConstraintApp {
    
    public static void main(String[] args) {
        
        NumberData<Integer> intNumberData = new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(1L);
        
        // try error
        // NumberData<String> strNum = new NumberData<String>(1L);

        System.out.println(intNumberData);
        System.out.println(longNumberData);

    }

    // public static class NumberData<T extends Object>{ // default
    public static class NumberData<T extends Number>{  // single bounded type param
        private T data;

        public NumberData(T data){
            this.data = data;
        }

        public T getData(){
            return data;
        }
        
        public void setData(T data){
            this.data = data;

            // method yang ada di number bisa diakses di akses
            // sedangkan string bool dls tidak bisa diakses
        }

    }


}
