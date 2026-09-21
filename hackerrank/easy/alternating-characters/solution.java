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
