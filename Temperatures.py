import sys
import math

#
## This code is good enough to reach 5/6 part
#
temps = []
n = int(input())  # the number of temperatures to analyse

# If the user enter zero or nothing, return 0
if n == 0 or None:
    print(0)
else:
    for i in input().split():
        # t: a temperature expressed as an integer ranging from -273 to 5526
        t = int(i)
        temps.append(t)

    # Sorting by value to select the first one
    temps.sort()
    closestTempToZero = temps[0]

    nbrSubZeroTemp = 0
    for temp in temps:
        if temp < 0:
            nbrSubZeroTemp = nbrSubZeroTemp +1

    for temp in temps:
        # We compare absolute value then choose the smaller one
        if abs(temp) < abs(closestTempToZero):
            closestTempToZero = tem

    # If we work with a list of negatif number -> print a relative value
    if nbrSubZeroTemp == len(temps):
        print(closestTempToZero)
    # Or print a absolute value ;)
    else:
        print(abs(closestTempToZero))

