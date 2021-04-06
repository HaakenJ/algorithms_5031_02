def fibOuter(n):
    def fibRecur(n, count):
        if n == 0:
            return 0
        if n == 1:
            return 1
        count += 1
        # print("count: " + str(count))
        return fibRecur(n - 1, count) + fibRecur(n - 2, count)
    count = 0
    fib = fibRecur(n, count)
    print(count)
    return fib

def fibIter(n):
    count = 0
    if n == 0 or n == 1:
        return n
    
    a = 0
    b = 1
    c = 1

    for i in range(2, n + 1):
        count += 1
        c = a + b
        a = b
        b = c    
    print("count: " + str(count))
    return c

def fibRecurAcc(n, a = 0, b = 1, count = 0):
    if n == 0:
        return 0
    if n == 1:
        return b
    print("count: " + str(count))
    return fibRecurAcc(n - 1, b, a + b, count + 1)

input = [3, 10, 20]

# for n in input:
#     print("Output for n = " + str(n))
#     print("Recursive Solution: ")
#     print("Fib: " + str(fibRecur(n, 0)))
#     print()

#     print("Iterative Solution: ")
#     print("Fib: " + str(fibIter(n)))
#     print()

#     print("Recursive Accumulator: ")
#     print("Fib:" + str(fibRecurAcc(n)))
#     print("-------------------")
#     print()


print(fibOuter(10))