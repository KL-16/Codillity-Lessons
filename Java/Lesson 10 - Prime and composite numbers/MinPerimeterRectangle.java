// you can also use imports, for example:
// import java.util.*;
import java.lang.Math;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
    // Implement your solution here
        int sqrtRoot = (int)Math.sqrt(N);
        int minArea = 0;
        for (int i = sqrtRoot; i >= 1; i--) {
            if (N % i == 0) {
                minArea = 2 * (N/i + i);
                break;
            }
        }
        return minArea;
    }
}