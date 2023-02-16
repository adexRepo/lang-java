## Covariant
Covariant artinya kita [bisa] melakukan [subsitusi] subtype ([child]) dengan supertype ([parent])
Caranya agar generic object kita menjadi [covariant] adalah dengan menggunakan kata kunci 
    (?extends ParentClass) >> ini subType ke superType
Artinya saat kita membuat object Contoh<String>, maka bisa disubsitusi menjadi :
    Contoh<? extends Object>
Covariant adalah [read-only] , jadi kita tidak bisa mengubah data generic nya.
Why ? 
    see example :

# Example
src\learn\lang\generic\application\CovariantApp.java