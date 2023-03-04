## NavigableMap Interface
NavigableMap adalah turunan dari SortedMap
Namun NavigableMap memiliki kemampuan navigasi berdasarkan operasai kurang dari, lebih dari dan sejenisnya.
Misalnya, kita ingin mengambil data yang lebih dari key x atau kurang dari key y, ini bisa dilakukan
    di navigableMap.

# Method yang ada di navigableMap
all method in sortedMap
lowerEntry(K): Entry<K, V>                          --> get entry more lower than parameter
lowerkey(K): K                                      --> get key more lower than parameter
floorEntry(K): Entry<K, V>                          --> get entry lower or equals than parameter
floorKey (K): K                                     --> get key more lower or equals than parameter
ceilingEntry (K): Entry<K, V >                      --> get entry high or equals than parameter    
ceilingKey (K): K                                   --> get key more high or equals than parameter
higherEntry(K): Entry<K, V>                         --> get entry more high than parameter    
higherKey(K): K                                     --> get key more high than parameter
firstEntry(): Entry<K, V>                           --> get first entry
lastEntry(): Entry<K, V>                            --> get last entry
pollFirstEntry(): Entry<K, V>                       --> get first entry and delete in map
pollLastEntry(): Entry<K, V>                        --> get last entry and delete in map
descendingMap(): NavigableMap<K, V>                 --> get navigableMap desc
navigableKeySet() : NavigableSet<K>                 --> get navigableSet<K>
descendingKeySet() : NavigableSet<K>                --> get navigableSet<K> but descending
subMap(K, boolean, Y, boolean): NavigableMap<K, V>  --> get navigableMap K until Y, if true that param include
headMap (K, boolean): NavigableMap<K, V>            --> get navigableMap from head until K, if true that param include
tailMap<K,boolean>: NavigableMap<K, V>              --> get navigableMap from tail until K, if true that param include

# Implementation
Map(i)<--SortedMap(i)<--NavigableMap(i)<--TreeMap(c)

src\learn\lang\collection\application\NavigableMapApp.java