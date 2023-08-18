# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # Implement your solution here
    A.sort()
    index = 0
    array_length = len(A)
    while index < array_length - 1:
        if A[index] != A[index + 1]:
            return A[index]
        index += 2
    return A[array_length - 1]