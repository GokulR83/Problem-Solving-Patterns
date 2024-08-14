# Sliding Window Technique
Sliding Window Technique is a method used to efficiently solve problems that involve defining a window or range in the input data (arrays or strings) and then moving that window across the data to perform some operation within the window. This technique is commonly used in algorithms like finding subarrays with a specific sum, finding the longest substring with unique characters, or solving problems that require a fixed-size window to process elements efficiently.

### Example
Let’s take an example to understand this properly, say we have an array of size N and also an integer K. Now, we have to calculate the maximum sum of a subarray having size exactly K. Now how should we approach this problem?

One way to do this by taking each subarray of size K from the array and find out the maximum sum of these subarrays. This can be done using Nested loops which will result into O(N2) Time Complexity.

### But can we optimize this approach?

The answer is Yes, instead of taking each K sized subarray and calculating its sum, we can just take one K size subarray from 0 to K-1 index and calculate its sum now shift our range one by one along with the iterations and update the result, like in next iteration increase the left and right pointer and update the previous sum as shown in the below image:

![sliding window](https://media.geeksforgeeks.org/wp-content/uploads/20240306112433/sliding-window-1.webp "Sliding window techniques")

Now follow this method for each iteration till we reach the end of the array:
![sliding window](https://media.geeksforgeeks.org/wp-content/uploads/20240306112450/sliding-window-technique-2.webp "Sliding window Technique")

So, we can see that instead of recalculating the sum of each K sized subarray we are using previous window of size K and using its results we update the sum and shift the window right by moving left and right pointers, this operation is optimal because it take O(1) time to shift the range instead of recalculating.

This approach of shifting the pointers and calculating the results accordingly is known as Sliding window Technique.

## How to Identify Sliding Window Problems:
- These problems generally require Finding Maximum/Minimum Subarray, Substrings which satisfy some specific condition.
- The size of the subarray or substring ‘K’ will be given in some of the problems.
- These problems can easily be solved in O(N2) time complexity using nested loops, using sliding window we can solve these in O(n) Time Complexity.
- Required Time Complexity: O(N) or O(Nlog(N))
- Constraints: N <= 106 , If N is the size of the Array/String


## Practice Problems
- [Sum of minimum and maximum elements of all subarrays of given size K](https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1)
- [Count Distinct elements in each window of size K](https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1)
- [Find first negative integer in every k size window](https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1)
- [Maximum of all subarray of size K](https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1)
- [Maximum MEX of all subarray of size K](https://www.geeksforgeeks.org/maximum-mex-from-all-subarrays-of-length-k/)