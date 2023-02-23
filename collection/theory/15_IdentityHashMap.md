## IdentityHashMap
IdentityHashMap adalah implementasi Map sama seperti HashMap
Yang membedakan adalah cara pengecekan kesamaan datanya, tidak menggunakan function equals,
    melainkan menggunakan operator == (reference equality) >> depend on location memory
Artinya datanya dianggap sama, jika lokasi di memory tersebut sama.

# Example
src\learn\lang\collection\application\IdentityHashMapApp.java