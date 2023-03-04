## Abstract Collection
Struktur data collection di Java selalu berkembang, namun biasanya algoritma dasarnya selalu sama
antara jenis collection

Hampir semua interface collection di Java sudah disediakan abstract class nya sebagai dasar
    algoritmanya, dan hampir semua implementasi class konkrit nya selalu extends abstract class collection

Hal ini mempermudah, jika ingin membuat collection manual, kita tidak perlu membuat dari awal
    kita mbisa menggunakan abstract class yang sudah disediakan.

NOTE jangan pakai interface nya karena kalo itu wajib di implement semuanya.

# Abstract Class
Collection --> AbstractCollection
List       --> AbstractList
Map        --> AbstractMap
Queue      --> AbstractQueue
Set        --> AbstractSet

src\learn\lang\collection\collection\SingleQueue.java
src\learn\lang\collection\application\SingleQueueApp.java