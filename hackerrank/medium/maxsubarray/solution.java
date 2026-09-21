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
