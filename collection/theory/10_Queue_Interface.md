## Queue Interface
Queue adalah implementasi dari struktur data Antrian atau FIFO (First In First Out)

# Method in Queue
- All method in Collection interface
- add    (E) --> masukkan data but kalo udah penuh queue nya maka throw exception
- Offer  (E) :boolean --> masukkan data but kalo udah penuh queue nya maka hasilin false
- remove (E) : E --> mengambil yang pertama dan menghapus dari queue >> throw error exception
- poll   (E) : E --> mengambil yang pertama dan menghapus dari queue >> null
- element(E) : E --> mengambil yang pertama tapi tidak dihapus >> no such element exce
- peek   (E) : E --> mengambil yang pertama tapi tidak dihapus >> null

# Implementation Queue
lib\diagram\implementation Queue.png

# Perbedaan ArrayDeque vs LinkedList vs PriorityQueue
- [ArrayDeque] menggunakan [array] sebagai [implementation] queue nya. ada batas array
- [LinkedList] menggunakan double linked list sebagai implementasi queue nya. tidak ada batas
- [PriorityQueue] menggunakan [array] sebagai [implementasi] queue nya, but
    [diurutkan] menggunakan [Comparable] atau [Comparator]. ada batas dan diurutkan

# Example
src\learn\lang\collection\application\QueueApp.java