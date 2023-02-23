## [Immutable] List
Secara default, List di Java baik itu ArrayList ataupun LinkedList datanya bersifat [[mutable](Bisa diubah)]
Di Java mendukung pembuatan [Immutable] List, artinya datanya [tidak] [bisa] [diubah] [lagi].
Sekali List dibuat, datanya tidak bisa diubah lagi, [alias][final].
Butt, Perlu diingat, data list nya yang tidak bisa diubah, [bukan][reference] object element nya.
    Kalo semisal kita membuat Immutable List berisikan data Person, field data Person tetap bisa diubah,
    tapi isi elemen dari Immutable List tidak bisa diubah lagi // person nya pengen diubah tetap bisa, but isi nya tidak bisa.
Ini Cocok ketika ada kebutuhan ada code yang tidak boleh sembarangan mengubah element di List.

# Membuat Immutable
- Collections.emptyList() -> membuat immutable list kosong
    saat membuat function yang return data list, but function nya tidak valid
    maka bisa return data emptyList yang tidak bisa diubah2.
- Collections.singletonList(e) -> membuat immuatble list berisi 1 element
- Collections.unmodifiableList(list) -> mengubah mutable list menjadi immutable
- List.of(e...)  -> membuat immutable list dari element-element

# Example
mutable   : src\learn\lang\collection\application\MutableApp.java
immutable : src\learn\lang\collection\application\ImmutableApp.java