## Set Interface
Set adalah salah satu collection yang [berisikan][elemen-elemen] yang [unik], atau tidak boleh duplikat.
Set [tidak] [memiliki] [index] seperti di List, oleh karena itu [tidak] ada jaminan data yang ada di Set itu
    akan [berurut] sesuai dengan waktu kita memasukkan data ke Set.
Set [tidak] [memiliki] [method] [baru], jadi [hanya] menggunakan [method] yang ada di inteface [parent][nya],
    yaitu [Collection] dan [Iterable]
[Karena] [tidak] memiliki [index], untuk [mengambil] [data] di Set juga kita harus melakukan [iterasi] [satu] [per] [satu].

# Class Implementation
- EnumSet : hanya enum yang pakai set
- HashSet
- LinkedHashSet

# HashSet vs LinkedHashSet
Dibelakang HashSet dan LinkedHashSet sebenarnya sama-sama ada hash table nya, dimana data disimpan dalam sebuah
    hash table dengan mengkalkulasi hashCode() function --> cara untuk membuat unique atau tidak dengan menggunakan
    hashCode() function.
Yang membedakan adalah HashSet tidak menjamin data terurut sesuai dengan waktu kita menambahkan data, sedangkan
    LinkedHashSet menjamin data terurut sesuai dengan waktu kita menambahkan data.
Urutan data di LinkedHashSet bisa dijaga karena dibelakang nya menggunakan double linked list. 
kalo butuh terurut pakai linkedHashSet aja.

# EnumSet
EnumSet adalah Set yang elemen datanya harus Enum
Karena data Enum itu unik, sehingga sangat cocok menggunakan Set dibandingkan List.