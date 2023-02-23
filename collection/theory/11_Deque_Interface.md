## Double Interface
Deque singkatan dari [double] [ended] [queue], artinya [queue] yang bisa [beroperasi] di [depan] ataupun [belakang]
Jika pada queue, operasi yang didukung ada FIFO, pada deque tidak hanya FIFO, melaikan juga LIFO
    FIFO (first in first out)
    LIFO (lst in first out)
Bisa dibilang deque adalah [implementasi] struktur data [antrian] dan [stack] (tumpukan)

# Method in Deque
All method in Queue
All method in Collection
addFirst (E): void
addLast (E) : void
offerFirst (E) : boolean
offerLast (E) : boolean
removeFirst () : E
removeLast () : E
pollFirst () : E
pollLast (): E
getFirst (): E
getLast (): E
peekFirst (): E
peekLast (): E
removeFirstOccurrence (Object): boolean
removeLastOccurrence (Object) : boolean
push(E): void
pop():E
descendingIterator(): Iterator<E>

# Konkrit Class Implementation
- LinkedList
- ArrayDeque

# Example
src\learn\lang\collection\application\DequeApp.java