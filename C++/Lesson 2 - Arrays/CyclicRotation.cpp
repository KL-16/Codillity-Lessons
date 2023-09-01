// you can use includes, for example:
#include <vector>
#include <algorithm>

// you can write to stdout for debugging purposes, e.g.
// cout << "this is a debug message" << endl;

vector<int> solution(vector<int> &A, int K) {
    // Implement your solution here
    if (A.empty()) {
        return A;
    }
    if (K > A.size()) {
        K %= A.size();
    }
    std::rotate(A.rbegin(), A.rbegin() + K, A.rend());
    return A;
}