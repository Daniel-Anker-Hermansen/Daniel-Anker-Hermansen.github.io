n = int(input());
x = list(map(int, input().split()));
y = set(map(int, input().split()));
for xi in x:
    if not xi in y:
        print(xi);
