## WeakHashMap
WeakHashMap adalah implementasi Map mirip dengan HashMap
Perbedaannya adalah WeakHashMap menggunakan weak key (key yang lemah), dimana jika tidak digunakan
    lagi maka secara otomatis data di WeakHashMap akan dihapus.
Artinya, jika terjadi garbage collection di Java, bisa dimungkinkan data di WeakHashMap akan dihapus.
WeakHashMap cocok digunakan untuk menyimpan data cache di memory secara sementara.

Secara berkala java akan otomatis menjalankan garbage collection.

# Example
src\learn\lang\collection\application\WeakHashMapApp.java