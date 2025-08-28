n = int(input());
x = list(map(int, input().split()));
y = list(map(int, input().split()));
for xi in x:
    found = False;
    for yi in y:
        found |= xi == yi;
    if not found:
        print(xi);
