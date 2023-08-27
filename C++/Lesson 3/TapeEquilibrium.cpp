//Detected time complexity:
//O(N)

// you can use includes, for example:
#include <algorithm>
#include <cstdlib>

// you can write to stdout for debugging purposes, e.g.
// cout << "this is a debug message" << endl;

int solution(vector<int> &A) {
    // Implement your solution here
    if(A.size() == 2) {
        return abs(A[0] - A[1]);
    }
    int totalSum = 0;
    for (int i = 0; i < A.size(); i++) {
        totalSum += A[i];
    }
    int leftSide = 0;
    int rightSide = totalSum;
    int minimalDifference = 1000;
    for (int i = 0; i < A.size() - 1; i++) {
        leftSide += A[i];
        rightSide -= A[i];
        if (abs(rightSide - leftSide) < minimalDifference) {
            minimalDifference = abs(rightSide - leftSide);
        }
    }
    return minimalDifference;
}