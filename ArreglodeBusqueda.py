def findEle(inpuptArr, s, targetEle):
    for j in range(s):
        if (inpuptArr[j] == targetEle): #Aplicando busqueda lineal
            return j #Elemento encontrado en el idice j
    #No se encuentra en elemeto objeto
    return -1
if __name__=='__main__':
    inputArr = [12, 34, 10, 6, 40, 89, 98, 57, 16, 69]
    targetElement = 69
    s = len(inputArr)
    #Operacion de busqueda
    idx = findEle(inputArr, s, targetElement)
    if idx != -1:
        print("El elemento se encuentra en la posicion: " + str(idx + 1))
    else:
        print("No se encuentra el elemento. ")