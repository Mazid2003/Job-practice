
1. Linear Search

➡ Search for an element by checking each item one by one.

📌 Example:

arr = [3, 5, 7, 9, 11]
target = 7
for i in range(len(arr)):
    if arr[i] == target:
        print(f"Found at index {i}")  # Found at index 2
✅ Best when the list is unsorted.

2. Binary Search
➡ Search a sorted array by repeatedly dividing the search space in half.

📌 Example:

arr = [2, 4, 6, 8, 10]
target = 6
low, high = 0, len(arr)-1
while low <= high:
    mid = (low + high) // 2
    if arr[mid] == target:
        print(f"Found at index {mid}")  # Found at index 2
        break
    elif arr[mid] < target:
        low = mid + 1
    else:
        high = mid - 1
✅ Much faster than linear search on sorted data (O(log n)).

3️. Bubble Sort
➡ Repeatedly swap adjacent elements if they are in the wrong order.

📌 Example:

arr = [5, 3, 8, 4]
for i in range(len(arr)):
    for j in range(0, len(arr)-i-1):
        if arr[j] > arr[j+1]:
            arr[j], arr[j+1] = arr[j+1], arr[j]
print(arr)  # [3, 4, 5, 8]
✅ Simple but inefficient for large lists.

4️. Selection Sort
➡ Select the minimum element and put it at the beginning.

📌 Example:

arr = [64, 25, 12, 22, 11]
for i in range(len(arr)):
    min_idx = i
    for j in range(i+1, len(arr)):
        if arr[j] < arr[min_idx]:
            min_idx = j
    arr[i], arr[min_idx] = arr[min_idx], arr[i]
print(arr)  # [11, 12, 22, 25, 64]
✅ Easy to understand, but not efficient (O(n²)).

5️. Insertion Sort
➡ Build the sorted array one item at a time.

📌 Example:

arr = [12, 11, 13, 5, 6]
for i in range(1, len(arr)):
    key = arr[i]
    j = i-1
    while j >= 0 and key < arr[j]:
        arr[j+1] = arr[j]
        j -= 1
    arr[j+1] = key
print(arr)  # [5, 6, 11, 12, 13]
✅ Works well for small or nearly sorted data.

6️. Merge Sort
➡ Divide the array in halves, sort them recursively, and merge.

📌 Example:

def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2
        L = arr[:mid]
        R = arr[mid:]
        merge_sort(L)
        merge_sort(R)
        i = j = k = 0
        while i < len(L) and j < len(R):
            if L[i] < R[j]:
                arr[k] = L[i]
                i += 1
            else:
                arr[k] = R[j]
                j += 1
            k += 1
        while i < len(L):
            arr[k] = L[i]
            i += 1
            k += 1
        while j < len(R):
            arr[k] = R[j]
            j += 1
            k += 1
arr = [12, 11, 13, 5, 6, 7]
merge_sort(arr)
print(arr)  # [5, 6, 7, 11, 12, 13]
✅ Time: O(n log n), good for large datasets.

7️. Quick Sort
➡ Pick a pivot, partition array so smaller elements go left and larger right, then sort partitions.

📌 Example:

def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[0]
        less = [x for x in arr[1:] if x <= pivot]
        greater = [x for x in arr[1:] if x > pivot]
        return quick_sort(less) + [pivot] + quick_sort(greater)
arr = [10, 7, 8, 9, 1, 5]
print(quick_sort(arr))  # [1, 5, 7, 8, 9, 10]
✅ Fast on average: O(n log n)

8️. Two Pointers Technique
➡ Use two pointers to iterate through data for optimized solutions.

📌 Example: Find pair with target sum

arr = [1, 2, 3, 4, 6]
target = 6
l, r = 0, len(arr)-1
while l < r:
    s = arr[l] + arr[r]
    if s == target:
        print(arr[l], arr[r])  # 2 4
        break
    elif s < target:
        l += 1
    else:
        r -= 1
✅ Works on sorted arrays.

9️. Sliding Window Technique
➡ Maintain a window (subset) and slide it across to solve problems efficiently.

📌 Example: Max sum of subarray of size 3

arr = [1, 4, 2, 10, 23, 3, 1, 0, 20]
k = 3
window_sum = sum(arr[:k])
max_sum = window_sum
for i in range(len(arr)-k):
    window_sum = window_sum - arr[i] + arr[i+k]
    max_sum = max(max_sum, window_sum)
print(max_sum)  # 39
✅ Reduces time complexity for subarray problems.

🔟 Kadane’s Algorithm
➡ Find maximum subarray sum (contiguous).

📌 Example:

arr = [-2,1,-3,4,-1,2,1,-5,4]
max_sum = curr_sum = arr[0]
for num in arr[1:]:
    curr_sum = max(num, curr_sum + num)
    max_sum = max(max_sum, curr_sum)
print(max_sum)  # 6
✅ O(n) time, great for max subarray problems.

1️⃣1️⃣ Prefix Sum and Difference Arrays
➡ Precompute cumulative sums for fast range queries.

📌 Example:

arr = [1, 2, 3, 4, 5]
prefix = [0] * (len(arr)+1)
for i in range(len(arr)):
    prefix[i+1] = prefix[i] + arr[i]
# Sum from index 1 to 3 (2 + 3 + 4)
print(prefix[4] - prefix[1])  # 9
✅ Efficient for range sum queries.

1️⃣2️⃣ Flood Fill Algorithm (DFS/BFS for grid problems)
➡ Fill connected region in a matrix/grid (like paint bucket tool).

📌 Example:

def flood_fill(grid, r, c, new_color, orig_color):
    if (r < 0 or c < 0 or r >= len(grid) or c >= len(grid[0]) or grid[r][c] != orig_color):
        return
    grid[r][c] = new_color
    flood_fill(grid, r+1, c, new_color, orig_color)
    flood_fill(grid, r-1, c, new_color, orig_color)
    flood_fill(grid, r, c+1, new_color, orig_color)
    flood_fill(grid, r, c-1, new_color, orig_color)

grid = [
    [1,1,1],
    [1,1,0],
    [1,0,1]
]
flood_fill(grid, 1, 1, 2, grid[1][1])
print(grid)  # [[2,2,2],[2,2,0],[2,0,1]]
