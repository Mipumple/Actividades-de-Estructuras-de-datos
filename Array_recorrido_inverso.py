Array=[40, 50, 60, 70, 80, 90]

print("Recorrido inverso del array: ", end = " ")
print("\nLos elementos del array son: ", end = " ")

for idx in range(len(Array)-1,-1,-1):
    print(Array[idx],end = " ")

print()