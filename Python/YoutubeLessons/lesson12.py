u = 0

while True:
    if u == 5:
        break
    else:
        print( u )
        u += 1


s = 89

while s < 93:
    if s == 98 or s + 13 == 98:
        print( "stopping now" )
        break
    print( s - 80 )
    print( "that's fun" )
    s = s - int(1.23)


evensOnly = []
for t in range(20):
    if not (t % 2 == 0):
        continue
    evensOnly.append(t)

for u in range(20,40):
    if t % 2 == 0:
        evensOnly.append(t)

for v in range(40,60,2):
    if True:
        evensOnly.append( v )
        continue
