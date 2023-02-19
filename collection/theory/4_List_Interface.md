## List Interface
List adalah struktur data collection yang memiliki sifat sebagai berikut.
    - Elemen di list bisa duplikat, artinya bisa memasukkan data yang sama
    - Data list berurutan sesuai dengan posisi kita memasukkan data
    - List memiliki index, sehingga kita bisa menggunakan nomor index untuk
        mendapatkan element di list
Di Java ada beberapa implementasi List dan dipakai sesuai kebutuhan.
List itu turunan dari Collection jadi semua method yang ada di collection 
    ada juga didalam list
Anyway List itu bisa duplikat

# Method-method yang ada di list
    addAll(int,Collection<? extends E>):boolean
    replaceAll(UnaryOperator<E>):void
    sort(Comparator<? super E>):void
    get(int):E
    set(int,E):E
    add(int,E):void
    remove(int):E
    indexOf(Object):int
    lastIndexOf(Object):int == ketika ada duplikat maka bisa ambil yg last
    listIterator():ListIterator<E>
    listIterator(int):ListIterator<E>
    subList(int,int):List<E>

## Implementation Class
# ArrayList Class
ArrayList adalah implementasi dari List menggunakan array
By Default kapasitas array di ArrayList adalah 10
Namun ketika kita memasukkan data dan array sudah penuh, maka secara otomatis
    ArrayList akan membuat array baru dengan kapasitas baru dengan ukuran
    kapasitas lama + data baru.

# LinkedList Class
LinkedList adalah implementasi List dengan struktur data Double Linked List
    lihat di gambar ini : lib\diagram\linkedList diagram.png
Data disimpan didalam node dan di tiap node ada next dan prev nya

# ArrayList vs LinkedList
lib\diagram\arrayList vs linkedList.png
note :
    ketika array diremove 1 saja maka akan sisanya akan digeser mendekati index 0 / ke 0
    intinya kalo mau [add dan remove] bisa pakai [linkedlist], sisanya seperti [get set] dll
    langsung pakai [arraylist] aja

# Example
src\learn\lang\collection\application\ListApp.java