# HashMap
HashMap adalah implementation Map yang melakukan [distribusi] [key] [menggunakan] [hashCode]() function
Karena HashMap sangat bergantung dengan [hashCode()] function, jadi dipastikan kita harus
    membuat function hashCode seunik mungkin, karena jika terlalu banyak nilai hashCode() yang
    sama, maka pendistribusian key nya tidak akan optimal sehingga proses get data di Map
    akan semakin lambat.
Di HashMap [pengecekan] data [duplikat] dilakukan dengan [menggunakan] method [equals] nya.

# Example
src\learn\lang\collection\application\HashMapApp.java