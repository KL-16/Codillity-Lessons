//Detected time complexity:
//O(N) or O(N*log(N))

// you can use includes, for example:
#include <algorithm>

// you can write to stdout for debugging purposes, e.g.
// cout << "this is a debug message" << endl;

int solution(vector<int> &A) {
    // Implement your solution here
    if (A.size() == 1) {
        return A[0];
    }
    sort(A.begin(), A.end());
    for (int i = 0; i < A.size() - 1; i++) {
        if (i % 2 == 0) {
            if (A[i] != A[i + 1]) {
                return A[i];
            }
        }
    }
    return A[A.size() - 1];
}