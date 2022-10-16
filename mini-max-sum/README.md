# miniMaxSum

## Challenge

Given 5 positive integers as input through `stdin`, find both the **maximum** and the **minimum** sums that can be made using 4 of the 5 positive integers. These values should be printed, separated by a single space, with the minimum sum first. 

## Solution

My solution works by simply calculating the total sum of all 5 elements, and getting the respective minimum and maximum sums by subtracting the maximum and minimum elements. For example, in the case of finding the **maximum** elements, the minimum element is subtracted from the sum of all 5 integers. The principle behind this solution is that, in every case of the given problem, the maximum sum can be reached by summing the 4 largest integers. Therefore, the sum of all except the smallest integer. Summing just the 4 largest integers is the same as summing all the integers and subtracting the smallest integer.

## Implementation

My implementation of the above solution uses the `let` form to define the `total`, `min-el` and `max-el`. The respective maximum and minimum sums are then calculated by subtraction and printed.

### Analysis

1. Calculating the `total` uses `reduce` and `+`. This is linear to the size of the input (O(n)). 
2. The minimum element is found using `apply` and `min`. This is linear to the size of the input (O(n)).
3. The maximum element is found using `apply` and `max`. This is linear to the size of the input (O(n)).
4. The maximum and minimum sums are calculated. These are constant to the size of the input (O(1)).

The algorithm in its total is therefore O(n) to its input. An improvement could be found in using a different function in place of `+` in `reduce`, one such that a map is producing containing the total, minimum element and maximum element. In this case, in stead of traversing `arr` (likely) three separate times, the algorithm only traverses it once. However, `reduce` operating once but updating and passing a map could incure a greater cost than the simpler `reduce` with `+` and `min` and `max`. Indeed, in testing such a solution, it took usually around 1.7x the time as the current solution. It's possible that for much larger inputs this may change.
