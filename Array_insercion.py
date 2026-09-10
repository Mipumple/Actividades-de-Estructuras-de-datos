inputArr = [11, 21, 31, 41, 51, 61]
print('Antes de la eliminacion, el array es: ')
for j in range(len(inputArr)):
    print(inputArr[j], end = " ")
print("\nQue elemento desea agregar? ")
elemento = int(input())

# agrega un elmento del imputArr
inputArr.insert(0, elemento)
print('\nDespues de la insercion, el array es: ')
for j in range(len(inputArr)):
    print(inputArr[j], end = " ")