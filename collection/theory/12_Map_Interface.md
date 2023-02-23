## Map Interface
Map adalah [struktur][data] collection yang [berisikan] mapping antara [key] dan [value]
Dimana [key] di map itu harus [unik], [tidak] boleh [duplikat], dan satu [key] cuma boleh mapping ke satu value
[Map] sebenernya [mirip] dengan [Array], cuman [bedanya] kalo di [Array], [key] adalah [index] (integer)
    sedangkan di [Map], [Key] nya [bisa] [bebas] kita tentukan sesuai keinginan kita.

# Method\
size(): int
isEmpty() : boolean
containsKey (Object): boolean
containsValue(Object) : boolean
get(Object): V
put(K, V):V
remove (Object): V
putAll( Map<? extends K, ? extends V>): void
clear: void
keySet(): Set<K>
values(): Collection <V>
entrySet(: Set<EntrycK, V>>
getOrDefauit (Object, V);: V
forEach(BiConsumer<? super K, ? super V>): void
replaceAll(BiFunction <? super K, ? super V, ? extends V>): void
putifAbsent(K, V): V
remove(Object, Object): boolean
replace(K, V, V): boolean
replace(K, V): V
computeIfAbsent (K, Function<? super K, ? extends V>): V
computeIfPresent (K, BiFunction <? super K, ? super v, ? extends V>): V
computetKBIFunction<r super K, r super v, r extenas v>j: V
merge(K, V, BIFunction<? super V, ? super V, ? extends V>): V

# Implementation Map
- HashMap
- WeakHashMap
- IdentityHashMap
- LinkedHashMap
- EnumHashMap

# Example
open hashmap.md etc