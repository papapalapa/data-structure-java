*This is my personal note*
---
# Day 1 : Data Structure

## Hash table

Hash table is key - value look up. It allows you to associate a value with a key and gives you the advantage of retrieving the value you want with more readable index.

For example:
> "lastName" => "Lee"
>
> "firstName" => "Janghoon"
>
> "age" => "19"

The key can be used to search an object as well:
> "Lee" => new Person( id: 69, age:19, salary:0, experience:3 )
>
> "Tran" => new Person( id: 696, age:19, salary:100000, experience:69 )
>
> "Wu" => new Person( id: 2000, age:7, salary:2000, experience:96 )
>
> "Bricken" => new Person( id: 1, age:1, salary:1, experience:1 )

Getting the desired object and retrieving some values of object has never been easier with hash tables:

`hashtable.get("Lee")`


One caveat you have to note is that you usually don't use a string value as an index of the array.

You would have to **convert** the string value into a **hash code** using a hash function and **map** the hash code to the index.

`string -> hash code -> index`


During this process, since we are mapping the two hash codes into a smaller number, two things with different hash codes might be mapped to the same index since there are a finite number of hash codes but an infinite number of string values.

What do I do now?

### Collision
Collision is when you have two hash codes mapped to the same index.

There are multiple ways to prevent this disaster from happening. One way is to chain the elements and make the hash table an array of linked list.

You can find more information [here](https://en.wikipedia.org/wiki/Hash_table#Collision_resolution)

### Runtime
* O(1) for a "good" hash table
* O(n) for a terrible hash table
