// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int euclidean(int N, int M) {
        int modulo = N % M;
        if (modulo == 0) {
            return M;
        }
        if (modulo >= M) {
            return euclidean(modulo, M);
        } else {
            return euclidean(M, modulo);
        }
    }

    public int solution(int N, int M) {
        // Implement your solution here
        int divisor = 1;
        if (N >= M) {
            divisor = euclidean(N, M);
        } else {
            divisor = euclidean(M, N);
        }
        return N / divisor;
    }
}