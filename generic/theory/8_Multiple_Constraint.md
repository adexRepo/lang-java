# Multiple Bounded Type Parameter
Kadang kita ingin membatasi tipe data dengan beberapa jenis tipe data di generic parameter type.
Kita bisa menambahkan beberapa bounded type parameter dengan karakter & setelah bounded type pertama.
Jika kita ingin menambahkan lagi, cukup gunakan karakter & diikuti bounded type nya lagi.
Constraint yang kedua hanya boleh interface. hal ini karena tiap object hanya dibolehkan 1 parent class.

# Example
src\learn\lang\generic\application\MultipleConstraintApp.java