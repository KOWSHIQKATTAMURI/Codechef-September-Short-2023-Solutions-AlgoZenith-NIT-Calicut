t = int(input())
while t:
    n,m = list(map(int, input().split()))
    posts = list(map(int, input().split()))
    fenceRange = [0, m]
    ans = []
    for post in posts:
        maxDiff = 0
        fenceRange.append(post)
        fenceRange.sort()
        i = 0
        while i< len(fenceRange)-1:
            diff = fenceRange[i+1] - fenceRange[i]
            maxDiff = max(maxDiff, diff)
            i+=1
        ans.append(maxDiff)
    output = [str(num) for num in ans]
    print(' '.join(output))
    t-=1
