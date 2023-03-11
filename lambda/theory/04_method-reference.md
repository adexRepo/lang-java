## Method Reference
- Kadang saat membuat lambda, isi lambda hanya mengakses method lain
    atau mengakses method yang ada di parameter method lambda nya.
- Kita bisa mempersingkat pembuatan lambda tersebut dengan method reference.

# 1. in Static Method
src\util\IsLowerChecker.java
src\application\MethodReferenceStaticApp.java

# 2. in Non Static Method
src\application\MethodReferenceNonStaticApp.java

# 3. in Non Static Method and other object, not same file
- i add in same file example with flag --> // * [if other object]
src\application\MethodReferenceNonStaticApp.java

# 4. method reference in parameter
- focus ke tipe data nya.
- methodnya harus yang tidak memiliki parameter