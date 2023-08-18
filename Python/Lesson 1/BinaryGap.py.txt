# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(N):
    # Implement your solution here
    stack = []
    while N != 0:
        if N % 2 == 0:
            stack.append(0)
        else:
            stack.append(1)
        N //= 2
    startCounting = False
    maxGap = 0
    currentGap = 0
    while len(stack) != 0:
        if startCounting:
            if stack.pop() == 0:
                currentGap += 1
            else:
                if currentGap > maxGap:
                    maxGap = currentGap
                currentGap = 0
        if not startCounting and stack.pop() == 1:
            startCounting = True

    return maxGap