import java.util.Scanner;

public class Array_Eliminacion_Donde_Elija 
{
    public static void main(String[] args) 
    {
        // Definimos el arreglo nativo
        int[] Array = {40, 50, 60, 70, 80, 90};
        int n = Array.length;

        // Mostramos el Array antes del cambio
        System.out.println("Array antes de la eliminacion: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(Array[i] + (i < n - 1 ? "  " : ""));
        }
        System.out.println(" ");

        // Creamos el scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Preguntamos qué elemento quiere eliminar de 0 al 5 papu
        System.out.print("Que elemento deseas eliminar? (es del (0-5)) ");
        int elemento = scanner.nextInt();

        // Validamos y eliminamos desplazando los elementos simulando el comportamiento de splice
        if (elemento >= 0 && elemento < n) 

        {
            for (int i = elemento; i < n - 1; i++) 
            {
                Array[i] = Array[i + 1];
            }
            //Usamos la 'n' como en el otro codigo
            n--; 
            // Mostramos el Array despues de la eliminacion
            System.out.print("Array despues de la eliminacion: ");
            for (int i = 0; i < n; i++) 
            {
                System.out.print(Array[i] + (i < n - 1 ? "  " : ""));
            }
            System.out.println(" ");
        } 
        
        else 
         
        {
            System.out.println("El indice ingresado esta fuera de rango.");
        }

        scanner.close();
    }
    //ODDDDDIIIIIIIOOOOOOOOO JJJJJAAAAAAAAVAAAAAAAAAAAA!!!!!!!!!!!!!!!!!!!
}