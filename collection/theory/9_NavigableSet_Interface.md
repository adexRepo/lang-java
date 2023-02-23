## NavigableSet Interface
NavigableSet adalah turunan dari SortedSet
NavigableSet menambah method-method untuk melakukan navigasi pencarian element,
    seperti
        lebih besar dari
        kurang dari
        membalikan urutan set
        etc.

# Method In NavigableSet
- All method in Set
- All method in SortedSet
- lower(E): E                       
    >>> kurang dari yang ada diparameter
- floor(E): E                       
    >>> kurang dari / sama dengan diparameter
- ceiling(E): E                     
    >>> lebih dari yang diparameter
- higher(E): E                      
    >>> lebih dari / sama dengan diparameter
- pollFirst(E): E                   
    >>> ngambil data paling pertama lalu dihapus dari NavigableSet nya
- pollLast(E): E                    
    >>> ngambil data paling terakhir lalu dihapus dari NavigableSet nya
- descendingIterator():Iterator<E>  
    >>> pakai iterator terbalik
- descendingSet():NavigableSet<E>   
    >>> menghasilkan navigableSet baru tapi formatnya terbalik
- subSet(E,boolean,E,boolean):NavigableSet<E> 
    >>> ngambil [dari] elemen [keberapa] [sampai] [keberapa] , boolean nya artinya si elemen yang ada itu ikut juga atau engga. if [true] [ikut], if [false] [not] [ikut] 
- headSet(E,boolean):NavigableSet<E> 
    >>> ngambil elemen dari [atas] sampai yang diparam, jika [true] yang [diparam] juga [kepanggil]
- tailSet(E,boolean):NavigableSet<E>
    >>> ngambil elemen dari [bawah] sampai yang diparam, jika true yang diparam juga kepanggil

# Implementation Class NavigableSet
Iterable(i) <- Collection(i) <- Set(i) <- SortedSet(i) <- [NavigableSet(i)] <- TreeSet(c)

# Immutable NavigableSet
Method
Collections.emptyNavigableSet()            :: membuat [immutable] NavigableSet Set [kosong]
Collections.unmodifiableNavigableSet(set)  :: Mengubah [mutable] NavigableSet [menjadi] [immutable]

# Example
src\learn\lang\collection\application\NavigableSetApp.java