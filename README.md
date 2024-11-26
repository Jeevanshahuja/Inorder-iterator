# Binary Search Tree Iterator  

## Problem Description  
The `BSTIterator` class represents an iterator over the **in-order traversal** of a Binary Search Tree (BST).  

### Operations  
1. **`BSTIterator(TreeNode root)`**  
   - Initializes the iterator with the root of the BST.  
   - Prepares the iterator to return the smallest element in the BST on the first call to `next()`.  

2. **`int next()`**  
   - Moves the pointer to the next smallest element in the BST and returns its value.  

3. **`boolean hasNext()`**  
   - Returns `true` if there are more elements to visit in the BST. Otherwise, it returns `false`.  

### Constraints  
- You may assume that calls to `next()` are always valid, i.e., there will always be a next element when `next()` is called.  

## Solution  

### Class: `BSTIterator`  

#### Functions:  
1. **Constructor**  
   - **Input**: The root of the BST.  
   - **Operation**: Pushes all the leftmost nodes starting from the root into a stack to prepare for in-order traversal.  

2. **`next()`**  
   - **Operation**: Pops the top element of the stack (current node), pushes all the leftmost nodes of its right subtree into the stack, and returns the value of the current node.  

3. **`hasNext()`**  
   - **Operation**: Returns `true` if the stack is not empty, indicating there are more nodes to traverse.  

4. **`Insertleft(TreeNode root)`**  
   - **Operation**: Pushes all left children of the given node onto the stack, ensuring the smallest elements are at the top of the stack.  

### Time Complexity  
- **`next()`**: `O(H)`, where `H` is the height of the tree (for pushing left children).  
- **`hasNext()`**: `O(1)` (checking if the stack is empty).  

### Space Complexity  
- **Space Complexity**: `O(H)` for the stack, where `H` is the height of the tree.  

## Link to Problem  
For more details, visit the problem on [LeetCode](https://leetcode.com/problems/binary-search-tree-iterator/).  
