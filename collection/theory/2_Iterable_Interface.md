## Iterable Interface
Iterable adalah parent untuk semua collection di Java, kecuali Map.
Iterable sendiri sangat sederhana, hanya digunakan agar mendukup for-each loop
Karena semua collection pasti implement iterable, secara otomatis maka semua
    collection di java mendukung perulangan for-each, jadi bukan cuman Array.

# Iterator Interface
Tidak ada magic di java, sebenarnya for-each di Iterable bisa terjadi karena ada method iterator()
    yang mengembalikan object Iterator.
Iterator adalah interface yang mendefinisikan cara kita melakukan mengakses element di collection
    secara sequential
For-each sendiri muncul sejak Java 5, sebelum Java 5 untuk melakukan iterasi collection,
    biasanya dilakukan manual menggunakan Iterator object.
- hashNext() --> return boolean: if true ada data if false tidak ada data
- next() --> return nya datanya: method ini akan dipanggil saat hashNext return nya true

# Example
src\learn\lang\collection\application\IterableApp.java