## Entry Interface
Saat kita menyimpan data di Map, data disimpan dalam pair (key-value)
Di java Collections, implementasi Pair di Map bernama Entry
Entry adalah interface sederhana yang berisikan method untuk mengambil key dan value.
Entry seperti inner interface.

Method-method
1. Semua yang dimiliki object
2. getKey():K
3. getValue():V
4. setValue(V):V
5. comparingByKey():Comparator<Entry <K,V>>
6. comparingByValue():Comparator<Entry <K,V>>
7. comparingByKey(Comparator<? super K>):Comparator<Entry <K,V>>
7. comparingByValue(Comparator<? super V>):Comparator<Entry <K,V>>

src\learn\lang\collection\application\EntryApp.java
