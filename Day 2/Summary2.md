## Heap (Priority Queue)
### Min Heap
Elements are all smaller than their children.

The root node will be the smallest element, but the elements get bigger as you move down the level.

### Max Heap
Elements are all larger than their children

The root node will be the largest element, but the elements get smaller as you move down the level.

### Insertion
It always goes in the next empty spot looking top to bottom and left to right.

If the element for insertion is not in the right position, conduct bubble swap introduced in [bubble sort](https://github.com/papapalapa/BoomAlgo/blob/master/Bubble_Sort.ipynb).

This basically compares the current element with the parent node and swaps to satisfy conditions; loops this process until all the conditions are satisfied

### Deletion
#### From root
1. Remove the root node
2. Populate the missing spot of root node with the last leaf node
3. Compare the new root node with its children node
4. If the condition of min / max heaps is not satisfied, bubble swap
5. Loop through this process 

### Heap as an array
#### Finding a parent node
If the index of the child node is **n**, then the index of its parent is the floored value of **(n - 1) / 2**
#### Find children nodes
If the index of the parent node is **n**, then the index of each child node is **2n + 1** or **2n + 2**
