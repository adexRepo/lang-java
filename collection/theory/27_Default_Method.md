## Default Method Collection
Di java 8 fitur ini bernama default method, dimana kita bisa menambahkan konkrit method di interface

Fitur ini banyak sekali digunakan di Java Collection, karena kita tahu semua collection di Java
    memiliki kontrak interface, sehingga dengan mudah di Java bisa meng-improve kemampuan semua
    collection hanya dengan menambahkan default method di interface collection nya.

# Collections
Example:
Iterable.forEach(consumer)      --> do iteration to all data collection  (in Iterable)
List.removeIf(predicate)        --> do remove data in collection with predicate (in List)
List.replaceAll(operator)       --> do change all data collection (in List) operator can unary operator
etc

src\learn\lang\collection\application\DefaultMethodCollectionApp.java


# Map
Example 
getOrDefault(key,defaultValue)  --> get data based on key, if null return defaultValue
forEach(consumer)               --> do iteration to all data map  (in Map)
replaveAll(function)            --> change all data value
putIfAbsent(key,value)          --> save data to map if there is empty/absent
remove(key,value)               --> remove if remove and val same
replace(key,oldValue,newValue)  --> key and value same and value different with newValue change to newValue
computeIfAbsent(key,function)   --> change key with value result function if not exist
computeIfPresent(key,function)   --> change key with value result function if exist
etc.

src\learn\lang\collection\application\DefaultMethodMapApp.java