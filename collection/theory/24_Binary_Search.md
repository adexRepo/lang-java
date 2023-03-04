## Binary Search
Secara default List di java memiliki fitur search atau get data,
    namun implementasinya menggunakan sequential search, artinya data akan
    dicek satu persatu dari awal hingga akhir.
Salah satu algoritma pencarian yang populer adalah binary search, namun
    binary search hanya bisa dilakukan jika datanya telah berurutan.
Untungnya Java Collection sudah ada implementasi binary search, sehingga
    gaperlu buat manual sendiri.

# Method
1. Collections.binarySearch(list,target)
2. Collections.binarySearch(list,target,comparator)

src\learn\lang\collection\application\BinarySearchApp.java