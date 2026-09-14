public class Busqueda_Secuencial 

{
    public static int findEle(int[] inputArr, int targetEle) 
    {
        //Esta parte es muy similar a la de javaScrip xd
        for (int i = 0; i < inputArr.length; i++)
        {
            if(inputArr[i] == targetEle)
            {
                return i;
            }
        }
        // si no se encontro el elemento dar el valor del -1
        return -1;
    }

    public static void main(String[] args)
    {
        //Definimos el arreglo
        int[] inputArr = {12, 34, 10, 6, 40, 89, 98, 57, 16, 69};
        //El dato qeu deceamos buscar 
        int targetEle = 69;
        //Aqui se hace la operacion de busqueda 
        // y se guarda en el idx
        int idx = findEle(inputArr, targetEle);
        
        //Este if se utiliza para ver si se encontro el dato o no
        if (idx != -1)
        {
            System.out.print("Array: ");
            for (int i = 0; i < inputArr.length; i++)
            {
                System.out.print(inputArr[i] + (i < inputArr.length - 1 ? ", " : ""));
            }
            System.out.println(" ");

            System.out.println("El elemento se encuentra en la posicion del (0-9): " + idx);
        }
            else
            {
                System.out.println("El elemento no se encuentrta en el Array");
            }

    }
}
