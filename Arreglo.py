#Programa para eliminar un elemento al principio de un array
inputArr = [11, 21, 31, 41, 51, 61]
print('Antes de la eliminacion, el array es: ')
for j in range(len(inputArr)):
    print(inputArr[j], end=' ')

# Eliminando el primer elmento del imputArr
inputArr.pop(0)
print('\nDespues de la eliminacion, el array es: ')
for j in range(len(inputArr)):
    print(inputArr[j], end=' ')