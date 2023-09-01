// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // Implement your solution here
        int factors = 0;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                if (i < Math.sqrt(N)) {
                    factors += 2;
                } else {
                    factors++;
                }
            }
        }
        return factors;
    }
}