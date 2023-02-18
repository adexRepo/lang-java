## Comparator Interface
Ini salah satu interface juga yang implementasi generic
Jika kita ingin mengurutkan class yang kita gunakan, cukup mudah tinggal implement interface Comparable

But jika class tersebut milik orang lain / library orang lain? yang tidak bisa diubah, how?
Maka kita bisa gunakan interface generic yang bernama Comparator.

# Reference:
    https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Comparator.html
    compare(T o1, T o2)