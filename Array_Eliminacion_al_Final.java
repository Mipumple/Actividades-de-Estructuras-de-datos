public class Array_Eliminacion_al_Final 
{
    public static void main(String[] args) 
    {
        //Declaramos el array de una dimencion
      int[] Array = {40, 50, 60, 70, 80, 90};
      int n = Array.length;
        //Texto para guiar
        System.out.println("Array antes de la eliminacion: ");
        //Siclo for para capturar los elementos
        for (int i = 0; i < Array.length; i++) 
        {
            System.out.print(Array[i] + " ");
        }

        System.out.println();
        
        n--;

        System.out.println("Array despues de la eliminacion: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(Array[i] + " ");
        }
    }
}

    
