// you can use includes, for example:
// #include <algorithm>
#include <stack>

// you can write to stdout for debugging purposes, e.g.
// cout << "this is a debug message" << endl;

int solution(int N) {
    // Implement your solution here
    stack<int> stack;
    while (N != 0) {
        if (N % 2 == 0) {
            stack.push(0);
        } else {
            stack.push(1);
        }
        N /= 2;
    }
    int maxBinaryGap = 0;
    int currentBinaryGap = 0;
    bool countGap = false;
    while (!stack.empty()) {
        if (stack.top() == 1)
        {
            if (countGap = true) {
                if (currentBinaryGap > maxBinaryGap) {
                    maxBinaryGap = currentBinaryGap;
                }
                currentBinaryGap = 0;
            } else {
                countGap = true;
            }
        } else {
            if (countGap) {
                currentBinaryGap++;
            } 
        }
        stack.pop();
    }  
    return maxBinaryGap;
}