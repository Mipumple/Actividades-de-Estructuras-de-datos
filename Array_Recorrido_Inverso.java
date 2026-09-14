public class Array_Recorrido_Inverso 

{
    public static void main(String[] args) 
    {
      //Declaramos el Array
      int[] Array = {40, 50, 60, 70, 80, 90};
        //Texto guia
        System.out.println("Recorrido inverso del Array: ");
        System.out.println("Los Elementos del array son: ");
        //Aqui en ves de comparar en 0 lo comparamos con el array y lo restamos para qeu valla retrosediendo
        //y vamos decrementando y se captura el Array
        for (int i = Array.length - 1; i >= 0; i--) 
        {
            //Se imprime el Array
            System.out.print(Array[i] + " ");
        }
    }
}
