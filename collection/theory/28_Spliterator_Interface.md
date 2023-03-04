## Spliterator Interface
Spliterator adalah interface yang bisa digunakan untuk melakukan partisi data collection.
Biasanya ini digunakan ketika kita akan memproses collection dalam jumlah besar, lalu
    agar lebih cepat di split menjadi beberapa dan diproses secara paralel agar lebih cepat.
Penggunaan Spliterator biasanya erat kaitannya dengan Java Thread atau Java Concurrency,
    namun tidak dibahas dan fokus ke Spliterator.

# Method Spliterator
- (i) OfPrimitive
- (i) Oflint
- (i) OfLong
- (i) OfDouble
- (m) tryAdvance(Consumer<? super T>)          : boolean
- (m) forEachRemaining(Consumer<? super T>)    : void
- (m) try Split()               : Spliterator<T
- (m) estimateSize()            : long
- (m) getExactSizelfKnown()     : long
- (m) characteristics()         : int
- (m) hasCharacteristics(int)   : boolean
- (m) getComparator()           : <Comparatore? super T>
- (f) ORDERED                   : int = Ox00000010
- (f) DISTINCT                  : int = Ox00000001
- (f) SORTED                    : int = Ox00000004
- (f) SIZED                     : int = Ox00000040
- (f) NONNULL                   : int = Ox00000100
- (f) IMMUTABLE                 : int = Ox00000400
- (f) CONCURRENT                : int = Ox00001000
- (f) SUBSIZED                  : int = Ox00004000

src\learn\lang\collection\application\SpliteratorApp.java