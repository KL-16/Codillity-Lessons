//Detected time complexity:
//O(1)

// you can use includes, for example:
// #include <algorithm>

// you can write to stdout for debugging purposes, e.g.
// cout << "this is a debug message" << endl;

int solution(int X, int Y, int D) {
    // Implement your solution here
    if (X == Y) {
        return 0;
    }
    int distanceToBeMade = Y - X;
    if (distanceToBeMade % D == 0) {
        return distanceToBeMade / D;
    } else {
        return distanceToBeMade / D + 1;
    } 
}