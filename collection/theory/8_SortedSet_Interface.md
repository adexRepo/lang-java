## SortedSet Interface
SortedSet adalah interface turunan dari Set, namun di [SortedSet] elemen-elemen yang dimasukkan
    kedalam SortedSet [akan] [otomatis] [diurutkan] berdasarkan isinya by default [ascending].
[Jika] element [adalah] [turunan] dari interface [Comparable], maka secara [otomatis] akan [diurutkan]
    menggunakan comparable tersebut.
[Jika] element [bukan] [turunan] dari interface [Comparable], maka kita bisa [menggunakan] [Comparator]
    untuk memberi tahu si SortedSet bagaimana cara mengurutkan elemen-elemennya.

# Method in Sorted Set
- all method in Set
- comparator(): Comparator<? super E>
- subSet(E,E): SortedSet<E>
- headSet(E): SortedSet<E>
- tailSet(E): SortedSet<E>
- first(): E
- last(): E

# Implementation SortedSet
Iterable(i) <- Collection(i) <- Set(i) <- [SortedSet(i)] <- NavigableSet(i) <- TreeSet(c)

# Immutable SortedSet
Method
Collections.emptySortedSet()            :: membuat immutable sorted set kosong
Collections.unmodifiableSortedSet(set)  :: Mengubah mutable sorted set menjadi immutable

# Example
src\learn\lang\collection\application\SortedSetApp.java
src\learn\lang\collection\data\PersonComparator.java