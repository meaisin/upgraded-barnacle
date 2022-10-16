# plusMinus

## Challenge

Given a sequence of integers, calculate the ratios that are positive, negative, and zero, printing the decimal value of each fraction on a newline to 6 decimal places.

## Solution

We can use `reduce` on the sequence and build up a map containing the amount of positive, negative, and zero quantities in the sequence. We can then just print the respective quantity divided by the sum of all the values in the map to get the decimal values of the ratios. 

## Implementation

The implementation given is close to the described solution, but refactored to be more compact. 

Firstly, we can look at the function literal used by `reduce`. It takes a map as its first value (the accumulator) and an element of the sequence as its second. It simply `cond`s on the element to increment the value in the map dependent on the value of the element. This function literal is then used in an unnamed function application. The purpose of this unnamed function is to give a starting map for `reduce`. Destructuring is used to extract the totals.

We then print the decimal values of the fractions. The fractions are calculated as they are printed, dividing the respective quantity with the total, which we calculate in the `let` bindings.

### Analysis

This algorithm is linear to its input size. I think O(n) is the best that can be achieved, given that it is neccessary to visit each element.
