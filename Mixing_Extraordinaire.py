t = int(input())
for i in range(t):
    n = int(input())
    lst = list(map(int, input().split()))
    ans = 0
    for i in range(n):
        for j in range(i + 1, n):
            ans += lst[i]*lst[j]
    print(ans)
