public class Array_Recorrido_Secuencial 
{
    public static void main(String[] args) 
    {
        //Declaramos el array de una dimencion
      int[] Array = {40, 50, 60, 70, 80, 90};
        //Texto para guiar
        System.out.println("Recorrido secuencial del Array: ");
        System.out.println("Los Elementos del array son: ");
        //Siclo for para capturar los elementos
        for (int i = 0; i < Array.length; i++) 
        {
            //Aqui imprimimos los elementos UwU
            System.out.print(Array[i] + " ");
        }
    }
}
