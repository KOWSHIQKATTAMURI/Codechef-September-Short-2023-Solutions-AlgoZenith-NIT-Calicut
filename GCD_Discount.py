import math

t = int(input())
for _ in range(t):
    n = int(input())
    arr = list(map(int, input().split()))
    brr = list(map(int, input().split()))
    
    prefix = [0] * n
    suffix = [0] * n
    prefix[0] = arr[0]
    suffix[n - 1] = arr[n - 1]
    
    for i in range(1, n):
        prefix[i] = math.gcd(prefix[i - 1], arr[i])
    
    for i in range(n - 2, -1, -1):
        suffix[i] = math.gcd(suffix[i + 1], arr[i])
    
    mx = prefix[n - 1]
    
    for i in range(n):
        if i == 0:
            temp = math.gcd(suffix[i + 1], brr[i])
            mx = max(mx, temp)
        elif i == n - 1:
            temp = math.gcd(prefix[i - 1], brr[i])
            mx = max(mx, temp)
        else:
            left = math.gcd(prefix[i - 1], suffix[i + 1])
            right = math.gcd(left, brr[i])
            mx = max(mx, right)
    
    print(mx)
