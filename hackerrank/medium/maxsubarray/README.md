# The Maximum Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

We define *subsequence* as any subset of an array.  We define a *subarray* as a *contiguous subsequence* in an array.  

Given an array, find the maximum possible sum among:

1. all nonempty subarrays. 
2. all nonempty subsequences. 

Print the two values as space-separated integers on one line. 

**Note** that empty subarrays/subsequences should not be considered. 

**Example**  
$arr = [-1, 2, 3, -4, 5, 10]$   

The maximum subarray sum is comprised of elements at inidices $[1-5]$.  Their sum is $2 + 3 + -4 + 5 + 10 = 16$.  The maximum subsequence sum is comprised of elements at indices $[1, 2, 4, 5]$ and their sum is $2 + 3 + 5 + 10 = 20$.  

**Function Description**  

Complete the *maxSubarray* function in the editor below.    

maxSubarray has the following parameter(s):  

- *int arr[n]:* an array of integers  

**Returns**  

- *int[2]:* the maximum subarray and subsequence sums  

**Input Format**

The first line of input contains a single integer $t$, the number of test cases.

The first line of each test case contains a single integer $n$.   
The second line contains $n$ space-separated integers $arr[i]$ where $0 \le i \lt n$.   

**Constraints**

- $1 \le t \le 10$
- $1 \le n \le 10^5$   
- $-10^4 \le arr[i] \le 10^4$   


*The subarray and subsequences you consider should have at least one element.*

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T19:05:20.003Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static List<Integer> maxSubarray(List<Integer> arr) {

        // Maximum contiguous subarray sum
        int current = arr.get(0);
        int maxSubarray = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            current = Math.max(arr.get(i), current + arr.get(i));
            maxSubarray = Math.max(maxSubarray, current);
        }

        // Maximum subsequence sum
        int maxElement = arr.get(0);
        int maxSubsequence = 0;

        for (int x : arr) {
            if (x > 0) {
                maxSubsequence += x;
            }

            maxElement = Math.max(maxElement, x);
        }

        // If all elements are negative
        if (maxSubsequence == 0) {
            maxSubsequence = maxElement;
        }

        return Arrays.asList(maxSubarray, maxSubsequence);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine().trim());

            StringTokenizer st =
                    new StringTokenizer(br.readLine());

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            List<Integer> result = maxSubarray(arr);

            System.out.println(result.get(0) + " " + result.get(1));
        }

        br.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/maxsubarray/problem)