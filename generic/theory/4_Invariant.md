## Invariant
Secara [default], saat kita membuat generic paramter type, sifat paramter type tersebut adalah [invariant]
Invariant artinya tidak boleh di [subsitusi][Digantikan] dengan subtype(child) atau supertype(parent).
Artinya saat kita membuat object :
    Contoh<String>, maka tidak sama dengan Contoh<Object>
    kedua itu adalah hal yang berbeda.begitupun sebaliknya
    Contoh<Object> != Contoh<String>

# Example
src\learn\lang\generic\application\InvariantApp.java