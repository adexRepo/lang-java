## Contravariant
Contravariant artinya kita bisa melakukan subsitusi [penggatian] supertype (parent) dengan subtype (child)
Caranya agar generic object kita menjadi contravariant adalah dengan menggunakan kata kunci (? super SubClass)
Artinya saat kita membuat object:
    Contoh<Object> maka bisa disubsitusi menjadi Contoh<? super String>
    hal ini karena Object adalah super class nya dari String
Contravariant bisa [write] dan [read], namun perlu berhati-hati ketika melakukan [read].
terutama jika sampai parent nya punya banyak child.

# Example
src\learn\lang\generic\application\ContravariantApp.java