## LinkedHashMap
LinkedHashMap adalah implementasi Map dengan menggunakan double linked list.
Data di LinkedHashMap akan lebih [terprediksi] karena datanya akan disimpan berurutan
    dalam linkedlist sesuai [urutan] [kita] [menyimpan] data.
Namun perlu diperhatikan, [proses] [get] data di LinkedHashMap akan [semakin] [lambat] karena harus
    melakukan [iterasi] data linked list [terlebih][dahulu].
Gunakan LinkedHashMap jika memang kita lebih mementingkan iterasi data Mapnya.

# Example
src\learn\lang\collection\application\LinkedHashMapApp.java