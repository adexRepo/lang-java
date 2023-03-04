## SortedMap Interface
SortedMap adalah implementasi Map dengan data key berurutkan sesuai dengan [Comparable] key
    atau bisa menggunakan Comparator.
SortedMap cocok untuk kasus yang posisi key dan Map harus berurut.

# Method-method in map
1. All yang ada di Map
2. comparator():Comparator<? super K>
3. subMap(K,K): SortedMap <K,V> >> dari key berapa sampai key berapa
4. headMap(K): SortedMap <K,V>
5. tailMap(K): SortedMap <K,V>
6. firstKey(): K
7. lastKey(): K

# Implementation SortedMap
Map<--SortedMap<--TreeMap

src\learn\lang\collection\application\SortedMapApp.java