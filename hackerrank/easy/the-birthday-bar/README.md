# Subarray Division

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it. 

Lily decides to share a contiguous segment of the bar selected such that: 

- The length of the segment matches Ron's birth month, and,
- The sum of the integers on the squares is equal to his birth day.

Determine how many ways she can divide the chocolate.

**Example**   
$s = [2, 2, 1, 3, 2]$    
$d = 4$   
$m = 2$   

Lily wants to find segments summing to Ron's birth day, $d = 4$ with a length equalling his birth month, $m = 2$.  In this case, there are two segments meeting her criteria: $[2, 2]$ and $[1,3]$.

**Function Description**

Complete the *birthday* function in the editor below.    

birthday has the following parameter(s):  

- *int s[n]:* the numbers on each of the squares of chocolate  
- *int d:* Ron's birth day  
- *int m:* Ron's birth month  

**Returns**   

- *int:* the number of ways the bar can be divided  



**Input Format**

The first line contains an integer $n$, the number of squares in the chocolate bar.  	
The second line contains $n$ space-separated integers $s[i]$, the numbers on the chocolate squares where $0 \le i \lt n$.  
The third line contains two space-separated integers, $d$ and $m$, Ron's birth day and his birth month.

**Constraints**

* ${1} \leq {n} \leq 100$  
* ${1}\leq {s[i]}\leq {5}$, where (${0}\leq {i} \lt {n}$)     
* ${1} \leq {d} \leq {31}$  
* ${1} \leq {m} \leq {12}$

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T19:02:40.719Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;

            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }

            if (sum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        String[] arr = br.readLine().trim().split(" ");
        List<Integer> s = new ArrayList<>();

        for (String x : arr) {
            s.add(Integer.parseInt(x));
        }

        String[] dm = br.readLine().trim().split(" ");
        int d = Integer.parseInt(dm[0]);
        int m = Integer.parseInt(dm[1]);

        System.out.println(birthday(s, d, m));
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/the-birthday-bar/problem)