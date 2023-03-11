## Java Util Function
- Lambda ada saat versi 8, dan juga ada package baru bernama java.util.function.
- Pacakge ini berisikan banyak sekali functional interface yang bisa digunakan untuk kebutuhan lambda.
- Dengan menggunakan interface2 yang ada didalam pacakge ini, kita mungkin tidak perlu lagi
    membuat sendiri functional interface secara manual.

# Interface Consumer<T>
- ini biasanya dipakai saat perulangan forEach collection
- Dibutuhkan saat nerima aja tanpa return
- methodnya: accpet(T t)
- hanya 1 generic type yaitu tipe data
- example: src\application\ConsumerApp.java

# Interface Function<T,R>
- ada 2 generic type yaitu type nya (T), dan return nya (R)
- methodnya: R apply(T t)
- example: src\application\FunctionApp.java

# Interface Predicate<T>
- generic type nya <T> = type
- return nya boolean (primitive)
- biasanya dipakai buat ngecek , itu sebabnya method nya test(T t)
- example: src\application\PredicateApp.java

# Interface Suplier<T>
- untuk dapatkan hasil dengan tipe data sesuai genericnya
- method nya adalah T get();
- example: src\application\SupplierApp.java

# Interface BiFunction<T,U,R>
- sama seperti function cuman dia bisa 2
- R adalah return nya
- T adalah tipe data param pertama
- U adalah tipe data param kedua
- example: src\application\BiFunctionApp.java

* Masih ada banyak lagi bisa dilihat di java.util.function
