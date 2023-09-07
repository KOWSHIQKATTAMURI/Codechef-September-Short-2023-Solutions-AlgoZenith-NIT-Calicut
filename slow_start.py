n = int(input())
for i in range(n):
    x, h = map(int, input().split())
    count = 0
    while(h > 0):
        count = count + 1
        if(count <= 5):
            h = h - x/2
        else:
            h = h - x
    print(count)
