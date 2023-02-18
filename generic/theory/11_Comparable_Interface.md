# Comparable Interface
ini hanya contoh method-method yang implementasi generic
Sebelumnya kita sudah tahu bahwa operator perbandingan object menggunakan method equals.
Bagaimana dengan operator perbandingan lainnya?, Seperti kurang dari atau lebih dari?
Operator perbandingan tersebut bisa kita lakukan, jika object kita mewariskan interface generic
    Comparable
Ini banyak sekali digunakan seperti untuk proses pengurutan data misalnya.
lengkapnya:
    https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/Comparable.html
    compareTo(T o)
    if negatif less than
    if zore equals
    if positif more than

# Example
    src\learn\lang\generic\Person.java
    src\learn\lang\generic\application\ComparableApp.java