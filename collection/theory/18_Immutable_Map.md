## Immutable Map
Sama seperti di List dan Set, Map juga punya tipe data Immutable

# Cara membuat Immutable Map
- Collections.emptyMap()                --> Membuat Immutable map kosong
- Collections.unmodifiableMap(map)      --> Mengubah mutable map menjadi immutable
- Collections.singletonMap(key,value)   --> Membuat map dengan satu jumlah key-value
- Map.of(...)                           --> Membuat immutable map dari key-value

src\learn\lang\collection\application\ImmutableMapApp.java