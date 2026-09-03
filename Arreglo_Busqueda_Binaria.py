def findEle(arr, l, h, targetValue):
    while l <= h:
        mid = 1 + (h - l) // 2
        # Verificar si x esta presente en mid
        if arr[mid] == targetValue:
            return mid
        # Si taregtValue es mayor que el elemnto mid, considera la segunda mitad del array
        elif arr[mid] < targetValue:
            l = mid + 1
            # Si targetValue es mayor que el elemento mid, considerar la primera mitad del array
        else:
            h = mid -1
        # Si el control llega hasta aqui, significaque el elemnto buscado no est presente en el array
    return -1
if __name__ == '__main__':
    inputArr = [10, 20, 30, 40, 50, 60, 70, 80, 90 ] #Array de entrada
    targetElement = 40 # Elemento objetivo a encontrar
    s = len(inputArr) #Tamaño del array
    #Operacion de busqueda
    idx = findEle(inputArr, 0, s - 1, targetElement)
    if idx != -1:
        print("El elemento se encuentra en la posicion: " + str(idx + 1))
    else:
        print("El elemento no se encuentra")

