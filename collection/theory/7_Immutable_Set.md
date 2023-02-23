## Immutable Set
Sama seperti List, Set pun memiliki tipe data Immutable
Cara pembuatan immutable Set di Java mirip dengan pembuatan immutable di List

# Immutable Set
- Collections.emptySet() -> membuat immutable Set kosong
    saat membuat function yang return data Set, but function nya tidak valid
    maka bisa return data emptyList yang tidak bisa diubah2.
- Collections.singleton(e) -> membuat immuatble Set berisi 1 element
- Collections.unmodifiableSet(Set) -> mengubah mutable Set menjadi immutable
- Set.of(e...)  -> membuat immutable Set dari element-element

# Example
src\learn\lang\collection\application\ImmutableSet.java