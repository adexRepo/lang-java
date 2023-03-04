## Collections Class
Collection adalah class yang berisikan utility static method yang membantu kita menggunakan java Collection API
Ada banyak static method pada class collection
lengkapnya :
https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Collections.html

# example method
void copy(listTo,listFrom)                      -> copy all data listFrom to listTo
int frequency(collection,object)                -> mengambil berapa banyak element yang sama dengan object
max(collection) dan max(collection,comparable)  -> mengambil elemen paling tinggi di list
min(collection) dan min(collection,comparable)  -> mengambil elemen paling rendah di list
void reverse(list)                              -> membalikkan seluruh urutan di list
void shuffle()                                  -> mengacak urutan elemen list
void swap(list,from,to)                         -> menukar posisi from ke to di list
etc

src\learn\lang\collection\application\CollectionsApp.java