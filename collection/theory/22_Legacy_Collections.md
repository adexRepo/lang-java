## Legacy Collection
Collection sudah ada sejak java versi 1, dan sudah banyak perkembangan
Collection Legacy / jadul juga ada. ini cuman wawasan aja.

# Vector Class
Vector class adalah implementasi dari interface List
Cara kerja Vector mirip dengan ArrayList, yang membedakan adalah semua method di Vector
    menggunakan kata kunci synchronized yang artinya dia thread safe.
Namun problemnya adalah, karena semua method menggunakan kata kunci synchronized, otomatis
    impact nya ke performance yang menjadi lambat dibandingkan menggunakan ArrayList.
Lalu bagaimana jika kita ingin membuat List yang bisa digunakan di proses paralel?
    di versi java baru sudah disediakan yang lebih canggih, oleh karena itu penggunaan
    Vector sudah jarang sekali ditemui sekarang.

# HashTable Class
HashTable adalah implementasi dari Map yang mirip dengan HashMap
Sama seperti Vector, semua method di HashTable memiliki kata kunci synchronized, sehingga performanya
    lebih lambat dibandingkan HashMap.
Dan karena versi Java baru sudah ada juga ConcurrentHashMap, sehingga penggunaan HashTable sudah
    jarang sekali ditemui.

# Stack Class
Stack adalah implementasi struktur data tumpukan LIFO (Last In First Out)
Namun fitur yang lebih komplit dan konsisten sudah disediakan di Deque,
    jadi tidak ada alasan lagi menggunakan class Stack

src\learn\lang\collection\application\HashTableApp.java
src\learn\lang\collection\application\VectorApp.java
src\learn\lang\collection\application\StackApp.java