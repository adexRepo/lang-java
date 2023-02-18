## Single Bounded Type Parameter // Single Constraint
Kadang kita ingin mengatasi [data yang boleh] digunakan di generic parameter type
Kita bisa menambahkan [constraint] di generic type dengan [menyebutkan] [tipe] yang [diperbolehkan].
Secara otomatis, type data yang bisa digunakan adalah type yang sudah kita sebutkan,
    atau class-class turunannya.
Secara default, [constraint] type untuk generic parameter type adalah [Object], sehingga semua type
    data bisa digunakan.

# Example
- Single Bounded Type Parameter
src\learn\lang\generic\application\ConstraintApp.java

