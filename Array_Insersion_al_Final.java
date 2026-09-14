import java.util.Scanner; //libreria de scanner

public class Array_Insersion_al_Final
 {
    public static void main(String[] args) 
    {
        // Definimos el Array 
        int[] Array = {40, 50, 60, 70, 80, 90};
        
        // Mostramos el array con un siclo for
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
        System.out.print("Que elemento desea agregar al final? : ");
        int elemento = scanner.nextInt();
        
        // Creamos un nuevo arreglo con una posición extra
        int[] nuevoArray = new int[Array.length + 1];
        
        // Copiamos los elementos anteriores
        for (int i = 0; i < Array.length; i++) 

        {
            nuevoArray[i] = Array[i];
        }
        
        // Colocamos el nuevo elemento al final
        nuevoArray[nuevoArray.length - 1] = elemento;
        
        // Reemplazamos el array viejo por el nuevo
        Array = nuevoArray;
        
        // Mostramos el resultado final manualmente
        System.out.print("Array despues de la insercion: ");
        for (int i = 0; i < Array.length; i++) 
        {
            System.out.print(Array[i]);
            if (i < Array.length - 1) 
            {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        
        scanner.close();
    }
    //ODIOOOOOOOOOOOOOOOOOO JAAAAAAAAAAAAVVVVVVVVVVAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!!!!!!!!!!!!!!!!!!!!!!!!!!!
}