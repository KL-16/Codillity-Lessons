//Detected time complexity:
//O(N) or O(N*log(N))

// you can use includes, for example:
#include <algorithm>
#include <vector>

// you can write to stdout for debugging purposes, e.g.
// cout << "this is a debug message" << endl;

int solution(vector<int> &A) {
    // Implement your solution here
    if (A.size() == 0) {
        return 1;
    }
    std::sort(A.begin(), A.end());
    if (A[0] != 1) {
        return 1;
    } else {
        for (int i = 0; i < A.size() - 1; i++) {
            if (A[i + 1] - A[i] != 1) {
                return A[i] + 1;
            }
        }
        return A[A.size() - 1] + 1;
    }
}