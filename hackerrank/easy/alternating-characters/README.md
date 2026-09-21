# Alternating Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string containing characters $A$ and $B$ only.  Your task is to change it into a string such that there are no matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.  

Your task is to find the minimum number of required deletions.

**Example**  
$s = AABAAB$  

Remove an $A$ at positions $0$ and $3$ to make $s = ABAB$ in $2$ deletions.

**Function Description**

Complete the *alternatingCharacters* function in the editor below.  

alternatingCharacters has the following parameter(s):

- *string s*: a string  

**Returns**  

- *int:* the minimum number of deletions required

**Input Format**

The first line contains an integer $q$, the number of queries.  
The next $q$ lines each contain a string $s$ to analyze.

**Constraints**

- $ 1 \le q \le 10$  
- $ 1 \le \text{ length of s }\le 10^5$
- Each string $s$ will consist only of characters $A$ and $B$.

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T19:07:01.377Z  

```java
import java.io.*;

public class Solution {

    public static int alternatingCharacters(String s) {

        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine().trim());

        while (q-- > 0) {

            String s = br.readLine().trim();

            System.out.println(alternatingCharacters(s));
        }

        br.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/alternating-characters/problem)