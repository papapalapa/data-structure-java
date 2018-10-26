*This is my personal note*
---
# Day 1 : Data Structure

## Hashtable

Hashtable is key - value look up. It allows you to associate a value with a key and gives you the advantage of retrieving the value you want with more readable index.

For example:
> "lastName" $\implies$ "Lee"
>
> "firstName" $\implies$ "Janghoon"
>
> "age" $\implies$ "19"

The key can be used to search an object as well:
> "Lee" $\implies$ new Person( id: 69, age:19, salary:0, experience:3 )
>
> "Tran" $\implies$ new Person( id: 696, age:19, salary:100000, experience:69 )
>
> "Wu" $\implies$ new Person( id: 2000, age:7, salary:2000, experience:96 )
>
> "Bricken" $\implies$ new Person( id: 1, age:1, salary:1, experience:1 )

Getting the desired object and retrieving some values of object has never been easier with hashtable:

`hashtable.get("Lee")`


One caveat you have to note is that you usually don't use a string value as an index of the array.

You would have to **convert** the string value into a **hashcode** using a hash function and **map** the hashcode to the index.

`string -> hashcode -> index`


During this process, since we are mapping the two hashcodes into a smaller number, two things with different hashcodes might be mapped to the same index since there are a finite number of hashcodes but an infinite number of string values.

What do I do now?

### Collision
Collision is when you have two hashcodes mapped to the same index.

There are multiple ways to prevent this disaster from happening. One way is to chain the elements and make the hashtable an array of linked list.

You can find more information [here](https://en.wikipedia.org/wiki/Hash_table#Collision_resolution)

### Runtime
* O(1) for a "good" hashtable
* O(n) for a terrible hashtable

## Heap (Priority Queue)
### Min Heap
Elements are all smaller than their children.

The root node will be the smallest element, but the elements get bigger as you move down the level.

### Max Heap
Elements are all larger than their children

The root node will be the largest element, but the elements get smaller as you move down the level.

### Insertion
It always goes in the next empty spot looking top to bottom and left to right.

If the element for insertion is not in the right position, conduct [bubble sort](https://github.com/papapalapa/BoomAlgo/blob/master/Bubble_Sort.ipynb) (or swap).
