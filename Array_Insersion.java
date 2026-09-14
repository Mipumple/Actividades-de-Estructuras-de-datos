import java.util.Scanner;

public class Array_Insersion 
{
    public static void main(String[] args) 
    {
        // Definimos el Array original
        int[] Array = {40, 50, 60, 70, 80, 90};
        
        // Mostramos el array antes de insertar de forma manual
        System.out.print("Array antes de la insercion: ");
        for (int i = 0; i < Array.length; i++) 
        {
            System.out.print(Array[i]);
            if (i < Array.length - 1) 
            {
                System.out.print(" ");
            }
        }
        System.out.println(" ");
        
        // Creamos el Scanner para capturar el dato
        Scanner scanner = new Scanner(System.in);
        System.out.print("Que elemento desea agregar al inicio? : ");
        int elemento = scanner.nextInt();
        
        // Creamos un nuevo arreglo con una posición extra
        int[] nuevoArray = new int[Array.length + 1];
        
        // Colocamos el nuevo elemento en la primera posición (al inicio)
        nuevoArray[0] = elemento;
        
        // Copiamos los elementos del array anterior desplazándolos una posición a la derecha
        for (int i = 0; i < Array.length; i++) 
        {
            nuevoArray[i + 1] = Array[i];
        }
        
        // Reemplazamos el array viejo por el nuevo
        Array = nuevoArray;
        
        // Mostramos el resultado final de forma manual
        System.out.print("Array despues de la insercion: ");
        for (int i = 0; i < Array.length; i++) 
        {
            System.out.print(Array[i]);
            if (i < Array.length - 1) 
            {
                System.out.print(" ");
            }
        }
        System.out.println(" ");
        
        scanner.close();
    }
}