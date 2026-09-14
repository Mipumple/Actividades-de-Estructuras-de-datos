public class Busqueda_Binaria 
{
    public static int findElement(int[] Array, int low, int high, int targetValue )
    {
        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            if (Array[mid] == targetValue)
            {
                return mid;
            }

            else if (Array[mid] < targetValue)
            {
                low = mid + 1;
            }

            else
            {
                high = mid - 1;
            }
            
        }
        return -1;
    }

    public static void main(String[] args)
    {
        //Definimos el arreglo
        int[] Array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        //El dato que deceamos buscar 
        int targetElement = 50;

        int s = Array.length;

        //Aqui se hace la operacion de busqueda 
        // y se guarda en el idx
        int idx = findElement(Array, 0, s - 1, targetElement);
        
        //Este if se utiliza para ver si se encontro el dato o no
        if (idx != -1)
        {
            System.out.println("El elemento se encuentra en la posicion: " + (idx + 1));
        }
        else
        {
            System.out.println("El elemento no se encuentrta en el Array");
        }

    }

}
