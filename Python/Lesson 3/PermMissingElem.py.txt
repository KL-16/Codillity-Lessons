# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # Implement your solution here
    array_length = len(A)
    if array_length == 0:
        return 1
    A.sort()
    if A[0] != 1:
        return 1
    index = 0
    while index < array_length - 1:
        if A[index + 1] - A[index] != 1:
            return A[index] + 1
        index += 1
    return A[array_length - 1] + 1