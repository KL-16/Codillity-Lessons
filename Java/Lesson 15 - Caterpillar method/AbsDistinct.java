// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        HashSet<Long> uniquePositives = new HashSet<>();
        for (int number : A) {
            if(!uniquePositives.contains(Math.abs((long)number))) {
                uniquePositives.add(Math.abs((long)number));
            }
        }
        return uniquePositives.size();
    }
}