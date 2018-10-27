*This is my personal note*
---
# Day 3 : Data Structure
## Linked List

A sequence of elements that can contain any type of data.

Each element links to the next element, and the sequence can be unsorted, be sorted, have duplicates, etc.

## Doubly Linked List

A sequence of elements in which an element connects to its previous and next node.
---
### Search

Unlike an array, a linked list has to start from its **head** and linearly work up to the indicated element.

### Why Use?

Advantage: insertions and deletions may take constant time.

### How it works

##### Append
1. If I want to append a node to the linked list, each node starting from the first node must check if next node exists.

2. If the next node is null, append the data as the tail node.

##### Prepend
1. If I want to prepend a node to the linked list, I should first create a new head node.

2. The new head then connects to the next node

3. Replace the head with the new head.

##### Delete
1. Walk through the linked lists

2. Stop one node before the node you want to delete

3. Connect current node to the next node of the node you want to delete

4. If the node you want to delete is the head, update the head to the next node of the head
