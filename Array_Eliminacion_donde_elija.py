#Programa para eliminar un elemento al principio de un array
inputArr = [11, 21, 31, 41, 51, 61]
print("Antes de la eliminacion, el array es: ")
for j in range(len(inputArr)):
    print(inputArr[j], end = " ")
print("\nQue elemento desea eliminar? ")
elemento = int(input())

inputArr.remove(elemento)
print("\nDespues de la eliminacion, el array es: ")
for j in range(len(inputArr)):
    print(inputArr[j], end = " ")