# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(X, Y, D):
    # Implement your solution here
    distance_to_jump = Y - X
    if distance_to_jump % D == 0:
        return distance_to_jump // D
    else:
        return (distance_to_jump // D) + 1