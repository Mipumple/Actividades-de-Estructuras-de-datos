TwoDimencionalArray =[
[1, 2, 3],
[4, 5, 6],
[7, 8, 9],
]
print("Los elementos del array son: ")
for row in zip(*TwoDimencionalArray):#El * desempaqueta las filas de la matriz 
    for element in row:              #y el zip agrupa todos los elementos que estan en la misma posicion, juntando todos los primeros elementos y todos los segundos 
        print(element, end= " ")#Mostrar los elementos en fila separados por espacios
    print()#Ir a la siguiente linea despues de mostrar una fila