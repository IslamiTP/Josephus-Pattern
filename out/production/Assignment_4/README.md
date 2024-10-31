# Josephus Algorithm Pattern

## Overview

The **Josephus Algorithm Pattern** is a classic problem-solving pattern used to identify a safe position among people standing in a circle where every k-th person is eliminated in a repeated manner until only one person remains. This algorithm has applications in game theory, distributed computing, and scheduling problems.

This README will provide a description of the Josephus problem, explain the algorithm, and include a Java implementation that utilizes recursion.

## Josephus Problem Description

In the Josephus problem:
1. **n** people are standing in a circle, numbered 1 to n.
2. Starting from a specified position, we count every k-th person and remove them from the circle.
3. This elimination pattern continues in a circular fashion until only one person is left.

For instance, with **n = 7** and **k = 3**, the sequence of eliminations would yield 3, 6, 2, 7, 5, 1, leaving person 4 as the last remaining.

## Algorithm Explanation

The Josephus Algorithm Pattern works by:
1. Recursively reducing the circle size by eliminating one person each step.
2. The base case is reached when only one person is left.
3. For each recursive call, the position is adjusted to reflect the elimination that occurred in the previous call.

In the recursive approach, the formula for the Josephus position **f(n)** can be represented as:
\[
f(n) = (f(n - 1) + 1) \% n + 1
\]

Where:
- **n** is the number of people in the circle.
- **f(1) = 1** serves as the base case.

### Complexity
- **Time Complexity**: \(O(n)\), as each recursive call reduces the problem by one.
- **Space Complexity**: \(O(n)\) due to the call stack.

## Java Implementation

## Example Execution

```plaintext
Enter the number of people (n): 7
Function call with n = 7
Function call with n = 6
Function call with n = 5
Function call with n = 4
Function call with n = 3
Function call with n = 2
Function call with n = 1
The position of the survivor is: 4
```

## Usage

To run the code:
1. Compile the file:
   ```bash
   javac Josephus.java
   ```
2. Run the compiled file:
   ```bash
   java Josephus
   ```

## Resources

- [Josephus Problem on GeeksforGeeks](https://www.geeksforgeeks.org/josephus-problem-set-1-a-on-solution/)
- [Wikipedia: Josephus Problem](https://en.wikipedia.org/wiki/Josephus_problem)

This README explains the Josephus Algorithm Pattern and how to use the provided Java implementation.