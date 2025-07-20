# 📘 Important Algorithms in Java
Algorithms are the heart of efficient software development. In Java, you can implement various core algorithms to solve problems in data processing, searching, sorting, optimization, and more.

## 🔹 1. Searching Algorithms

### ✅ Linear Search
Scans each element one by one.

**Time Complexity:** O(n)

Use Case: Small or unsorted datasets.

### ✅ Binary Search
Searches a sorted array by repeatedly dividing the search interval.

**Time Complexity:** O(log n)

Use Case: Fast lookups in sorted arrays.

## 🔹 2. Sorting Algorithms

### ✅ Bubble Sort
Repeatedly swaps adjacent elements if they are in the wrong order.

**Time Complexity:** O(n²)

Best For: Educational purposes, not efficient for large datasets.

### ✅ Selection Sort
Selects the smallest element and places it in the correct position.

**Time Complexity:** O(n²)

Space Complexity: O(1)

### ✅ Insertion Sort
Builds sorted array one item at a time.

**Time Complexity:** O(n²) (worst case)

Efficient for: Small datasets and nearly sorted arrays.

### ✅ Merge Sort
Divides array into halves, sorts them, and merges.

**Time Complexity:** O(n log n)

Stable & Efficient: Good for linked lists and large datasets.

### ✅ Quick Sort
Picks a pivot and partitions array around it.

**Time Complexity:** O(n log n) average, O(n²) worst

Fast & Popular: Often used in standard libraries.

## 🔹 3. Recursion
Technique where a method calls itself to solve subproblems.

**Use Cases:** Factorial, Fibonacci, Tower of Hanoi, Tree traversals.

## 🔹 4. Greedy Algorithms
Makes the best choice at each step.

**Examples:** Activity selection, coin change (with standard denominations), Huffman Coding.

## 🔹 5. Dynamic Programming (DP)
Solves problems by combining solutions of overlapping subproblems.

**Examples:** Fibonacci with memoization, Knapsack, Longest Common Subsequence.

**Time Complexity:** Reduced significantly compared to plain recursion.

## 🔹 6. Graph Algorithms

### ✅ BFS (Breadth-First Search)
Explores neighbors level by level.

Use Case: Shortest path in unweighted graphs.

### ✅ DFS (Depth-First Search)
Explores as far as possible before backtracking.

Use Case: Topological sorting, cycle detection.

### ✅ Dijkstra’s Algorithm
Finds shortest path in weighted graphs.

**Time Complexity:** O(E + V log V) with priority queue.

## 🔹 7. Backtracking
Explores all possibilities and backtracks on failure.

Examples: N-Queens, Sudoku Solver, Word Search.

## 🔹 8. Divide and Conquer
Breaks problem into subproblems, solves them independently.

Examples: Merge Sort, Quick Sort, Binary Search.

## 🔹 9. Hashing
Maps data to a fixed-size hash table.

Use Case: Fast lookups, removing duplicates.

Common Class: HashMap<K, V>, HashSet<E>
