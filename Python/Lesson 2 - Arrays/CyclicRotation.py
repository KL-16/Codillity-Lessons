# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A, K):
    # Implement your solution here
    if len(A) == K or len(A) == 1 or K == 0 or len(A) == 0:
        return A
    if K > len(A):
        counter = K // len(A)
        K -= counter * len(A)  
    
    array_front = A[:len(A) - (K)]
    array_back = A[len(A) - (K):]
    array_back.extend(array_front)
    return array_back