## Collection Interface
Selain Iterable interface, parent class semua collection di Java adalah Collection.
Kalo [Iterable] interface digunakan sebagai [kontrak] untuk [mengiterasi][data] secara [sequential].
[Collection] merupakan [kontrak] untuk [memanipulasi][data] collection, seperti menambah, menghapus
    dan mengecek isi data collection.
[Tidak] ada [direct] [implementation] untuk Collection, karena collection nanti akan dibagi lagi
    menjadi [List], [Set] dan [Queue].

# In Collection
    - size():int
    - isEmpty(): boolean
    - contains(Object):boolean
    - toArray():Object[]
    - toArray(T[]):T[]
    - toArray(IntFunction<T[]>):T[]
    - add(E):boolean
    - remove(Object):boolean
    - containsAll(Collection<?>):boolean >> mengecek beberapa data sekaligus sifatnya AND
    - addAll(Collection<?>):boolean
    - removeAll(Collection<?>):boolean
    - removeIf(Predicate<? super E>):boolean
    - retainAll(Collection<?>):boolean
    - clear():void // menghapus
    - stream():Stream<E>
    - paralelStream():Stream<E>

# Example
src\learn\lang\collection\application\CollectionApp.java